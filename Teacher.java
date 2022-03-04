public class Teacher {

    private String name;
    private String major;
    private int year;
    private int num;  //this represent how many course currently 
    private int rating;
    private boolean training = false;
    
    public Teacher(String personName,String teachermajor,int teaching_year,int course_num,int student_rating) {
        this.name = personName;
        this.major= teachermajor;
        this.year=teaching_year;
        this.num=course_num;
        this.rating=student_rating;
    }
    
    public String getMajor(){
        return this.major;
    }
    
    public String getName() {
        return this.name;
    }
        
    public int calScore(){
        int experience_score=0;
        int stress_score=0;
        int satisfication_score=0;
        if (year>10)
            experience_score=10;
        else
            experience_score=year;
        if (num>=3)
            stress_score=0;
        else 
            stress_score=(3-num)*3;
        stress_score=rating;
        int total_score=0.5*stress_score+0.2*experience_score+0.3*rating;
        return total_score;
    }
}
