package assess2;

public class Class {

    private String name; // class name
    private String college;// college name
    private Teacher teacher;// teacher obj who is charge for this class

    /* constructor a class obj */
    public Class(String className, String classCollege) {
        this.name = className;
        this.college = classCollege;
    }

    /* get class name */
    public String getName() {
        return this.name;
	}
    
    /* get class's college name */
    public String getCollege() {
        return this.college;
	}

    /* get teacher obj */
    public Teacher get_teacher()
    {
        return teacher;
    }

    /* set teacher obj to this class */
    public void set_teacher(Teacher teacher)
    {
        this.teacher = teacher;
    }

}
