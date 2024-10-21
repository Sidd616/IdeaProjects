import java.util.*;

abstract class NewEmp{
    protected int code, age;

    // constructor does NOT have REturn Type
    public NewEmp(){
        System.out.println("Hello , New object created");
        Scanner sc = new Scanner(System.in);
        code = sc.nextInt();
        age = sc.nextInt();

        System.out.println("Code : "+code);
        System.out.println("Age : "+age);

    }

    public NewEmp(int a){
        System.out.println("Advanced Constructor DETECTED !!!!!New object created");
        Scanner sc = new Scanner(System.in);
        code = sc.nextInt();
        age = sc.nextInt();

    }
    public NewEmp(double a){
        System.out.println("$$$$$$$$$$$$$$$\nAdvanced Constructor DETECTED !!!!!New object created");


    }
    public NewEmp(NewEmp n1){
        //code here
    }

// METHOD OVERLOADING

//    public int getCode(){
//        System.out.println("Hello from NewEmp");
//        return 0;
//    }
//    public int showCode(){
//        System.out.println("Hello from NewEmp");
//        return 0;
//    }
    //    public int showCode(int a){
//        System.out.println("Hello from NewEmp");
//        return 0;
//    }
    //    public int showCode(int a , int b){
//        System.out.println("Hello from NewEmp");
//        return 0;
//    }
}

class VeryNewEmp extends NewEmp{

        protected int height;
        Scanner sc = new Scanner(System.in);
       public VeryNewEmp(double height){
           super(2);

           System.out.println("Code : "+code);
           System.out.println("Age : "+age);
           System.out.println("Height : "+this.height);

       }

    public void call(){
        //code here
    }
}
//  Heirariecal
// NewEmp one,two <---- VeryNew void one
//    ^
//    `------- VeryVeryNew void two
class VeryVeryNewEmp extends NewEmp{

    protected double height;
    Scanner sc = new Scanner(System.in);
    public VeryVeryNewEmp(double height) {
        super(2);
        this.height = height+0.5;
        try {
            this.height = sc.nextInt();
            System.out.println("Code : " + code);
            System.out.println("Age : " + age);
            System.out.println("Height : " + this.height);
        } catch (Exception e){
            System.out.println("error detected");
        }
    }



}

public class Main {
    public static void main(String[] args) {
       NewEmp obj1;
//        NewEmp obj2 = new NewEmp(23);
//        NewEmp obj1 = new NewEmp();

        VeryNewEmp obj2 = new VeryNewEmp(178.5);



        // obj1 ----> NewEmp

        // obj1 ----> VeryNewEmp

    }
}
//
//// multilevel   @ NewEmp --> VeryNewEmp --> secondVeryNew
//class VeryNewEmp extends NewEmp{
//        //code here
//}
//
//class secondVeryNew extends NewEmp{
//    //code here
//}