
public class Lot{
    
    private Teacher[] list;
    private int nteachers;
    private static int max_teachers=100;
    
    public Lot() {
        list  = new Teacher[max_teachers];
        nteachers=0;
    }
    
    public int getTeacherNum(){
        return nteachers;
    }
    
    public void addTeacher(Teacher teacher) throws Lopx{
	if (nteachers >= max_teachers)
			throw new Lopx(max_teachers);
        list[nteachers++]=teacher;
    }
    
    public Teacher find(String personName) {
        for(int j = 0; j < nteachers; j++)
            if(list[j].getName().equals(personName))
                return list[j];
        return null;
    }
    
    public Teacher[] getTeacherList() {
    	return list;
    }

}
