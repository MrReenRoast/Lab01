import java.util.Calendar;

public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String Title;
    private int YOB;

    public Person(String ID, String firstName, String lastName, String Title, int YOB){
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Title = Title;
        this.YOB = YOB;
    }

    public String getID(){
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }
    public String formalName() {
        return Title + " " + fullName();
    }
    public String getAge() {
        Calendar calendar = java.util.Calendar.getInstance();
        int currentYear = calendar.get(java.util.Calendar.YEAR);
        return String.valueOf(currentYear - YOB);
    }
    public String getAge(int year) {
        return (String.valueOf(year - YOB));
    }
    public String toCSV(){
        return ID + ", " + firstName + ", " + lastName + ", " + Title + ", " + YOB;
    }
    public String toJSON(){
        String retString = "";
        char DQ = '"';
        retString =  "{" + DQ + "IDNum" + DQ + ":" + DQ + this.ID + DQ + ",";
        retString += DQ + "firstName" + DQ + ":" + DQ + this.firstName + DQ + ",";
        retString += " " + DQ + "lastName"  + DQ + ":" + DQ + this.lastName + DQ + ",";
        retString += " " + DQ + "Title"  + DQ + ":" + DQ + this.Title + DQ + ",";
        retString += " " + DQ + "YOB"  + DQ + ":" + this.YOB + "}";

        return retString;
    }
    public String toXML(){
        String retString = "";

        retString = "<Person>" + "<IDNum>" + this.ID + "</IDNum>";
        retString += "<firstName>" + this.firstName + "</firstName>";
        retString += "<lastName>" + this.lastName + "</lastName>";
        retString += "<Title>" + this.Title + "</Title>";
        retString += "<YOB>" + this.YOB + "</YOB></Person>";

        return retString;
    }
}