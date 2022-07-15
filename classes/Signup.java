package ManagementSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;


public class Signup extends JFrame implements ActionListener {

    JButton create, back;
    JTextField tfname, tfusername, tfpassword, tfanswer;
    Choice security;

    Signup()
    {
        setBounds(450,300,900,360);
        getContentPane().setBackground(Color.white);
        setLayout(null);



        JPanel p1=new JPanel();
        p1.setBackground(new Color(158,186,232));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);

        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,14));
        lblusername.setBounds(70,30,125,25);
        p1.add(lblusername);

        tfusername=new JTextField();
        tfusername.setBounds(210,30,180,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("Tahoma",Font.PLAIN,14));
        lblname.setBounds(70,70,125,25);
        p1.add(lblname);

        tfname=new JTextField();
        tfname.setBounds(210,70,180,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setFont(new Font("Tahoma",Font.PLAIN,14));
        lblpassword.setBounds(70,110,125,25);
        p1.add(lblpassword);

        tfpassword=new JTextField();
        tfpassword.setBounds(210,110,180,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

        JLabel lblsecurity = new JLabel("Security Question");
        lblsecurity.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblsecurity.setBounds(70, 150, 125, 25);
        p1.add(lblsecurity);

        security = new Choice();
        security.add("Your fisrt school name");
        security.add("Your childhood name");
        security.add("Your birth place");
        security.add("Your favourite hobby");
        security.setBounds(210, 150, 180, 25);
        p1.add(security);

        JLabel lblanswer = new JLabel("Answer");
        lblanswer.setFont(new Font("Tahoma",Font.PLAIN,14));
        lblanswer.setBounds(70,190,125,25);
        p1.add(lblanswer);

        tfanswer=new JTextField();
        tfanswer.setBounds(210,190,180,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);

        create = new JButton("Create");
        create.setBackground(Color.WHITE);
        create.setForeground(Color.BLACK);
        create.setFont(new Font("Tahoma", Font.PLAIN, 14));
        create.setBounds(100, 260, 100, 30);
        create.addActionListener(this);
        p1.add(create);

        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setFont(new Font("Tahoma", Font.PLAIN, 14));
        back.setBounds(270, 260, 100, 30);
        back.addActionListener(this);
        p1.add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(500, -10, 400, 370);
        add(l1);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == create) {
            String username = tfusername.getText();
            String name = tfname.getText();
            String password = tfpassword.getText();
            String question = security.getSelectedItem();
            String answer = tfanswer.getText();

            String query = "insert into account values('"+username+"', '"+name+"', '"+password+"', '"+question+"', '"+answer+"')";
            try {
                Conn c = new Conn();
                c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Account Created Successfully");

                setVisible(false);
                new Login();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}