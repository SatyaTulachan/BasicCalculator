import java.util.Scanner;
public class pract {
    public static void main(String[]args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your age:");
        int age= scanner.nextInt();

        System.out.println("Enter you fav color:");
        String color= scanner.next();

        System.out.println("Your age is "+age+" "+"years old");
        System.out.println("Your favorite color is "+ color);


        scanner.close();
    }
}
