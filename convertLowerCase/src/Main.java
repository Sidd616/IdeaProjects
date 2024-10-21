import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello User!");

        System.out.print("Enter any String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.printf("String you entered - %s",str);
        System.out.println("\nNew String in LowerCase - "+ str.toLowerCase());
    }
}