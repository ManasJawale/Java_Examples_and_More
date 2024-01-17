package JFrameex.Register_Login_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;

public class Login extends JFrame implements ActionListener {
    public JPanel ContentPanel = new JPanel();
    public JLabel logo = new JLabel();
    public JTextField Username = new JTextField();
    public JTextField Email = new JTextField();
    public JPasswordField Password = new JPasswordField();
    public JCheckBox genderMale = new JCheckBox();
    public JCheckBox genderWomen = new JCheckBox();
    public JCheckBox genderAlien = new JCheckBox();
    public JComboBox<Integer> age = new JComboBox<>();
    public JLabel[] labels;
    public JLabel labelUsername = new JLabel("Enter Username");
    public JLabel labelEmail = new JLabel("Enter Email");
    public JLabel labelPassword = new JLabel("Enter Password");
    public JLabel Title = new JLabel("Login");
    public JLabel[] labelgender = new JLabel[2];
    public JLabel labelgendermale = new JLabel("Male");
    public JLabel labelgenderfemale = new JLabel("FeMale");
    public JLabel labelgenderalen = new JLabel("Alien");
    public Font labelsFont = new Font("Ink Free", Font.BOLD, 16);

    public void Define() {
        this.setBounds(0, 0, 500, 500);
        // Logo
        logo.setIcon(new ImageIcon("D:\\Java_Project\\JFrameex\\Register_Login_Project\\pic\\Intellij.png"));
        logo.setBounds(0, 0, 50, 50);
        logo.setVisible(true);
        // Title Label
        Title.setBounds(100, 10, 250, 50);
        Title.setVisible(true);
        Title.setFont(new Font("Open Sans", Font.BOLD, 36));
        Title.setBackground(Color.MAGENTA);
        // TextField
        Username.setBounds(250, 100, 200, 25);
        Username.setVisible(true);
        Email.setBounds(Username.getX(), Username.getY() + 50, Username.getWidth(), Username.getHeight());
        Email.setVisible(true);
        Password.setBounds(Username.getX(), Username.getY() + 100, Username.getWidth(), Username.getHeight());
        Password.setVisible(true);
        // Gender
        genderMale.setBounds(75, Username.getY() + 150, 100, 100);
        genderMale.setVisible(true);
        genderWomen.setBounds(75 * 2, Username.getY() + 150, 100, 100);
        genderWomen.setVisible(true);
        genderAlien.setBounds(75 * 3, Username.getY() + 150, 100, 100);
        genderAlien.setVisible(true);
        // Labels
        labelUsername.setBounds(20, Username.getY(), 150, 50);
        labelEmail.setBounds(20, Email.getY(), 100, 50);
        labelPassword.setBounds(20, Password.getY(), 150, 50);

        labels = new JLabel[] {
                labelUsername,
                labelEmail,
                labelPassword
        };
        // Gender Labels
        labelgendermale.setBounds(0, genderMale.getY(), 100, 100);
        labelgenderfemale.setBounds(genderWomen.getX() - 50, genderWomen.getY(), 100, 100);
        labelgenderalen.setBounds(genderAlien.getX() - 50, genderAlien.getY(), 100, 100);

        labelgender = new JLabel[] {
                labelgendermale,
                labelgenderfemale,
                labelgenderalen
        };

        this.setContentPane(ContentPanel);
        this.add(Title);
        this.add(logo);
        this.add(Username);
        this.add(Email);
        this.add(Password);
        this.add(genderMale);
        this.add(genderWomen);
        this.add(genderAlien);
        for (JLabel jLabel : labels) {
            jLabel.setFont(labelsFont);
            this.add(jLabel);
        }
        for (JLabel jLabel : labelgender) {
            jLabel.setFont(labelsFont);
            this.add(jLabel);
        }

    }

    Login() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        Define();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (genderMale.isSelected()) {
            genderWomen.setSelected(false);
            genderAlien.setSelected(false);

        } else if (genderWomen.isSelected()) {
            genderMale.setSelected(false);
            genderAlien.setSelected(false);

        } else if (genderAlien.isSelected()) {
            genderMale.setSelected(false);
            genderWomen.setSelected(false);

        }
    }

}
