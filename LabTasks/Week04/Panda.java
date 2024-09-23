/* Task 02
The Giant Panda Protection and Research Center in the Sichuan province of southwest China, 
actually employs a category of workers known as panda nannies. The primary responsibility is 
to play with adorable panda cubs and name them, determine gender, 
keep track of their age and hours they sleep. So being a programmer panda nanny, 
you will create a code that will do all these works for you. 

1. Create a class named Panda and also write the constructor.
2. Access the instance attributes and System.out.println them in the given format.
3. Call instance methods to keep track of their daily hours of sleep.
4. Suppose consulting with other panda nannies you have set some criteria based 
on which you will make their diet plans. The criteria are:
    * Mixed Veggies for pandas having 3 to 5 hours (included) of sleep daily. 
    * Eggplant & Tofu for pandas having 6 to 8 hours (included) of sleep daily. 
    * Broccoli Chicken for pandas having 9 to 11 hours (included) of sleep daily. 
    * Lastly if no arguments are passed then just give it bamboo leaves. 
Now handle this problem modifying the method designed to keep track of their daily 
hours of sleep and determine diet plan using method overloading.
 */

public class Panda {

    String name;
    String gender;
    int age;

    public Panda(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String sleep(int hours) {
        String diet = "";
        if (hours >= 3 && hours <= 5) {
            diet = "Mixed Veggies";
        } else if (hours >= 6 && hours <= 8) {
            diet = "Eggplant & Tofu";
        } else if (hours >= 9 && hours <= 11) {
            diet = "Broccoli Chicken";
        } else {
            diet = "Unknown Diet";
        }
        return name + " sleeps " + hours + " hours daily and should have " + diet;
    }

    public String sleep() {
        return name + " has an unknown sleep duration and should have bamboo leaves";
    }

    public static void main(String[] args) {
        Panda panda1 = new Panda("Kunfu", "Male", 5);
        Panda panda2 = new Panda("Pan Pan", "Female", 3);
        Panda panda3 = new Panda("Ming Ming", "Female", 8);

        System.out.println(panda1.name + " is a " + panda1.gender + " Panda Bear who is " + panda1.age + " years old");
        System.out.println(panda2.name + " is a " + panda2.gender + " Panda Bear who is " + panda2.age + " years old");
        System.out.println(panda3.name + " is a " + panda3.gender + " Panda Bear who is " + panda3.age + " years old");
        System.out.println("===========================");

        System.out.println(panda2.sleep(10));
        System.out.println(panda1.sleep(4));
        System.out.println(panda3.sleep());
    }
}
