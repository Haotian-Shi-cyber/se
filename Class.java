import java.io.*;


public class Class {
    
    private String name;
    private String college;

    public Class(String className, String classCollege) {
        this.name = className;
        this.college = classCollege;
    }


    public String getName() {
        return this.name;
	}
    public String getCollege() {
        return this.college;
	}

}