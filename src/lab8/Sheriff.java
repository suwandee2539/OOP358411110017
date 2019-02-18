package lab8;

public class Sheriff extends Person{
    private String workState;

    //constructor
    public Sheriff(String pID, String name, String yearBorn, String workState) {
        super(pID, name, yearBorn);
        this.workState = workState;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I work at"+this.workState);
    }

    //getter and setter method
    public String getWorkState() {
        return workState;
    }

    public void setWorkState(String workState) {
        this.workState = workState;
    }
}
