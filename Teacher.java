public class Teacher {

    private String name;
    pirvate String major;
    private int teaching_year;
    private int course_num;  //this represent how many course currently 
    private int student_rating;

    public Teacher(String personName) {
        this.name = personName;
    }

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
