import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        String firstName = "Pool";
//        String lastName = "Meow";
//        String name = firstName + " " + lastName;
//        System.out.println(name);
//        float num1 = 2;
//        float num2 = 4;
//        System.out.println(num1+num2);
//        float result = num1/num2;
//        System.out.println(result);
//        int num3 = 8;
//        System.out.println(num3++);
//        System.out.println(num3);
//        System.out.println(++num3);
        Scanner s = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = s.nextLine();
        System.out.println("What is your last name?");
        String lastName = s.nextLine();
        System.out.println("Hello " + firstName + " " + lastName);

        System.out.println(firstName+", pick a number:");
        int val1 = s.nextInt();
        System.out.println("Pick a second number: ");
        int val2 = s.nextInt();
        System.out.println("The sum of the two numbers is: " + (val1+val2));
    }

}