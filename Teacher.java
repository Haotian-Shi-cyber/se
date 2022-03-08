public class Teacher extends Person{

    private int year;
    private int num;  //this represents how many course currently
    private int rating;
    private boolean training = false;
    private Class classes;

    public Teacher(String personName,String teachermajor,int teaching_year,int course_num,int student_rating) {
        super(personName,teachermajor);
        this.year=teaching_year;
        this.num=course_num;
        this.rating=student_rating;
    }

    //Returns a string representation of teacher.
    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    public double calScore(){
        double experience_score=0;
        double stress_score=0;
        int satisfication_score=0;
        if (year>10)
            experience_score=10;
        else
            experience_score=this.year;
        if (num>=3)
            stress_score=0;
        else
            stress_score=(3-this.num)*3;
        satisfication_score=rating;
        double total_score=0.5*stress_score+0.2*experience_score+0.3*satisfication_score;
        return total_score;
    }
    //Add class in teacher object
    public Class get_classes()
    {
        return classes;
    }

    private void set_classes(Class classes)
    {
        this.classes = classes;
    }


    public boolean isTraining() {

        return training;
    }

    public void setTraining() {

        this.training = true;
    }



}
