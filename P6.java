import java.util.Scanner;

public class P6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[5];
        System.out.print("Enter array [0]:");
        float a=sc.nextFloat();
        System.out.print("Enter array [1]:");
        float b=sc.nextFloat();
        System.out.print("Enter array [2]:");
        float c=sc.nextFloat();
        System.out.print("Enter array [3]:");
        float d=sc.nextFloat();
        System.out.print("Enter array [4]:");
        float e=sc.nextFloat();
        float x=a+b+c+d+e;
        System.out.println(x);

    }
}
