import java.util.Calendar;

public class Product {
    private String name;
    private String description;
    private String ID;
    private double cost;

    public Product(String ID, String firstName, String lastName, String Title, int YOB){
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.cost = cost;
    }

    public Product(String id, String name, String desc, double cost) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getID(){
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String toCSV(){
        return name + "," + description + "," + ID + "," + cost;
    }
    public String toJSON(){
        String retString = "";
        char DQ = '"';
        retString =  "{" + DQ + "name" + DQ + ":" + DQ + this.name + DQ + ",";
        retString += DQ + "description" + DQ + ":" + DQ + this.description + DQ + ",";
        retString += " " + DQ + "ID"  + DQ + ":" + DQ + this.ID + DQ + ",";
        retString += " " + DQ + "cost"  + DQ + ":" + DQ + this.cost + DQ + ",";

        return retString;
    }
    public String toXML(){
        String retString = "";

        retString = "<Product>" + "<name>" + this.name + "</name>";
        retString += "<description>" + this.description + "</description>";
        retString += "<ID>" + this.ID + "</ID>";
        retString += "<cost>" + this.cost + "</cost></Product>";

        return retString;
    }
}