package methodpractice;

public class Profile {
        public String firstName;
        public String lastName;
        public String location;
        public String occupation;

    public String profile() {
        return "My name is " + firstName + " " + lastName + "! " + "I'm a " + occupation + " and I currently live in " + location + ".";
    }
}