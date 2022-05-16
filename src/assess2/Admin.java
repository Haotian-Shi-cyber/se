package assess2;

import org.json.simple.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class Admin extends Person{

	private HashMap<String,String> map; // used to store result (teacher versus class match)
	private ArrayList<String> trainingList;// used to store teachers who are training
	
	/*Admin constructor to construct administrator name*/
	public Admin(String personName) {
		super(personName);
	}

	/* a private method to match teacher and class by calculating teaching scores*/
	private String find_suitable_staff(Class thisclass, Lot lot) {
		int list_size=lot.getTeacherNum();
		int index1 = 0;
		double highest_score = 0;
		
		ArrayList<Teacher> list = lot.getTeacherList();
		
		for(int i=0;i<list_size;i++){
			Teacher t = list.get(i);
			if(!Objects.equals(t.getMajor(), thisclass.getName())){
				continue;
			}
			double score=t.calScore();
			if (score > highest_score){
				highest_score = score;
				index1=i;
			}
		}
		return list.get(index1).getName();
		
	}
	
	/* a method called private method above to match all teachers to class */
	public void match_all(Loc classList, Lot teacherList) {
		String teachername;
		this.map = new HashMap<String, String>();
		trainingList = new ArrayList<String>();;
		
		for (int i = 0; i < classList.getSize(); i++) {
			String classname;
			
			teachername = this.find_suitable_staff(classList.get(i), teacherList);
			classname = classList.get(i).getName();
			trainingList.add(teachername);
			map.put(classname, teachername);
		
		}
	}
	
	/* get hashmap attribute */
	public HashMap<String,String> get_map() {
		return this.map;
	}

	/* generate result file */
	public void create_file() throws IOException {
		JSONObject result = new JSONObject(this.map);
		FileWriter file = new FileWriter("result.json");
        file.write(result.toJSONString());
        file.close();
	}
	
	/* set teachers training status */
	public void set_training(Lot teacherList) {	
		for(int i = 0; i < map.size();i++) {
			Teacher t = teacherList.find(trainingList.get(i));
			t.setTraining();
		}
	}
	
	/* get training list */
	public ArrayList<String> get_trainingList() {
		return this.trainingList;
	}

}
