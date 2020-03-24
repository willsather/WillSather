import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner reader = new Scanner(System.in);

        //Create variables for different traits for the person

        String name;
        int age;
        String city;
        String email;

        // User & Project 1
        User JamesMoen = new User("James Moen", 60,"moen0017@umn.edu");

        Project project1 = new Project("Minnehaha Senior Living",
                JamesMoen,
                "Minneapolis",
                "Come to serve food, play cards, and clean up at an elderly care facility.",
                "2-15-2020",
                "5:30 PM");


        // User & Project 2
        User ChrisKauffman = new User("Chris Kauffman", 44, "kauffman@umn.edu");

        Project project2 = new Project("PROP Food Shop",
                ChrisKauffman,
                "Minneapolis",
                "Help organize and pack non-perishable foods to help locals.",
                "2-1-2020",
                "12:00 PM");


        // User & Project 3
        User DanChallou = new User("Dan Challou", 60, "chal0006@umn.edu");

        Project project3 = new Project("Feed My Starving Children",
                DanChallou,
                "Minneapolis",
                "Come join the UMN CSCI Professors to pack meals for international poverty!",
                "2-4-2020",
                "7:00 PM");


        // User & Project 4
        User NathanTaylor = new User("Nathan Taylor", 44, "taylo740@umn.edu");

        Project project4 = new Project("People Serving People",
                NathanTaylor,
                "Minneapolis",
                "Volunteer at a Minneapolis shelter by serving food, organizing, and just socializing with people.",
                "2-1-2020",
                "12:00 PM");


        // User & Project 5
        User ChrisDovolis = new User("Chris Dovolis", 44, "taylo740@umn.edu");

        Project project5 = new Project("Lakes & Legends",
                ChrisDovolis,
                "Minneapolis",
                "Volunteer at a UMN Hockey tournament led by Interfraternity Council where students play students to raise money!",
                "2-8-2020",
                "3:00 PM");

        Project projects[] = {project1, project2, project3, project4, project5};

        //Welcome screen
        System.out.println("Welcome to ~Transformity~");
        System.out.println("Let's get you started with a profile!\n");

        //User inputs their information
        System.out.println("Please enter your name: ");
        name = reader.nextLine();

        System.out.println("Please enter your email address: ");
        email = reader.nextLine();

        System.out.println("Please enter your age: ");
        age = reader.nextInt();




        //Create type User with traits
        User newUser = new User(name, age, email);

        //Print out the users information
        System.out.println("\n\n\nGreat, now you have a profile!");
        System.out.println("Name: " + newUser.getName());
        System.out.println("Age: " + newUser.getAge());
        System.out.println("Email: " + newUser.getEmail());

        System.out.println("\n\nAlright, let's get started");

        System.out.println("\nSwipe through the projects to find one that you like!\n");

        boolean choose = true;
        char choice;

        int i = 0;
        while (choose) {
            System.out.println(projects[i].getName() + "\n" +
                    projects[i].getOwner() + "\n" +
                    projects[i].getCity() + "\n" +
                    projects[i].getDate() + " at " +
                    projects[i].getTime());

            System.out.println("Yes or No (Y/N): ");
            choice = reader.next().charAt(0);

            if (choice == 'N' || choice == 'n') {
                i++;
                System.out.println("\n\n");

            } else {
                choose = false;
            }


        }

        Project selProject = projects[i];

        System.out.println("\n\nHere is the information on the project you selected: \n");

        System.out.println(selProject.getName() + "\n" +
                selProject.getOwner() + "\n" +
                selProject.getCity() + "\n" +
                selProject.getDescription() + "\n" +
                selProject.getDate() + " at " +
                selProject.getTime());


    }



}
