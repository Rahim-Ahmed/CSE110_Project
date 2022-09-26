package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class firstpg extends JFrame {


        Container c = new Container();
        JTextArea ta = new JTextArea("\n\n\n\n\n\n" +
                        "\n"+
                "            \n        Member info : " +
                "            \n               Std Name : Ab.Rahim Ahmed Sowrov" +
                "            \n               Std id : 2020-3-60-070   " +
                "            \n               Section : 1 " +
                "            \n               Date : 05-09-2021");


        Font ff = new Font( "Times New Roman",Font.PLAIN,22);

    Font B = new Font( "Times New Roman",Font.BOLD,21);
        Font f = new Font( "Times New Roman",Font.PLAIN,15);
        JButton  btn = new JButton("NEXT BUTTON >>>");
        JLabel lvl2 = new JLabel();
        JTextArea ta2 = new JTextArea(" \n                                              Department of Computer Science " +
                "\n                                                                Engineering " +
                "\n                                                                  CSE-110");

        ImageIcon img = new ImageIcon(getClass().getResource("logo.jpg"));

        ImageIcon image = new ImageIcon(getClass().getResource("ewu.png"));
        Border blackline = BorderFactory.createLineBorder(Color.white,2);

        Cursor cursor =new Cursor(Cursor.HAND_CURSOR);



        firstpg(){
            c=getContentPane();
            c.setLayout(null);
            c.setBackground(Color.black);


            btn.setBounds(400,424,155,30);
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
            c.add(btn);

            lvl2.setBounds(17,17,image.getIconWidth(),image.getIconHeight());
            lvl2.setIcon(image);
            lvl2.setOpaque(true);
            lvl2.setBackground(Color.lightGray);
           // lvl2.setBorder(blackline);
            c.add(lvl2);

            ta2.setBounds(17,105,image.getIconWidth(),105);
        //    ta2.setOpaque(true);
            ta2.setFont(B);
            ta2.setForeground(Color.black);
            ta2.setBackground(Color.lightGray);
            // lvl2.setBorder(blackline);
            c.add(ta2);



            ta.setBounds(10,10,565,410);
            ta.setEditable(false);
            ta.setBackground(Color.darkGray);
            ta.setBorder(blackline);
            ta.setForeground(Color.white);
            ta.setFont(ff);
            c.add(ta);

            setSize(600,500);
            this.setIconImage(img.getImage());
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
            setVisible(true);

        }

        public static void main(String[] args) {
            new firstpg();
        }

    }


