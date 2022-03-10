package assess2;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FileProcessor {
	
	private String path;
	private JSONObject jsonObject;
	private JSONArray teacherArray;
	private JSONArray classArray;
	
	public FileProcessor(String path) {
		this.path = path;		
	};
	
	public void read_file() throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		
		Reader reader = new FileReader(this.path);
			
		jsonObject = (JSONObject) parser.parse(reader);
		teacherArray = (JSONArray) jsonObject.get("teacher lists");
		classArray = (JSONArray) jsonObject.get("teaching requirements");
	}
	
	public JSONArray get_teachers_array() {
		return teacherArray;
	}
	
	public JSONArray get_classes_array() {
		return classArray;
	}	
	
}
