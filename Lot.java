
/* list of people */
public class Lot{
    
    private Teacher[] list;
    private int i, max;

    public Lot() {
        list  = new Teacher[max];
    }
    
    public 

    public Teacher find(String personName) {
        for(int j = 0; j < i; j++)
            if(list[j].getName().equals(personName))
                return list[j];
        return null;
    }


}
