package JFrameex.phy_sim;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PhysicsSimyulation extends JFrame{
    Icon ball = new ImageIcon("JFrameex\\phy_sim\\pic\\Circle.png");
    Icon flat = new ImageIcon("JFrameex\\phy_sim\\pic\\flat.png");
    JLabel balllaLabel = new JLabel(ball);
    JLabel flatJLabel = new JLabel(flat);

    public PhysicsSimyulation() {
        setBounds(0, 0, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Physics simulator");
        
        flatJLabel.setBounds(getBounds());
    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);

        

    }
    public static void main(String[] args) {
        PhysicsSimyulation jf = new PhysicsSimyulation();
    }
}
