import java.util.Scanner;
class Super{
    int num_1,num_2;
    
}
class calc extends Super{
    calc(int a,int b){
        super.num_1=a;
        super.num_2=b;
    }
    void Add(){
        System.out.print("Addition is:");
        System.out.print(num_1+num_2);
    }
    void Sub(){
        System.out.print("Substarction is:");
        System.out.print(num_1-num_2);
    }
    void Mul(){
        System.out.print("Multiplication is:");
        System.out.print(num_1*num_2);
    }
    void Div(){
        System.out.print("Division is:");
        System.out.print(num_1/num_2);
    }
}
class Supercalc{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int P=Sc.nextInt();
        System.out.print("Enter number 2 : ");
        int Q=Sc.nextInt();
        calc obj=new calc(P,Q);
        System.out.println("Enter operation \n1.ADDITION \n2.SUBSTRACTION \n3.MULTIPLICATION \n4.DIVISION : ");
        int c=Sc.nextInt();
        if (c==1){
            obj.Add();
        }
        else if (c==2){
            obj.Sub();
        }
        else if (c==3){
            obj.Mul();
        }
        else if(c==4){
            obj.Div();
        }
        else 
        System.out.println("Error:Enter correct input");
    }
}



