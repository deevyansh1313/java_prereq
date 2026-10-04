import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); // nextLine() method is used to read a line of text from the user input it reads the entire line including spaces until the user presses Enter key. It returns a String value.
        System.out.println("Hello " + name + ", welcome to Java programming!");

        // to read an integer input from the user
        System.out.println("Enter your age: ");
        int age = sc.nextInt(); // nextInt() method is used to read an integer value from the user input. It reads the next token of input as an integer. It returns an int value.
        System.out.println("You are " + age + " years old.");

        float ftp = sc.nextFloat(); // nextFloat() method is used to read a float value from the user input. It reads the next token of input as a float. It returns a float value.       
        System.out.println("You entered: " + ftp);
        sc.close();

    }
}
