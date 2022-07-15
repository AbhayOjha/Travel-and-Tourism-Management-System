package ManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {


    About() {
        setBounds(800, 270, 500, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(210, 20, 200, 40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l1);

        String s = "                                          About Project       \n  "
                + "\nThe objective of the Travel and Tourism Management System "
                + "project \nis to develop a system that automates the processes "
                + "and activities \nof a travel and the purpose is to design a "
                + "system using which one \ncan perform all operations related to "
                + "traveling.\n\n"
                + "This application will help in accessing the information related "
                + "to the \ntravel to the particular destination with great ease. "
                + "The users can \ntrack the information related to their tours with "
                + "great ease through \nthis application. The travel agency information "
                + "can also be \nobtained through this application.\n\n"
                + "Advantages of Project:"
                + "\n Gives accurate information"
                + "\n Simplifies the manual work"
                + "\n It minimizes the documentation related work"
                + "\n Provides up to date information"
                + "\n Friendly Environment by providing warning messages."
                + "\n Travelers details can be provided"
                + "\n Booking confirmation notification"
                + "\n\n     Created By:"
                + "\n                Abhay Ojha"
                + "\n                   20BCS3857"
                + "\n                Nilesh Pandey"
                + "\n                   20BCS3860"
                + "\n                Suryali Suman"
                + "\n                   20BCS3866"
                + "\n\n\n"
        ;


        TextArea area = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
        add(area);

        JButton back = new JButton("Back");
        back.setBounds(200, 420, 100, 25);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new About();
    }
}
