
public class Class {

    private String name;
    private String college;
    private Teacher teacher;

    //Constructor
    public Class(String className, String classCollege) {
        this.name = className;
        this.college = classCollege;
    }

    //Get class name and college
    public String getName() {
        return this.name;
	}
    public String getCollege() {
        return this.college;
	}

    public Teacher get_teacher()
    {
        return teacher;
    }

    public void set_teacher(Teacher teacher)
    {
        this.teacher = teacher;
    }

}
