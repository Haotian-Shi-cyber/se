/* list of classes  */
import java.io.*;

public class Loc {

    private Class[] list;
    private int i,max;

    public Loc() {
        max = 10;
        list = new Class[max];
        i = 0;
    }
    
    public void add(Class classes){
		list[i++] = classes;
	}

    public void remove(Class classes) {
        int	j;
        for (j = 0; j < i; j++)
            if (list[j] == classes)
                break;
        i--;
        for (; j < i; j++)
            list[j] = list[j+1];
    }
    
    public Class get(int i) {
    	return list[i];
    }
    
    public int getSize() {
    	return i;
    }

}
