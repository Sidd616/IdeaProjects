import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Hello! What is your Name : ");
        String str = sc.nextLine();

        System.out.print("How many times should I greet you ? : ");
        byte n = sc.nextByte();

        for(int i =0 ; i<n ; i++){
            System.out.print("Welcome "+str);
            System.out.println(", Have a Very Good Day Ahead!");
        }

        System.out.print("\nI will check whether you Enter a Integer OR Non Integer value,\nGive it a TRY! : ");
        float num = sc.nextFloat();
        int check = (int) num;

        if(num-check > 0)
        {
            System.out.print("It is not an Integer Value.");
        }
        else
            System.out.print("It is an Integer!");
    }
}