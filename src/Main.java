///*public class Main {
//
//    public static void main(String[]args){
//
//        System.out.print("I love momo\n");
//        System.out.println("It is delicious!!");
//        System.out.println("shortty");
//
//    }
//}
//
// */
//
///*
//public class Main {
//
//    public static void main(String[]args){
//        int year=2025;
//        int age=20;
//        System.out.println("The year is "+year);
//
//        double price=19.99;
//        System.out.println("The price is "+price);
//
//        char grade='A';
//        char symbol='!';
//        System.out.println(symbol);
//
//        boolean isStudent= true;
//        boolean forSale=false;
//        System.out.println(isStudent);
//        System.out.println(forSale);
//
//
//        String name="Satya";
//        String email="tulachansatya@gmail.com";
//        System.out.println("Your email is: "+email);
//        System.out.println("Hello"+name);
//
//        String color="blue";
//        String car="ferrari";
//
//        System.out.println("You are "+age+" years old");
//        System.out.println("Your choice is "+ color +" "+year+" "+car);
//
//        double pi=3.14988;
//        System.out.println(pi);
//    }b
//}
//
// */
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[]args) {
//        Scanner scanner= new Scanner(System.in);
//
//        System.out.print("Enter you name:");
//        String name = scanner.nextLine(); // .next() for one word or word before space
//
//        System.out.println("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.println("Enter your GPA:");
//        double gpa = scanner.nextDouble();
//
//        System.out.println("Are you a student? (true/false)");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name);
//        System.out.println("You age is " + age);
//        System.out.println("Your GPA is " + gpa);
//        if (isStudent){
//            System.out.println("You are enrolled in classes");
//        }
//        else {
//            System.out.println("You are not enrolled in classes");
//        }
//    }
//

import java.awt.geom.Area;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        double width= 0;
        double height=0;
        double area=0;
        System.out.println("Enter the width of the rectangle:");
        width= scanner.nextDouble();
        System.out.println("Enter the height of the rectangle:");
        height= scanner.nextDouble();
        area=width*height;
        System.out.println("Area:"+ area+"cm^2");
        scanner.close();
    }
}