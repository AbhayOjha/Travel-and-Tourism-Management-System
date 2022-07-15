package ManagementSystem;

import javax.print.attribute.standard.Destination;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    String username;
    JButton addPersonalDetails;
    JButton viewPersonalDetails;
    JButton updatePersonalDetails;
    JButton checkpackages, bookpackage, viewpackage, viewhotels, destinations, bookhotel, viewBookedHotel, payments, calculators, notepad, about, deletePersonalDetails;

    Dashboard(String username) {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0, 1900, 65);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(-2, -5, 80, 80);
        p1.add(icon);

        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(heading);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65, 300, 1200);
        add(p2);

        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 50);
        addPersonalDetails.setBackground(new Color(0, 0, 102));
        addPersonalDetails.setForeground(Color.BLACK);
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);

        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 50, 300, 50);
        updatePersonalDetails.setBackground(new Color(0, 0, 102));
        updatePersonalDetails.setForeground(Color.BLACK);
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);

        viewPersonalDetails = new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0, 100, 300, 50);
        viewPersonalDetails.setBackground(new Color(0, 0, 102));
        viewPersonalDetails.setForeground(Color.BLACK);
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 150, 300, 50);
        deletePersonalDetails.setBackground(new Color(0, 0, 102));
        deletePersonalDetails.setForeground(Color.BLACK);
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);

        checkpackages = new JButton("Check Packages");
        checkpackages.setBounds(0, 200, 300, 50);
        checkpackages.setBackground(new Color(0, 0, 102));
        checkpackages.setForeground(Color.BLACK);
        checkpackages.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);

        bookpackage = new JButton("Book Package");
        bookpackage.setBounds(0, 250, 300, 50);
        bookpackage.setBackground(new Color(0, 0, 102));
        bookpackage.setForeground(Color.BLACK);
        bookpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);

        viewpackage = new JButton("View Booked Package");
        viewpackage.setBounds(0, 300, 300, 50);
        viewpackage.setBackground(new Color(0, 0, 102));
        viewpackage.setForeground(Color.BLACK);
        viewpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);

        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 350, 300, 50);
        viewhotels.setBackground(new Color(0, 0, 102));
        viewhotels.setForeground(Color.BLACK);
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);

        bookhotel = new JButton("Book Hotel");
        bookhotel.setBounds(0, 400, 300, 50);
        bookhotel.setBackground(new Color(0, 0, 102));
        bookhotel.setForeground(Color.BLACK);
        bookhotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);

        viewBookedHotel = new JButton("View Booked Hotel");
        viewBookedHotel.setBounds(0, 450, 300, 50);
        viewBookedHotel.setBackground(new Color(0, 0, 102));
        viewBookedHotel.setForeground(Color.BLACK);
        viewBookedHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewBookedHotel.addActionListener(this);
        p2.add(viewBookedHotel);

        destinations = new JButton("Destinations");
        destinations.setBounds(0, 500, 300, 50);
        destinations.setBackground(new Color(0, 0, 102));
        destinations.setForeground(Color.BLACK);
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.addActionListener(this);
        p2.add(destinations);

        payments = new JButton("Payments");
        payments.setBounds(0, 550, 300, 50);
        payments.setBackground(new Color(0, 0, 102));
        payments.setForeground(Color.BLACK);
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.addActionListener(this);
        p2.add(payments);

        calculators = new JButton("Calculators");
        calculators.setBounds(0, 600, 300, 50);
        calculators.setBackground(new Color(0, 0, 102));
        calculators.setForeground(Color.BLACK);
        calculators.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculators.addActionListener(this);
        p2.add(calculators);

        notepad = new JButton("Notepad");
        notepad.setBounds(0, 650, 300, 50);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.BLACK);
        notepad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notepad.addActionListener(this);
        p2.add(notepad);

        about = new JButton("About");
        about.setBounds(0, 700, 300, 50);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.BLACK);
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.addActionListener(this);
        p2.add(about);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 2000, 1100);
        add(image);

        JLabel text = new JLabel("Travel and Tourism Management System");
        text.setBounds(700, 70, 1200, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.PLAIN, 40));
        image.add(text);

        JPanel p3 = new JPanel();
        p3.setLayout(null);
        p3.setBackground(new Color(0, 0, 102));
        p3.setBounds(0, 1050, 1900, 70);
        add(p3);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addPersonalDetails) {
            new AddCustomer(username);
        }
        else if (ae.getSource() == viewPersonalDetails) {
            new ViewCustomer(username);
        }
        else if (ae.getSource() == updatePersonalDetails) {
            new UpdateCustomer(username);
        }
        else if (ae.getSource() == checkpackages) {
            new CheckPackage();
        }
        else if (ae.getSource() == bookpackage) {
            new BookPackage(username);
        }
        else if (ae.getSource() == viewpackage) {
            new ViewPackage(username);
        }
        else if (ae.getSource() == viewhotels) {
            new CheckHotels();
        }
        else if (ae.getSource() == destinations) {
            new Destinations();
        }
        else if (ae.getSource() == bookhotel) {
            new BookHotel(username);
        }
        else if (ae.getSource() == viewBookedHotel) {
            new ViewBookedHotel(username);
        }
        else if (ae.getSource() == payments) {
            new Payment();
        }
        else if (ae.getSource() == calculators) {
            try {
                Runtime.getRuntime().exec("/System/Applications/Calculator.app/Contents/MacOS/Calculator");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        else if (ae.getSource() == notepad) {
            try {
                Runtime.getRuntime().exec("/System/Applications/Notes.app/Contents/MacOS/Notes");
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        else if (ae.getSource() == about) {
            new About();
        }
        else if (ae.getSource() == deletePersonalDetails) {
            new DeleteDetails(username);
        }
    }

    public static void main(String[] args) {
        new Dashboard("abhay");
    }
}
