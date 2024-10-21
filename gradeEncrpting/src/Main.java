import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello User!");
//        int a = 7;
//        int b = 4;
//        int c = 9;
//        int d = 2;
//
//        float x = (float)a/b*c/d;
//
//        System.out.println("The Result is "+x);

        System.out.print("What is the GRADE you obtained : ");
        Scanner sc = new Scanner(System.in);
        char g = sc.next().charAt(0);
        g = (char) (g + 8);

        System.out.println("New GRADE is "+g);
        System.out.println("Recalculating the Original GRADE...");
        g = (char) (g-8);

        System.out.println("The Original GRADE was "+g);



    }
}