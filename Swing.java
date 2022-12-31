import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing {
    public static void main(String[] args) {
        Abc obj = new Abc();

    }
}

class Abc extends JFrame {
    public Abc() {
        setLayout(getLayout());
        JLabel l= new JLabel("hello world");
        JLabel l2=new JLabel("Hey Aniket");
        add(l);
        add(l2);
        setVisible(true);
        setSize(500, 500);
    }

}