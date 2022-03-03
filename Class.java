public class Class{

    private String name;
    private String college;

    public Class(String className, String classCollege) {
        this.name = claasName;
        this.college = classCollege;
    }
    public void print(PrintStream cs, Class class)	{
		cs.print(String.format("name: %s", class.name));	
		cs.print(String.format("college: %s", class.college));
	}
    public String getName() {
		return this.name;
	}
    public String getCollege() {
		return this.college;
	}

}