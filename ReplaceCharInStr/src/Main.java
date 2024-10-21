
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\tWooW JAVA huh...\n\n");
        System.out.println("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Your String - "+str);

        System.out.print("Which Character do you want to replace : ");
        char a = sc.next().charAt(0);
        System.out.println("Replace with : ");
        char b = sc.next().charAt(0);

        System.out.println("Updated String - "+ str.replace(a,b));
        System.out.println("Updated String - "+ str.replace(' ','_'));
        System.out.println("Thank you for Choosing us!");

    }
}