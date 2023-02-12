package methodpractice;

public class Main {
    public static void main(String[] args) {
        var profile1 = new Profile();
        profile1.firstName = "Jerry";
        profile1.lastName = "Mack";
        profile1.location = "South Carolina";
        profile1.occupation = "Software Engineer";

        var myProfile = profile1.profile();

        var introduction1 = new Introduction();

        introduction1.timeOfDay = "Good Morning ";
        introduction1.guest = "Sir!";

        var myGreeting = introduction1.greeting();

        System.out.println(myGreeting + " " + myProfile);

//        var profile2 = new Profile();
//        profile2.firstName = "Marissa";
//        profile2.lastName = "Mack";
//        profile2.location = "South Carolina";
//        profile2.occupation = "Project Manager";
//
//        myProfile = profile2.profile();
//
//        var profile3 = new Profile();
//        profile3.firstName = "KJ";
//        profile3.lastName = "Mack";
//        profile3.location = "South Carolina";
//        profile3.occupation = "Baby Engineer";
//
//        myProfile = profile3.profile();

    }

}
