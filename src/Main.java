import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("a:");
        double a = scan.nextDouble();
        System.out.print("b:");
        double b = scan.nextDouble();
        System.out.print("c:");
        double c = scan.nextDouble();

        if (a == 0)
        {
            System.out.println(" 'a' can not be 0");
        }

        double D = b * b - 4 * a * c ;
        System.out.printf("delta:%.2f%n", D);

        int rootCount;
        if (D < 0)
        {rootCount = 0;}
        else if (D == 0)
        {rootCount = 1;}
        else
        {rootCount = 2;}

        switch (rootCount)
        {
            case 0: System.out.println("No answer");break;

            case 1: double x = -b / (2 * a);
                    System.out.printf("x = %.2f", x);
                    break;

            case 2: double x1 = (-b + Math.sqrt(D)) / (2 * a);
                    double x2 = (-b - Math.sqrt(D)) / (2 * a);
                    System.out.printf("x1 = %.2f%n", x1);
                    System.out.printf("x2 = %.2f%n", x2);
                    break;
        }
        System.out.println("Hiii");
    }
}
