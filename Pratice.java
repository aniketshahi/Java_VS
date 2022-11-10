import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

public class Pratice {
    // // addition using add method
    // static int Add(int a,int b){ //initilizing method
    // System.out.print("Addition is:");
    // System.out.println(a+b);
    // return 0;
    // }
    // static void Pratice(){
    // System.out.println("This is constructor");
    // }

    // public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // System.out.print("Enter a:");
    // int a=sc.nextInt();
    // System.out.print("Enter b:");
    // int b=sc.nextInt();
    // Add(a, b); //calling method
    // Pratice();

    // }

    // //constructor
    // static void Pratice(){ //Initilizing constructor
    // System.out.println("This is constructor");
    // }

    // public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);

    // Pratice(); //calling constructor
    // }

    // //Array
    // static void printArray(int [] a){ //passing array as argument in method
    // for(int i=0;i<a.length;i++){

    // System.out.println(a[i]);
    // }
    // }
    // static int[] returnarray(){
    // int arr[]=new int []{0,0,0,0,4,6,7,8,9};
    // return arr; //returning array;
    // }
    // public static void main(String [] args){
    // //int arr[]=new int []{1,2,3,4,4,6,7,8,9};
    // int arr[]= returnarray();

    // printArray(arr) ;
    // returnarray();
    // }

    // //Inheritence

    // //Example 1
    // static class Employee { //superclass
    // float salary = 100000;
    // }

    // static class Programmer extends Employee { //subclass
    // int bonus = 20000;
    // }

    // public static void main(String[] args) {
    // Programmer p = new Programmer();
    // System.out.println("salary:"+p.salary);
    // System.out.print("Bonus:"+p.bonus);
    // }

    // //example 2

    // static class Animal{
    // void printMessag(){
    // System.out.println("Animal Mtehod");
    // }
    // }
    // static class dogs extends Animal{

    // void printMessage(){
    // printMessag();
    // System.out.println("Bark");
    // }
    // }
    // public static void main(String[] args) {
    // dogs d=new dogs();
    // d.printMessage();
    // }

    // // polymorphism(method over riding)

    // static class superclass {
    // void print() {
    // System.out.println("super class");
    // }
    // }

    // static class subclass extends superclass {
    // @Override
    // void print() {
    // System.out.println("sub class");
    // }
    // }

    // public static void main(String[] args) {
    // superclass obj = new superclass();
    // obj.print();
    // obj = new subclass();
    // obj.print();

    // }

    // //Final Keyword
    // static class FinalKeyword {
    // final int CONSTANT = 6;
    // }

    // public static void main(String[] args) {
    // FinalKeyword obj = new FinalKeyword();

    // }
    // // Final mwthod
    // static class finalmethod{
    // void method1(){
    // System.out.println("Super class method 1");
    // }
    // final void method2(){
    // System.out.println("Super class method 2");
    // }
    // }
    // static class subclass extends finalmethod{
    // @Override
    // void method1() {

    // super.method1();
    // }
    // void method2(){ //cananot override final method

    // }
    // }
    // public static void main(String[] args) {
    // subclass obj=new subclass();
    // obj.method1();

    // }

    // // super keyword

    // static class superclass{
    // int x=50;
    // }
    // static class subclass extends superclass{
    // int x=90;
    // void show(){
    // System.out.println("without super "+x);
    // }
    // void show2(){
    // System.out.println("with super "+super.x);
    // }
    // }
    // public static void main(String[] args) {
    // subclass obj =new subclass();
    // obj.show();
    // obj.show2();

    // }

    // //Abstarct class and abstract method

    // static abstract class shape {
    //     abstract int area();
    // }
    // static class rectangle extends shape{
    //   int area(){
    //     int l=0,b=0;
    //     System.out.print("Enter length: ");
    //     BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    //     try {
    //         l=Integer.parseInt(obj.readLine());
    //     } catch (NumberFormatException | IOException e1) {
        
    //         e1.printStackTrace();
    //     }
    //     System.out.print("Enter breadth:");
    //    try {
    //     b=Integer.parseInt(obj.readLine());
    // } catch (NumberFormatException | IOException e) {
       
    //     e.printStackTrace();
    // }
      
       
    //     return l*b;
    //   }
    // }
    // public static void main(String[] args) {
    //  rectangle obj =new rectangle();
    
    //  System.out.println("Area:"+obj.area());
    // }


    
    

}