import org.json.simple.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;


public class Admin extends Person{

	private HashMap<String,String> map;
	private ArrayList<String> trainingList;

	public Admin(String personName,String teachermajor) {
		super(personName, teachermajor);
	}


	private String find_suitable_staff(Class thisclass, Lot lot) {// this function return the target teacher name
		int list_size=lot.getTeacherNum();
		int index1 = 0;
		double highest_score = 0;
		
		Teacher[] list = lot.getTeacherList();
		
		for(int i=0;i<list_size;i++){
			Teacher t=list[i];
			if(!Objects.equals(t.getMajor(), thisclass.getName())){
				continue;
			}
			double score=t.calScore();
			if (score > highest_score){
				highest_score = score;
				index1=i;
			}
		}
		return list[index1].getName();
		
	}

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

	public HashMap<String,String> get_map() {
		return this.map;
	}


	public void create_file() throws IOException {
		JSONObject result = new JSONObject(this.map);
		FileWriter file = new FileWriter("./result.json");
        file.write(result.toJSONString());
        file.close();
	}
	
	public void set_training(Lot teacherList) {	
		for(int i = 0; i < map.size();i++) {
			Teacher t = teacherList.find(trainingList.get(i));
			t.setTraining();
		}
	}
	
	public ArrayList<String> get_trainingList() {
		return this.trainingList;
	}

}
