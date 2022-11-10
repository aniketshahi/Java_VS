import java.util.Scanner;

interface Bank {
    static void print(){
        System.out.println("Bank interface");
    }
    default double ROI(){
        return 9;
    }
}

class SBI implements Bank {
    public double ROI() {
        return 9.15;
    }
}

public class Interfaces {
    public static void main(String[] args) {
      SBI obj =new SBI();
      Bank.print();
      System.out.println("Rate of interest is:"+obj.ROI());
    }

}
