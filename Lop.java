
/* list of people */
public class Lop{
    
    private Person[] list;
    private int i, max;

    public Lop() {
        list  = new Person[max];
    }

    public Person find(String personName) {
        for(int j = 0; j < i; j++)
            if(list[j].getName().equals(personName))
                return list[j];
        return null;
    }


}
