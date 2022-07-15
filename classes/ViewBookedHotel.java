package ManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ViewBookedHotel extends JFrame implements ActionListener {

    JButton back;

    ViewBookedHotel(String username){
        setBounds(600, 270, 1000, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text = new JLabel("--> VIEW BOOKED HOTEL DETAILS <--");
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        text.setForeground(Color.BLUE);
        text.setBounds(20, 10, 450, 30);
        add(text);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30, 60, 150, 25);
        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblusername);

        JLabel labelusername = new JLabel();
        labelusername.setBounds(220, 60, 150, 25);
        labelusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelusername);

        JLabel lblhotel = new JLabel("Hotel Name");
        lblhotel.setBounds(30, 100, 150, 25);
        lblhotel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblhotel);

        JLabel labelhotel = new JLabel();
        labelhotel.setBounds(220, 100, 150, 25);
        labelhotel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelhotel);

        JLabel lblpersons = new JLabel("Total Persons");
        lblpersons.setBounds(30, 140, 150, 25);
        lblpersons.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblpersons);

        JLabel labelpersons = new JLabel();
        labelpersons.setBounds(220, 140, 150, 25);
        labelpersons.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelpersons);

        JLabel lbldays = new JLabel("Total Days");
        lbldays.setBounds(30, 180, 150, 25);
        lbldays.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lbldays);

        JLabel labeldays = new JLabel();
        labeldays.setBounds(220, 180, 150, 25);
        labeldays.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labeldays);

        JLabel lblac = new JLabel("AC/Non-AC");
        lblac.setBounds(30, 220, 150, 25);
        lblac.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblac);

        JLabel labelac = new JLabel();
        labelac.setBounds(220, 220, 150, 25);
        labelac.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelac);

        JLabel lblfood = new JLabel("Food Included");
        lblfood.setBounds(30, 260, 150, 25);
        lblfood.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblfood);

        JLabel labelfood = new JLabel();
        labelfood.setBounds(220, 260, 150, 25);
        labelfood.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelfood);

        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30, 300, 150, 25);
        lblid.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblid);

        JLabel labelid = new JLabel();
        labelid.setBounds(220, 300, 150, 25);
        labelid.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelid);

        JLabel lblnumber = new JLabel("Number");
        lblnumber.setBounds(30, 340, 150, 25);
        lblnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblnumber);

        JLabel labelnumber = new JLabel();
        labelnumber.setBounds(220, 340, 150, 25);
        labelnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelnumber);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(30, 380, 150, 25);
        lblphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblphone);

        JLabel labelphone = new JLabel();
        labelphone.setBounds(220, 380, 150, 25);
        labelphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelphone);

        JLabel lblprice = new JLabel("Price");
        lblprice.setBounds(30, 420, 150, 25);
        lblprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblprice);

        JLabel labelprice = new JLabel();
        labelprice.setBounds(220, 420, 150, 25);
        labelprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(labelprice);

        back = new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(Color.BLACK);
        back.setBounds(120, 470, 100, 25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewbookedhotel.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 50, 530, 420);
        add(image);

        try {
            Conn conn = new Conn();
            String query = "select * from bookhotel where username = '"+username+"'";
            ResultSet rs = conn.s.executeQuery(query);
            while(rs.next()) {
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelhotel.setText(rs.getString("name"));
                labelprice.setText(rs.getString("price"));
                labelpersons.setText(rs.getString("persons"));
                labelphone.setText(rs.getString("phone"));
                labelfood.setText(rs.getString("food"));
                labelac.setText(rs.getString("ac"));
                labeldays.setText(rs.getString("days"));
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
        new ViewBookedHotel("abhay");
    }
}
