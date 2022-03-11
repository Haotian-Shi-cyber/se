package assess2;

public class Teacher extends Person{

    private int year; // teaching years
    private int num; // this represents how many course currently
    private int rating; // rating from students feedback
    private String teachermajor; // teaching course
    private boolean training = false; // training status default is false
    private Class classes; // set teacher to teach specific class
    
    /* construct teacher attribute */
    public Teacher(String personName,String teachermajor,int teaching_year,int course_num,int student_rating) {
        super(personName);
        this.teachermajor = teachermajor;
        this.year=teaching_year;
        this.num=course_num;
        this.rating=student_rating;
    }

    /* Returns a string representation of teacher. */
    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    
    /* calculate teacher's total score */
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
    
    /* return class which this teacher is responsible for */
    public Class get_classes(){
        return classes;
    }
    
    /* set class to this teacher */
    private void set_classes(Class classes){
        this.classes = classes;
    }

    /* return training status */
    public boolean isTraining() {
        return training;
    }
    
    /* set training status to true */
    public void setTraining() {

        this.training = true;
    }
    
    /* get teacher major */
	public String getMajor() {
		return this.teachermajor;
	}

}
