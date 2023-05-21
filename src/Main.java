import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What you want?");
        System.out.println("1.More, less, equal " + "2.Average " + "3. Area, perimeter");
        int choice = scan.nextInt();
        switch (choice){
            case 1:
                MoreLessEqual();
                break;
            case 2:
                Average();
                break;
            case 3:
                Rectangle();
                break;
            default:
                System.out.println("You put in some bullshit");
                break;
        }
    }

    public static void MoreLessEqual() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Put first number");
        float number1 = scan.nextFloat();
        System.out.println("Put second number");
        float number2 = scan.nextFloat();
        if(number1 < number2) {
            System.out.println(number1 + " < " + number2);
        } else if (number1 > number2) {
            System.out.println(number1 + " > " + number2);
        } else if (number1 == number2) {
            System.out.println(number1 + " = " + number2);
        } else {
            System.out.println("Not ashamed to write this?");
        }


    }

    public static void Average() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Put ny number (0-10)");
        float number1 = scan.nextFloat();
        System.out.println("Put second number");
        float number2 = scan.nextFloat();
        if (number1 < 0 || number1 > 10 || number2 < 0 || number2 > 10) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("The cleverest?");
            System.out.println("1.Y / 2.N");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("I do not think so");
            } else if (choice == 2) {
                System.out.println("I think so too");
            } else {
                System.out.println("Congratulations, I downloaded the miner");
            }
        }
        if (number1 >= 0 && number1 <= 10 && number2 >= 0 && number2 <= 10) {
            float result = (number1 + number2) / 2;
            System.out.println("Result ==>" + result);
        }
    }
    public static void Rectangle() {
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter the length of the rectangle");
          float length = scan.nextFloat();
          System.out.println("Enter the width of the rectangle");
          float width = scan.nextFloat();
          System.out.println("Select Operation : " + "1.Perimeter, " + "2.Square" );
          int choice = scan.nextInt();
          if (choice == 1) {
               float result = (2 * length) + (2 * width);
               System.out.println("Result : " + result);
          } else if (choice == 2) {
              float result = length * width;
              System.out.println("Result : " + result);
          } else {
              System.out.println("You confused me (404)");
          }
    }
}