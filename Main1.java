import java.io.IOException;


import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class Main1 {

	public static void main(String[] args) throws Lopx, IOException, ParseException	{
		
		FileProcessor file = new FileProcessor("./teaching_requirements_and_teachers_list.json"); // read JSON file
		file.read_file(); //parse it
		JSONArray teacherArray = file.get_teachers_array(); // get teaching requirements from file
		JSONArray classArray = file.get_classes_array(); // get teacher lists from file
		
		System.out.println("print teacherArray: " + teacherArray);
		System.out.println("print classArray: " + classArray);
		
		class_director Alice = new class_director("class_director","major"); // Alice is the class director
		Alice.add_all_staff(teacherArray); // add all staff to list
		Alice.add_all_class(classArray); // add all class to list
		
		Admin Bob = new Admin("admin","major"); // Bob is the administrator
		Bob.match_all(Alice.get_classList(), Alice.get_teacherList()); // find all suitable staff for all class
		Bob.create_file(); // create a new file containing teacher versus class
		Bob.set_training(Alice.get_teacherList()); // set training for staff
		
		System.out.println("print created file: " + Bob.get_map());
		System.out.println("print training list: " + Bob.get_trainingList());
		System.out.println("good night");
	}
	
}
