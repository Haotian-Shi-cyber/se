import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;


public class Admin{
	
	private static JSONObject jsonObject;
	private static JSONArray teacherArray;
	private static JSONArray classArray;
	
	public static void read_file() throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		
		Reader reader = new FileReader("./teaching_requirements_and_teachers_list.json");
			
		jsonObject = (JSONObject) parser.parse(reader);
	}

	public static void add_staff() {
		Lot teacherList = new Lot();
		
		teacherArray = (JSONArray) jsonObject.get("teacher lists"); // get teacher array 
		
		for (int i = 0; i < teacherArray.size(); i++) {
			JSONObject tmp = (JSONObject) teacherArray.get(i);
			Teacher teacher = new Teacher(tmp.get("name"), tmp.get("major"));
			teacherList.add(teacher);
		}
		
	}
	
	public static void add_class() {
		Loc classList = new Loc();
		
		classArray = (JSONArray) jsonObject.get("teaching requirements");
		
		for (int i = 0; i < classArray.size(); i++) {
			JSONObject tmp = (JSONObject) classArray.get(i);
			Class classobj = new Class(tmp.get("classname"), tmp.get("requirements"));
			classList.add(teacher);
		}
	}
	
	
	public static String find_suitable_staff(Calss class,Lot lot) {// this function return the target teacher name
		int list_size=lot.getTeacherNum;
		String target_teacher;
		int index;
		int highest_score;
		for(int i=0,index=i;i<list_size;i++){
			Teacher t=lot[i];
			if(t.getMajor()!=class.getCollege()){
				continue;
			}
			int score=t.calScore();
			if (score > highest_score){
				highest_score= score;
				index=i;
			}
		}
		return lot[index].getName;
		
	}
	
	public static void create_file() {
		
	}
	
	public static void main(String[] args) throws IOException, ParseException{
		
		read_file();
		add_staff();
		add_class();
		find_suitable_staff();
		create_file();
		
		
	}
	
	
}
	
