import java.util.Scanner;
class This{
    int a,b;
    This(int x,int y){
        this.a=x;
        this.b=y;
    }
    void Add(){
        System.out.print("Addition is:");
        System.out.print(a+b);
    }
    void Sub(){
        System.out.print("Substarction is:");
        System.out.print(a-b);
    }
    void Mul(){
        System.out.print("Multiplication is:");
        System.out.print(a*b);
    }
    void Div(){
        System.out.print("Division is:");
        System.out.print(a/b);
    }
    public static void main(String[] args) {
        try (Scanner Sc = new Scanner(System.in)) {
            System.out.print("Enter Number 1 : ");
            int P=Sc.nextInt();
            System.out.print("Enter number 2 : ");
            int Q=Sc.nextInt();
            This obj=new This(P,Q);
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
            else{
                obj.Div();
            }
        }
    }
}