public class Teacher {

    private String name;
    private String major;
    private int teaching_year;
    private int course_num;  //this represent how many course currently 
    private int student_rating;

    public Teacher(String personName,String major,int teaching_year,int course_num,int student_rating) {
        name = personName;
        major= major;
        teaching_year=teaching_year;
        course_num=course_num;
        student_rating=student_rating;
    }
    public String getMajor(){
        return this.major;
        
    public String getName() {
        return this.name;
    }
        
    public int calScore(){
        int experience_score=0;
        int stress_score=0;
        int satisfication_score=0;
        if (teaching_year>10)
            experience_score=10;
        else
            experience_score=teaching_year;
        if (course_num>=3)
            stress_score=0;
        else 
            stress_score=(3-course_num)*3;
        stress_score=student_rating;
        int total_score=0.5*stress_score+0.2*experience_score+0.3*satisfication;
        return total_score;

}
