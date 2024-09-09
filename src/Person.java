import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class Person {
    String ID = "";
    String firstName = "";
    String lastName = "";
    String Title = "";
    int YOB = 0;
    private ClassValue<Object> Calendar;

    public String fullName() {
        return firstName + " " + lastName;
    }
    public String formalName() {
        return Title + " " + fullName();
    }
    public String getAge() {
        return Calendar.get(Calendar.YEAR) - YOB;
    }
    public String getAge(int year) {
        return (String.valueOf(year - YOB));
    }
    public String toCSV(){
        return ID + "," + firstName + "," + lastName + "," + Title + "," + YOB;
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