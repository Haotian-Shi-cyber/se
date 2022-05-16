/* list of classes */
package assess2;

import java.util.*;

public class Loc {

    private ArrayList<Class> list;// class list
    private int max; // max number of classes
    private int nclasses; // number of classes
    
    /* construct loc */
    public Loc() {
        max = 10;
        list = new ArrayList<Class>(max);
        nclasses = 0;
    }

    /* add class into the list of class */
    public void add(Class classes){
        list.add(classes);
	}

    /* remove class */
    public void remove(Class classes) {
        list.remove(classes);
    }
    
    /* get one class obj by index */
    public Class get(int i) {
    	return list.get(i);
    }
    
    /* get size of class */
    public int getSize() {

        return nclasses;
    }

}
