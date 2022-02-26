
public class ClassDirector extends Class {
    
    private Loc classes;
    
    public ClassDirector(String name, String requirements) {
        super(name, requirements);
        classes = new Loc();
    }

    
}
