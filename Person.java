
public class Person {

    private String name;
    private String major;

    public Person(String personName,String teachermajor){
        this.name = personName;
        this.major= teachermajor;
    }

    public String getMajor(){

        return this.major;
    }
    public String getName() {

        return this.name;
    }

}
