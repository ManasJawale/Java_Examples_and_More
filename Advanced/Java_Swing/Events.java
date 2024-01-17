package Advanced.Java_Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
class MyFrame extends JFrame implements ActionListener{
    Container c;
    JButton button;

    MyFrame() {
        c=this.getContentPane();
        c.setLayout(null);
        button = new JButton("Click here");
        button.setBounds(100, 100, 200, 100);
        c.add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Random r = new Random();
        c.setBackground(new Color(r.nextInt(), r.nextInt(), r.nextInt()));
    }
}
public class Events {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("Events");
        f.setBounds(0, 0, 700, 500); 
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}
