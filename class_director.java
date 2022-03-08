import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class class_director extends Person{
	
	private Loc classList;
	private Lot teacherList;
	
	public class_director(String personName,String teachermajor) {
		super(personName, teachermajor);
	}
	
	public void add_all_staff(JSONArray teacherArray) throws Lopx {
		this.teacherList = new Lot();
		for (int i = 0; i < teacherArray.size(); i++) {
			JSONObject tmp = (JSONObject) teacherArray.get(i);
			Teacher teacher = new Teacher((String)tmp.get("name"),(String)tmp.get("major"),(int)(long)tmp.get("teaching_year"), 
										(int)(long)tmp.get("course_on_charge"),(int)(long)tmp.get("student_rating"));
			teacherList.addTeacher(teacher);
		}		
	}
	
	public void add_all_class(JSONArray classArray) {
		this.classList = new Loc();
		for (int i = 0; i < classArray.size(); i++) {
			JSONObject tmp = (JSONObject) classArray.get(i);
			Class classobj = new Class((String)tmp.get("classname"), (String)tmp.get("college"));
			classList.add(classobj);
		}
	}
	
	public Loc get_classList() {
		return this.classList;
	}
	
	public Lot get_teacherList() {
		return this.teacherList;
	}
}
