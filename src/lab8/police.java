package lab8;

public class police extends Person{
    private String workCountry;

    ////constructor
    public police(String pID, String name, String yearBorn, String workCountry) {
        super(pID, name, yearBorn);
        this.workCountry = workCountry;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am police work at"+this.workCountry);
    }

    //getter and setter
    public String getWorkCountry() {
        return workCountry;
    }

    public void setWorkCountry(String workCountry) {
        this.workCountry = workCountry;
    }
}
