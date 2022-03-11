/* list of classes */
package assess2;

public class Loc {

    private Class[] list;// class list
    private int max; // max number of classes
    private int nclasses; // number of classes
    
    /* construct loc */
    public Loc() {
        max = 10;
        list = new Class[max];
        nclasses = 0;
    }

    /* add class into the list of class */
    public void add(Class classes){

        list[nclasses++] = classes;
	}

    /* remove class */
    public void remove(Class classes) {
        int	i;
        for (i = 0; i < nclasses; i++)
            if (list[i] == classes)
                break;
        nclasses--;
        for (; i < nclasses; i++)
            list[i] = list[i+1];
    }
    
    /* get one class obj by index */
    public Class get(int i) {
    	return list[i];
    }
    
    /* get size of class */
    public int getSize() {

        return nclasses;
    }

}
