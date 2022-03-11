/* Lot class */
package assess2;

public class Lot{
    
    private Teacher[] list;// teacher list
    private int nteachers;// number of teachers
    private int max_teachers=100;// max number of teachers
    
    /* construct Lot class */
    public Lot() {
        list  = new Teacher[max_teachers];
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
        list[nteachers++]=teacher;
    }
    
    /* find teacher by index */
    public Teacher find(String personName) {
        for(int j = 0; j < nteachers; j++)
            if(list[j].getName().equals(personName))
                return list[j];
        return null;
    }
    
    /* get list of teacher */
    public Teacher[] getTeacherList() {
    	return list;
    }
    
    /* get max number of teachers */
    public int get_maxTeachers() {
    	return this.max_teachers;
    }

}
