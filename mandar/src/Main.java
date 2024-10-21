import java.util.*;

class Person {

    public String name;
    public int code;
    Person(){
        code=0;
    }
    Person(String n, int c) {

        name = n;
        code = c;
    }

    public void show() {

        System.out.println("Name:" + name);
        System.out.println("Code: " + code);
    }

}
class Account extends Person {

    public int sal;
    Account(){
        sal=0;
    }
    Account(String n, int c, int s) {
        name = n;
        code=c;

        sal = s;
    }

    public void show1() {

        System.out.println("Salary:" + sal);
    }
}

class Admin extends Account {

    public int age, exp;

    Admin(String n, int c, int s, int a, int e) {

        name = n;
        code=c;
        sal=s;
        age = a;
        exp = e;
    }

    public void show() {
        show1();
        System.out.println("Name:" + name);
        System.out.println("Code: " + code);
        System.out.println("Salary:" + sal);
        System.out.println("Age:" + age);
        System.out.println("Expereience: " + exp);
    }
}


    public class Main{
    public static void main(String[] args) {

        Admin a = new Admin("ABC",101,50000,24,3);
        a.show();
    }
}