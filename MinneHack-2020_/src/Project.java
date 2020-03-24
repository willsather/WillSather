public class Project {

    // Class Variables //
    private String name;
    private User owner;
    private String city;
    private String description;
    private String date;
    private String time;

    private int age;


    // Constructor //
    public Project(String Name, User Owner, String City, String Description, String Date, String Time)
    {
        this.name = Name;
        this.owner = Owner;
        this.city = City;
        this.description = Description;
        this.date = Date;
        this.time = Time;
    }

    // Methods //

    public String getName() { return this.name; }
    public void setName(String Name) { this.name = Name; }


    public User getOwner() { return this.owner; }
    public void setOwner(String Owner) { this.name = Owner; }


    public String getCity() { return this.city; }
    public void setCity(String City) { this.city = City; }


    public String getDescription() { return this.description; }
    public void setDescription (int description) { this.age = description; }


    public String getDate() { return this.date; }
    public void setDate(String Date) { this.date = Date; }


    public String getTime() { return this.time; }
    public void setTime(String Time) { this.time = Time; }


    public String toString() { return this.name;}

}



