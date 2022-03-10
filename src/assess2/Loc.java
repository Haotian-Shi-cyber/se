package assess2;/* list of classes  */

public class Loc {

    private Class[] list;
    private int max;
    private int nclasses;

    public Loc() {
        max = 10;
        list = new Class[max];
        nclasses = 0;
    }

    //add class into the list of class
    public void add(Class classes){

        list[nclasses++] = classes;
	}

    //remove class
    public void remove(Class classes) {
        int	i;
        for (i = 0; i < nclasses; i++)
            if (list[i] == classes)
                break;
        nclasses--;
        for (; i < nclasses; i++)
            list[i] = list[i+1];
    }
    
    public Class get(int i) {
    	return list[i];
    }
    
    public int getSize() {

        return nclasses;
    }

}
