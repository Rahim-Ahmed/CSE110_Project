package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstPage extends JFrame {
    JPanel p1 = new JPanel(new GridLayout(1,2));
    JPanel pp1 = new JPanel();
    JPanel pp2 = new JPanel();
    JPanel pp3 = new JPanel();


    Container c = new Container();
    JTextArea lvl1 = new JTextArea("\n                         CSE-110 \n      Department of Computer Science \n                       Engineering " +
            "\n\n Member info : " +
            "\n   Std Name : Ab.Rahim Ahmed Sowrov" +
            "\n   Std id : 2020-3-60-070   " +
            "\n   Section : 1 " +
            "\n   Date : 05-09-2021");


    Font ff = new Font( "Calibri (Body)",Font.PLAIN,25);
    Font f = new Font( "Calibri (Body)",Font.BOLD,15);
    JButton  btn = new JButton("NEXT BUTTON");

    ImageIcon img = new ImageIcon(getClass().getResource("logo.jpg"));
    Border blackline = BorderFactory.createLineBorder(Color.white,2);
    Cursor cursor =new Cursor(Cursor.HAND_CURSOR);



    firstPage(){

        setLayout(new BorderLayout());

        btn.setPreferredSize(new Dimension(140,30));
        btn.setBackground(Color.orange);
        btn.setForeground(Color.black);
        btn.setBorder(blackline);
        btn.setCursor(cursor);
        btn.setFont(f);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                demo frame = new demo();
                dispose();
                frame.setVisible(true);
            }
        });



        lvl1.setPreferredSize(new Dimension(500,500));
        lvl1.setEditable(false);
        lvl1.setBackground(Color.darkGray);
        lvl1.setBorder(blackline);
        lvl1.setForeground(Color.white);
        lvl1.setFont(ff);


        p1.setLayout(new BorderLayout());

       // pp1.setPreferredSize(new Dimension(200,200));
        pp1.setBorder(blackline);
        pp1.setBackground(Color.black);
        pp2.setPreferredSize(new Dimension(50,45));
        pp2.add(btn);
        pp2.setBorder(blackline);
        pp2.setBackground(Color.black);

        pp3.setBorder(blackline);
        pp3.setBackground(Color.black);
        pp3.setPreferredSize(new Dimension(30,30));
        pp3.setBorder(blackline);
        pp3.setBackground(Color.black);

        pp1.add(lvl1);

        p1.add(pp3,BorderLayout.NORTH);p1.add(pp1,BorderLayout.CENTER);p1.add(pp2,BorderLayout.SOUTH);
        add(p1,BorderLayout.CENTER);

        
        setSize(600,500);
        this.setIconImage(img.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new firstPage();
    }

}
