import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.HashMap;


public class Admin{
	
	private JSONObject jsonObject;
	private JSONArray teacherArray;
	private JSONArray classArray;
	private HashMap<String,String> map;
	private Lot teacherList;
	private Loc classList;
	
	public void read_file() throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		
		Reader reader = new FileReader("./teaching_requirements_and_teachers_list.json");
			
		jsonObject = (JSONObject) parser.parse(reader);
	}

	public void add_staff() throws Lopx {
		Lot teacherList = new Lot();
		
		teacherArray = (JSONArray) jsonObject.get("teacher lists"); // get teacher array 
		
		for (int i = 0; i < teacherArray.size(); i++) {
			JSONObject tmp = (JSONObject) teacherArray.get(i);
			Teacher teacher = new Teacher((String)tmp.get("name"),(String)tmp.get("major"),(int)tmp.get("teaching_year"), 
										(int)tmp.get("course_on_charge"),(int)tmp.get("student_rating"));
			teacherList.addTeacher(teacher);
		}		
	}
	
	public void add_class() {
		Loc classList = new Loc();
		
		classArray = (JSONArray) jsonObject.get("teaching requirements");
		
		for (int i = 0; i < classArray.size(); i++) {
			JSONObject tmp = (JSONObject) classArray.get(i);
			Class classobj = new Class((String)tmp.get("classname"), (String)tmp.get("college"));
			classList.add(classobj);
		}
	}
	
	
	private String find_suitable_staff(Class thisclass, Lot lot) {// this function return the target teacher name
		int list_size=lot.getTeacherNum();
		int index1 = 0;
		int highest_score = 0;
		
		Teacher[] list = lot.getTeacherList();
		
		for(int i=0;i<list_size;i++){
			Teacher t=list[i];
			if(t.getMajor()!= thisclass.getCollege()){
				continue;
			}
			int score=t.calScore();
			if (score > highest_score){
				highest_score= score;
				index1=i;
			}
		}
		return list[index1].getName();
		
	}
	
	private void match() {
		String teachername;
		HashMap<String,String> map = new HashMap<String, String>();
		
		for (int i = 0; i < classList.getSize(); i++) {
			String classname;
			
			teachername = find_suitable_staff(classList.get(i), teacherList);
			classname = classList.get(i).getName();
			map.put(classname, teachername);
		}
	}
	
	public void create_file() throws IOException {
		JSONObject result = new JSONObject(map);
		FileWriter file = new FileWriter("./result.json");
        file.write(result.toJSONString());
        file.close();
	}
	
	
	public void main(String[] args) throws IOException, ParseException, Lopx{
		
		read_file();
		add_staff();
		add_class();
		match();
		create_file();		
	}
		
}
