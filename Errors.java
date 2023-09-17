// import java.util.Scanner;
// public class Errors {
//     public static void main(String[] args){
//     Scanner sc= new Scanner(System.in);
//     for(int i=0;i<10;i++){
//       System.out.println(2*i+1);
//     }
    
//     }
// }
import java.util.Scanner;
class a{
  int a;
  int b;
 public int a(int a,int b){
    int c;
    c=a+b;
    System.out.println("Sum is :"+c);
    return 0;
  }
  public int a(int a,int b,int c){
    int d;
    d=a+b+c;
    System.out.println("Sum is :"+d);
    return 0;
  }
}
   public class Errors{
  public static void main(String[] args){
    System.out.println("Hello");
    a obj=new a();
    obj.a(4, 9);
    obj.a(3, 5, 8);
    
  }
}
