import java.util.Scanner;
class Greet{
    Scanner sc = new Scanner(System.in);
    int i,j,n,s,temp,result=0;

    void greet(){
        System.out.print("Hello world!\nThis is a new phase!\nWe will calculate the numbers with basic maths.\n\tEnter how many numbers you want : ");
        n = sc.nextInt();
        System.out.println(n);
    }
    int[] arr = new int[10];
    void ActArr(){
        System.out.print("\nEnter the Numbers here : ");
        for(i = 0; i< n; i++){
                arr[i] = sc.nextInt();
        }
    }
    int cal(){
        switch (s) {
            case 1 -> {
                for (i = 0; i < n; i++) {
                    result += arr[i];
                }
            }
            case 2 -> {
                for (i = 0; i < n; i++) {
                    for (j = 0; j < n; j++) {
                        if (arr[j] < arr[j + 1]) {
                            temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }

                    }
                }
                result = arr[0];
                for (i = 1; i < n; i++) {
                    result -= arr[i];
                }
            }
        }
        return result;

    }
    void choice(){
        System.out.println("Make selection :-\n1 --> Addition\n2 --> Subtraction\n3 --> Multiplication\n4 --> Division");
        s = sc.nextInt();
    }
}

public class Main {
    public static void main(String[] args) {
        int ans;
        Greet obj1 = new Greet();
        obj1.greet();
        obj1.ActArr();
        obj1.choice();
        ans = obj1.cal();
        System.out.println("The Answer is "+ ans);
    }
}
