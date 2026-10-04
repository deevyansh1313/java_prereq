public class variables {
    public static void main(String[] args) {
        /*
        primitive variables : simple values like int, float, char, boolean, double, long, short, byte directly stored in stack memory  # means directly giviing rs 100 to someone
        
        non-primitive variables/ refrence varibales : complex values like String, Array, Class, Interface, Object stored in heap memory # means instead of ging rs 100 giving adress of bank account where rs 100 is stored

        */

        // declaring primitive variables
        int a = 10; // integer variable
        float b = 20.5f; // float variable
        char c = 'A'; // character variable
        boolean d = true; // boolean variable
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        int age = 23;
        System.out.println("My age is: " + age);

        double cgpa = 8.5;
        System.out.println("My cgpa is: " + cgpa);

        char grade = 'A';
        char symbol = '@';
        char currency = '$';
        System.out.println("My grade is: " + grade);    
        System.out.println("My symbol is: " + symbol);
        System.out.println("My currency is: " + currency);
        
        boolean isStudent = true;
        boolean isEmployed = false; // this is camel case notation where first word is small and second word is capital letter
        System.out.println("Am I a student? " + isStudent);
        System.out.println("Am I employed? " + isEmployed);

        // use case of boolean variable
        if(isStudent == true) {  /*with true without true also works because isStudent is already a boolean variable The if statement by default is always looking for a true condition.
        You can think of an if statement as a gatekeeper that only opens if the final answer inside the parentheses is true.
        */
            System.out.println("I am a student.");
        } else {
            System.out.println("I am not a student.");
        }  

        String name = "Deevyansh"; // non-primitive variable
        System.out.println("My name is: " + name);
        String email = "deevyansh1313@gmail.com";
        System.out.println("My email is: " + email);

        System.out.println("Hello " + name + ", your email is: " + email);

        System.out.println("Hello " + name + ", your email is: " + email + ", your age is: " + age + ", your cgpa is: " + cgpa + ", your grade is: " + grade + ", your symbol is: " + symbol + ", your currency is: " + currency + ", are you a student? " + isStudent + ", are you employed? " + isEmployed);

        System.out.println("ur name and email are : " + name + " " + email);

        

    }
        
}
