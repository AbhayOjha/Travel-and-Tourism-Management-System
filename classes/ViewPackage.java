package ManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ViewPackage extends JFrame implements ActionListener {

    JButton back;

    ViewPackage(String username){
        setBounds(630, 270, 900, 450);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("--> VIEW PACKAGE DETAILS <--");
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        text.setForeground(Color.BLUE);
        text.setBounds(20, 10, 350, 30);
        add(text);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 60, 150, 25);
        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblusername);

        JLabel labelusername = new JLabel();
        labelusername.setBounds(220, 60, 150, 25);
        labelusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelusername);

        JLabel lblpackage = new JLabel("Package");
        lblpackage.setBounds(30, 100, 150, 25);
        lblpackage.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblpackage);

        JLabel labelpackage = new JLabel();
        labelpackage.setBounds(220, 100, 150, 25);
        labelpackage.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelpackage);

        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setBounds(30, 140, 150, 25);
        lblpersons.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblpersons);

        JLabel labelpersons = new JLabel();
        labelpersons.setBounds(220, 140, 150, 25);
        labelpersons.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelpersons);

        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30, 180, 150, 25);
        lblid.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblid);

        JLabel labelid = new JLabel();
        labelid.setBounds(220, 180, 150, 25);
        labelid.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelid);

        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30, 220, 150, 25);
        lblnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblnumber);

        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220, 220, 150, 25);
        labelnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelnumber);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(30, 260, 150, 25);
        lblphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblphone);

        JLabel labelphone = new JLabel();
        labelphone.setBounds(220, 260, 150, 25);
        labelphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelphone);

        JLabel lblprice = new JLabel("Price");
        lblprice.setBounds(30, 300, 150, 25);
        lblprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblprice);

        JLabel labelprice = new JLabel();
        labelprice.setBounds(220, 300, 150, 25);
        labelprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelprice);

        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBounds(120, 360, 100, 25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewpackage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(390, 60, 430, 280);
        add(image);

        try {
            Conn conn = new Conn();
            String query = "select * from bookpackage where username = '"+username+"'";
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next()) {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelpackage.setText(rs.getString("package"));
                labelprice.setText(rs.getString("price"));
                labelpersons.setText(rs.getString("persons"));
                labelphone.setText(rs.getString("phone"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new ViewPackage("abhay");
    }
}
