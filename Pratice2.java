import java.util.Scanner;
// public class Pratice2{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter number 1:");
//         int num1=sc.nextInt();
//         System.out.print("Enter number 2:");
//         int num2=sc.nextInt();
//         System.out.print("sum of number 1 and number 2 is:"+(num1+num2));
//     }
// }
//methods 

// public class Pratice2 {
//     int logic(int a, int b) {

//         return a + b;
//     }

//     int logic(int a, int b, int c) {

//         return a + b + c;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Pratice2 obj = new Pratice2();

//         System.out.print("Enter number 1:");
//         int a = sc.nextInt();
//         System.out.print("Enter number 2:");
//         int b = sc.nextInt();
//         System.out.print("Enter number 3:");
//         int c = sc.nextInt();

//         obj.logic(a, b);
//         obj.logic(a, b, c);
//         System.out.println("Sum of 2 numbers are " + obj.logic(a, b));
//         System.out.println("Sum of 2 numbers are " + obj.logic(a, b, c));
//     }
// }

// Custom class
// class Emp{
//     String name;
//     int id;
//     int salary;
// }
// public class Pratice2{
//     public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     Emp Abhi=new Emp();
//     Abhi.name="Abhi";
//     Abhi.id=7;
//     Abhi.salary=800;
//     System.out.println("Creating custom class");
//     System.out.println("Employee Name: "+Abhi.name);
//     System.out.println("Employee ID: "+Abhi.id);
//     System.out.println("Employee Salary: "+Abhi.salary);

//     }
// }

// Use of Getter and setter
// class Emp {
//     private String name;
//     private int id;
//     private int salary;

//     public void setname(String a) {
//         name = a;
//     }

//     public String getname() {
//         return name;
//     }

//     public void setid(int a) {
//         id = a;
//     }

//     public int getid() {
//         return id;
//     }

//     public void setSalary(int a) {
//         salary = a;
//     }

//     public int getsalary() {
//         return salary;
//     }

// }

// public class Pratice2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Emp Abhi = new Emp();
//         Abhi.setname("Abhi");;
//         Abhi.setid(8);
//         Abhi.setSalary(800);
//         System.out.println("Creating custom class");
//         System.out.println("Employee Name: " + Abhi.getname());
//         System.out.println("Employee ID: " + Abhi.getid());
//         System.out.println("Employee Salary: " + Abhi.getsalary());

//     }
// }

//Inheritance 

// class Base {
//     int x;

//     public void setx(int a) {
//         x = a;
//     }

//     public int getx() {
//         return x;

//     }
// }
// class Derived extends Base{
//     int y;
//     public void sety(int b){
//         y=b;
//     }
//     public int gety(){
//         return y;
//     }
// }

// public class Pratice2 {
//     public static void main(String[] args){
//         Base b=new Base();
//         b.setx(6);
//         System.out.println(b.getx());
//     }
// }


