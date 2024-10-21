import java.util.*;
//Demo code for 

class data {

    // array declaration
    private int[] arr = new int[5];
    private int a;
    private String name;

    //creating scanner
    Scanner sc = new Scanner(System.in);

    // first Default Constructor
    data() {
        System.out.println("Hello  from Constructor");
        a = 0;
        System.out.println("Age is " + a);

    }

    // Second Parameterized Constructor
    data(int age) {
        System.out.println("Hello  from Constructor");
        a = age;
        System.out.println("Age is " + a);

    }

    // Again one Parameterized Constructor
    data(String name) {
        System.out.println("Hello  from Constructor♥♥♥");
        a = 0;
        System.out.println("name is " + name);
    }

    // Third COPY Constructor
    data(data n) {
        System.out.println("Hello from Constructor");
        a = 10;
        a = n.a / 2;
        System.out.println("Actual age is " + a);
    }

    // method for taking input
    public void inputData() {
        System.out.println("Enter 5 numbers :");
        name = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // method for displaying array

    public void displayArr() {
        System.out.print("Your Array :");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    /* 98 45 86 75 44
     * 1st --> 45 98 86 75 44
     * 2nd --> 45 86 98 75 44
     * 3rd --> 45 86 75 98 44
     * 4th --> 45 86 75 44 98
     *
     * 1st --> 45  75 8644 98
     * 2nd --> 45 75 44 86 98
     *
     * 1st --> 45 44 75 86 98
     *
     * 1st --> 44 45 75 86 98
     * final --> 44 45 75 86 98
     * */

    /* 98 45 86 75 44
       0  1   2  3  4
       44 98 45 86  75
0 1 2 3 4
     * final --> 45 44 98 86 75
     * */

    // method for Sorting array in Asending order
    public void sortAss() {
        System.out.print("\nSorted array in ascending order :");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Displaying sorted array
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    // method for Sorting array in Decending order

    public void sortDec() {
        System.out.print("\nSorted array in Decending order :");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //Displaying sorted array
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    // method for Clockwise Rotation

    public void sortClock() {
        System.out.print("\nSorted array in Clockwise order :");

        for (int i = 4; i > 0; i--) {
            int temp;
            temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }

        // displaying array
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    // method for Counter-Clockwise Rotation
    public void sortCounterClock() {
        sortAss();
        sortDec();
        sortClock();
        System.out.print("\nSorted array in Counter Clockwise order :");

        for (int i = 0; i < 4; i++) {
            int temp;
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        // Displaying array
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

/* n = 11  odd  -- 1 2 3 4 5 6 7 8 9 10 11
 * a = n/2
 * a = 5
 * arr[a+1] this case
 *
 * n = 10  even
 * a = n/2
 * a = 5
 * if even
 *
 * (arr[a] + arr[a+1])/2
 *
 *
 */


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from main");

        data d1 = new data("abc");
        data d3 = new data(18);
        data d2 = new data(d3);

        d1.inputData();
        System.out.println("Age is ");
        d1.displayArr();
        d1.sortAss();
        d1.sortDec();
        d1.sortClock();
    }
}