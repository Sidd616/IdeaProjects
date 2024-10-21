import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

        System.out.println("Hello! Today I'll be assisting you in calculating the percentage of your result...");
        Scanner sc = new Scanner(System.in);
        Scanner shivam = new Scanner(System.in);
        System.out.println("Enter Marks out of 100 of subject 1 : ");
        byte a = shivam.nextByte();
        System.out.println("Enter Marks out of 100 of subject 2 : ");
        byte b = shivam.nextByte();
        System.out.println("Enter Marks out of 100 of subject 3 : ");
        byte c = sc.nextByte();
        System.out.println("Enter Marks out of 100 of subject 4 : ");
        byte d = sc.nextByte();
        System.out.println("Enter Marks out of 100 of subject 5 : ");
        byte e = sc.nextByte();

        float sum = a+b+c+d+e;
        float per = (sum/500)*100;

        System.out.println("The Percentage is "+per);

        System.out.println(shivam.hasNextInt());

    }
}