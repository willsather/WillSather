public class User {

    // Class Variables //
    private String name;
    private String email;

    private int age;


    // Constructors //
    public User(String Name, int Age, String Email)
    {
        this.name = Name;
        this.age = Age;
        this.email = Email;
    }

    // Methods //

    public String getName()
    {
        return this.name;
    }
    public void setName(String theName)
    {
        this.name = theName;
    }


    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }


    public String getEmail()
    {
        return this.email;
    }
    public void setEmail(String Email)
    {
        this.email = Email;
    }

    public String toString() { return this.name;}

}
