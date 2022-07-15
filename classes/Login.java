package ManagementSystem;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JButton login, signup, password;
    JTextField tfusername, tfpassword;
    Login(){
        setLayout(null);
        getContentPane().setBackground(new Color(158, 186, 232));
        setBounds(450, 300, 835, 390);

        JPanel p1 = new JPanel();
        p1.setBounds(0, 0, 400, 400);
        p1.setBackground(new Color(255, 255, 255));
        p1.setLayout(null);
        add(p1);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 400, 370);
        p1.add(l1);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(450, 35, 330, 290);
        p2.setBackground(new Color(255, 255, 255));
        add(p2);

        JLabel l2 = new JLabel("Username");
        l2.setBounds(60, 20, 100, 25);
        l2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        p2.add(l2);

        tfusername = new JTextField();
        tfusername.setBounds(60, 55, 210, 25);
        tfusername.setBorder(BorderFactory.createLineBorder(Color.black));
        p2.add(tfusername);

        JLabel l3 = new JLabel("Password");
        l3.setBounds(60, 100, 100, 25);
        l3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 16));
        p2.add(l3);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(60, 135, 210, 25);
        tfpassword.setBorder(BorderFactory.createLineBorder(Color.black));
        p2.add(tfpassword);

        login = new JButton("Login");
        login.setBounds(60, 200, 100, 30);
        login.addActionListener(this);
        p2.add(login);

        signup = new JButton("Sign Up");
        signup.setBounds(170, 200, 100, 30);
        signup.addActionListener(this);
        p2.add(signup);

        password = new JButton("Forget Password");
        password.setBounds(90, 240, 150, 30);
        password.addActionListener(this);
        p2.add(password);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            try {
                String username = tfusername.getText();
                String pass = tfpassword.getText();

                String query = "select * from account where username = '"+username+"' AND password = '"+pass+"'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Loading(username);
                }
                else {
                    JOptionPane.showMessageDialog(null, "Incorrect username or password");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        else if (ae.getSource() == signup) {
            setVisible(false);
            new Signup();
        }

        else {
            setVisible(false);
            new ForgetPassword();
        }
    }

    public static void main(String []args){
        new Login();
    }
}


