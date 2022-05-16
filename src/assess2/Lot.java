/* Lot class */
package assess2;
import java.util.*;

public class Lot{
    
    private ArrayList<Teacher> list;// teacher list
    private int nteachers;// number of teachers
    private int max_teachers=100;// max number of teachers
    
    /* construct Lot class */
    public Lot() {
        list = new ArrayList<Teacher>(max_teachers);
        nteachers=0;
    }
    
    /* get number of teachers */
    public int getTeacherNum(){
        return nteachers;
    }
    
    /* add teacher to list */
    public void addTeacher(Teacher teacher) throws Lopx{
		if (nteachers >= max_teachers)
			throw new Lopx(max_teachers);
        list.add(teacher);
    }
    
    /* find teacher by index */
    public Teacher find(String personName) {
        Iterator<Teacher> i = list.iterator();
        Teacher obj;
        /*
        for(int j = 0; j < nteachers; j++)
            if(list[j].getName().equals(personName))
                return list[j];*/
        /* usage of iterator below */
        while(true) {
            obj = i.next();
            if(obj == null)
                break;
            if(obj.getName().equals(personName))
                return obj;
        }
        return null;
    }
    
    /* get list of teacher */
    public ArrayList<Teacher> getTeacherList() {
    	return list;
    }
    
    /* get max number of teachers */
    public int get_maxTeachers() {
    	return this.max_teachers;
    }

}
