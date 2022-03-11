/* base person class  */
package assess2;

public class Person {

    private String name;// person name

    /* construct this person name */
    public Person(String personName){
        this.name = personName;
    }
    
    /* return this person name */
    public String getName() {
        return this.name;
    }

}
