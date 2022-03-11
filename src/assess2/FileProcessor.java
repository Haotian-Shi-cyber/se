/* this class is used to process "teaching_requirements_and_teachers_list.json" file */
package assess2;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FileProcessor {
	
	private String path;// file path
	private JSONObject jsonObject;// JSON obj
	private JSONArray teacherArray;// teacherArray(JSONArray)
	private JSONArray classArray;// classArray(JSONArray)
	
	/* construct a file path */
	public FileProcessor(String path) {
		this.path = path;		
	};
	
	/* read our json file */
	public void read_file() throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		
		Reader reader = new FileReader(this.path);
			
		jsonObject = (JSONObject) parser.parse(reader);
		teacherArray = (JSONArray) jsonObject.get("teacher lists");
		classArray = (JSONArray) jsonObject.get("teaching requirements");
	}
	
	/* get teachers JSONarray obj*/
	public JSONArray get_teachers_array() {
		return teacherArray;
	}
	
	/* return classes JSONarray obj*/
	public JSONArray get_classes_array() {
		return classArray;
	}	
	
}
