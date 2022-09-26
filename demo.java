package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

public class demo extends JFrame {

    JPanel p1,p2,p3;
    JButton btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22;
    JButton cbtn1,cbtn2;
    JLabel temp = new JLabel("List of Program(21 Programs)");
    JLabel label1 = new JLabel("Selected Program Name");
    JLabel lvl1,lvl2,lvl3,lvl4,lvl5,lvl6;
    JTextArea taC = new JTextArea("\n\n\n\n\n\n\n\n\n\n\n                Show C code that is in .c file");
    JTextArea taJ = new JTextArea("\n\n\n\n\n\n\n\n\n\n\n           Show Java code that is in .java file");
    Border blackline =BorderFactory.createLineBorder(Color.white);

    Font f = new Font( "Calibri (Body)",Font.BOLD,14);
    Font ff = new Font( "Calibri (Body)",Font.BOLD,16);

    JScrollPane scrollC = new JScrollPane(taC);
    JScrollPane scrollJ = new JScrollPane(taJ);

    JPanel pp1 = new JPanel();
    JPanel pp2=new JPanel();
    JPanel pp3=new JPanel();
    JPanel ppp2 = new JPanel(new GridLayout(1,2));
    JPanel panelRight = new JPanel(new GridLayout(1, 2));
    ImageIcon img = new ImageIcon(getClass().getResource("logo.jpg"));
    Cursor cursor =new Cursor(Cursor.HAND_CURSOR);
    demo(){
        setLayout(new BorderLayout());

        p1=new JPanel(new GridLayout(0,1));
        p1.setPreferredSize(new Dimension(230,100));
        p1.setBorder(blackline);
        p1.setBackground(Color.lightGray);
        p2=new JPanel(new BorderLayout());
        p2.setPreferredSize(new Dimension(30,30));
        p2.setBorder(blackline);
        p2.setBackground(Color.darkGray);
        p3=new JPanel();
        p3.setPreferredSize(new Dimension(100,100));
        p3.setBorder(blackline);

        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setForeground(Color.black);
        label1.setFont(ff);

        cbtn1=new JButton("C Program ");
        cbtn1.setBackground(Color.lightGray);
        cbtn1.setBorder(blackline);
        cbtn1.setForeground(Color.black);
        cbtn1.setFont(f);

        cbtn2=new JButton("Java Program");
        cbtn2.setBorder(blackline);
        cbtn2.setBackground(Color.lightGray);
        cbtn2.setForeground(Color.black);
        cbtn2.setFont(f);


        pp2.setLayout(new BorderLayout());


        panelRight.setBorder(blackline);
        panelRight.add(scrollC);
        panelRight.add(scrollJ);
        ppp2.add(cbtn1);ppp2.add(cbtn2);

        ppp2.setPreferredSize(new Dimension(30,33));
        ppp2.setBackground(Color.black);
        ppp2.setBorder(blackline);


        pp2.add(ppp2,BorderLayout.NORTH); pp2.add(panelRight,BorderLayout.CENTER);



        p3.setLayout( new BorderLayout());


        pp1.setPreferredSize(new Dimension(30,33));
        pp1.setBackground(Color.ORANGE);
        pp1.setBorder(blackline);
        pp1.add(label1);
        pp2.setPreferredSize(new Dimension(100,100));
        pp2.setBackground(Color.black);
        pp2.setBorder(blackline);
        pp3.setPreferredSize(new Dimension(30,30));
        pp3.setBackground(Color.darkGray);
        pp3.setBorder(blackline);

        p3.add(pp1,BorderLayout.NORTH);
        p3.add(pp2,BorderLayout.CENTER);
        p3.add(pp3,BorderLayout.SOUTH);




        temp.setOpaque(true);
        temp.setBackground(Color.orange);
        temp.setBorder(blackline);
        temp.setVerticalAlignment(JLabel.CENTER);
        temp.setHorizontalAlignment(JLabel.CENTER);
        temp.setFont(f);



        lvl1 = new JLabel("  Basic programs(3)");

        lvl1.setOpaque(true);
        lvl1.setBackground(Color.white);
        lvl1.setBorder(blackline);
        lvl1.setVerticalAlignment(JLabel.CENTER);
        lvl1.setHorizontalAlignment(JLabel.LEFT);
        lvl1.setFont(f);

        btn2 = new JButton("    Hello World ");
        btn2.setBackground(Color.lightGray);
        btn2.setBorder(blackline);
        btn2.setFont(f);
        btn2.setCursor(cursor);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Basic programs/Hello/hello.c");
                taC.setText(" "+data);
                data = readFile("D:/C-Codes/Basic programs/Hello/Hellow.java");
                taJ.setText(data);
            }
        });



        btn3 = new JButton("       If-Else condition");
        btn3.setBackground(Color.lightGray);
        btn3.setBorder(blackline);
        btn3.setCursor(cursor);
        btn3.setFont(f);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Basic programs/If-else/ifElse.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Basic programs/If-else/ifElsee.java");
                taJ.setText(data);
            }
        });

        btn4 = new JButton("Input from user ");
        btn4.setBackground(Color.lightGray);
        btn4.setBorder(blackline);
        btn4.setFont(f);
        btn4.setCursor(cursor);
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Basic programs/input form/inputFromUser.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Basic programs/input form/inputfromuserr.java");
                taJ.setText(data);
            }
        });


        lvl2 = new JLabel("   Loops (5)");

        lvl2.setOpaque(true);
        lvl2.setBackground(Color.white);
        lvl2.setBorder(blackline);
        lvl2.setVerticalAlignment(JLabel.CENTER);
        lvl2.setHorizontalAlignment(JLabel.LEFT);
        lvl2.setFont(f);



        btn5 = new JButton(" do-while loop");
        btn5.setBackground(Color.lightGray);
        btn5.setCursor(cursor);
        btn5.setBorder(blackline);
        btn5.setFont(f);
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Loops/do-while-loop/do_whlie-loop.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Loops/do-while-loop/doWhileLoop.java");
                taJ.setText(data);
            }
        });

        btn6 = new JButton(" for loop");
        btn6.setBackground(Color.LIGHT_GRAY);
        btn6.setBackground(Color.lightGray);
        btn6.setBorder(blackline);
        btn6.setFont(f);
        btn6.setCursor(cursor);
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Loops/for-loop/loop.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Loops/for-loop/forLoop.java");
                taJ.setText(data);
            }
        });


        btn7 = new JButton(" nested for loop");
        btn7.setBackground(Color.LIGHT_GRAY);
        btn7.setBackground(Color.lightGray);
        btn7.setBorder(blackline);
        btn7.setFont(f);
        btn7.setCursor(cursor);
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Loops/nested-loop/nnested-loop.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Loops/nested-loop/nestedForLoop.java");
                taJ.setText(data);
            }
        });



        btn8 = new JButton(" sum of digits");
        btn8.setBackground(Color.LIGHT_GRAY);
        btn8.setBackground(Color.lightGray);
        btn8.setBorder(blackline);
        btn8.setFont(f);
        btn8.setCursor(cursor);
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Loops/sumofdigit/sumofdigit.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Loops/sumofdigit/sumofDigit.java");
                taJ.setText(data);
            }
        });



        btn9 = new JButton(" while loop");
        btn9.setBackground(Color.LIGHT_GRAY);
        btn9.setBackground(Color.lightGray);
        btn9.setBorder(blackline);
        btn9.setFont(f);
        btn9.setCursor(cursor);
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Loops/while-loop/whileloop.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Loops/while-loop/WhileLoop.java");
                taJ.setText(data);
            }
        });

        lvl3 = new JLabel("  Number Crunching(3)");
        lvl3.setOpaque(true);
        lvl3.setBackground(Color.white);
        lvl3.setBorder(blackline);
        lvl3.setVerticalAlignment(JLabel.CENTER);
        lvl3.setHorizontalAlignment(JLabel.LEFT);
        lvl3.setFont(f);

        btn10 = new JButton(" Finding average");
        btn10.setBackground(Color.LIGHT_GRAY);
        btn10.setBackground(Color.lightGray);
        btn10.setBorder(blackline);
        btn10.setFont(f); btn10.setCursor(cursor);
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Number Crunching/Find avg/findavg.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Number Crunching/Find avg/fingAvg.java");
                taJ.setText(data);
            }
        });

        btn11= new JButton(" large number");
        btn11.setBackground(Color.LIGHT_GRAY);
        btn11.setBackground(Color.lightGray);
        btn11.setBorder(blackline);
        btn11.setFont(f); btn11.setCursor(cursor);
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Number Crunching/Large Number/largeNumber.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Number Crunching/Large Number/largeNumber.java");
                taJ.setText(data);
            }
        });

        btn12 = new JButton(" odd or even number");
        btn12.setBackground(Color.LIGHT_GRAY);
        btn12.setBackground(Color.lightGray);
        btn12.setBorder(blackline);
        btn12.setFont(f); btn12.setCursor(cursor);
        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Number Crunching/Odd or Even/oddEven.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Number Crunching/Odd or Even/OddEven.java");
                taJ.setText(data);
            }
        });

        lvl4 = new JLabel("  Concept of arrays (5)");
        lvl4.setOpaque(true);
        lvl4.setBackground(Color.white);
        lvl4.setBorder(blackline);
        lvl4.setVerticalAlignment(JLabel.CENTER);
        lvl4.setHorizontalAlignment(JLabel.LEFT);
        lvl4.setFont(f); btn2.setCursor(cursor);

        btn13 = new JButton(" array sorting");
        btn13.setBackground(Color.LIGHT_GRAY);
        btn13.setBackground(Color.lightGray);
        btn13.setBorder(blackline);
        btn13.setFont(f); btn13.setCursor(cursor);
        btn13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Concept of Arrays/array sorting/arraysorting.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Concept of Arrays/array sorting/arraySorting.java");
                taJ.setText(data);
            }
        });

        btn14 = new JButton(" determinate 2x2 matrix");
        btn14.setBackground(Color.LIGHT_GRAY);
        btn14.setBackground(Color.lightGray);
        btn14.setBorder(blackline);
        btn14.setFont(f); btn14.setCursor(cursor);
        btn14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Concept of Arrays/determinate 2x2 matrix/2x2.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Concept of Arrays/determinate 2x2 matrix/mariz2x2.java");
                taJ.setText(data);
            }
        });

        btn15 = new JButton(" largest and smallest elements");
        btn15.setBackground(Color.LIGHT_GRAY);
        btn15.setBackground(Color.lightGray);
        btn15.setBorder(blackline);
        btn15.setFont(f); btn15.setCursor(cursor);
        btn15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Concept of Arrays/Largest and smallest eliments/largest and smallest.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Concept of Arrays/Largest and smallest eliments/largestAndSmallest.java");
                taJ.setText(data);
            }
        });

        btn16 = new JButton(" reverse array");
        btn16.setBackground(Color.LIGHT_GRAY);
        btn16.setBackground(Color.lightGray);
        btn16.setBorder(blackline);
        btn16.setFont(f); btn16.setCursor(cursor);
        btn16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Concept of Arrays/Reverce array/reverse.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Concept of Arrays/Reverce array/reverseArray.java");
                taJ.setText(data);
            }
        });

        btn17 = new JButton(" sum of numbers");
        btn17.setBackground(Color.LIGHT_GRAY);
        btn17.setBackground(Color.lightGray);
        btn17.setBorder(blackline);
        btn17.setFont(f); btn17.setCursor(cursor);
        btn17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Concept of Arrays/sum of n numbers/sumofn.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Concept of Arrays/sum of n numbers/sumOfN.java");
                taJ.setText(data);
            }
        });


        lvl5 = new JLabel("  Concept of Recursion (2)");
        lvl5.setOpaque(true);
        lvl5.setBackground(Color.white);
        lvl5.setBorder(blackline);
        lvl5.setVerticalAlignment(JLabel.CENTER);
        lvl5.setHorizontalAlignment(JLabel.LEFT);
        lvl5.setFont(f);



        btn18 = new JButton(" factorial by recursion");
        btn18.setBackground(Color.LIGHT_GRAY);
        btn18.setBackground(Color.lightGray);
        btn18.setBorder(blackline);
        btn18.setFont(f); btn18.setCursor(cursor);
        btn18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Concept of Recursion/factorial number/factorial.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Concept of Recursion/factorial number/factorial.java");
                taJ.setText(data);
            }
        });



        btn19 = new JButton(" adding 2 number");
        btn19.setBackground(Color.LIGHT_GRAY);
        btn19.setBackground(Color.lightGray);
        btn19.setBorder(blackline);
        btn19.setFont(f); btn19.setCursor(cursor);
        btn19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Concept of Recursion/Adding 2 number/adding2number.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Concept of Recursion/Adding 2 number/adding2number.java");
                taJ.setText(data);
            }
        });



        lvl6 = new JLabel("  Miscellaneous (3)");
        lvl6.setOpaque(true);
        lvl6.setBackground(Color.white);
        lvl6.setBorder(blackline);
        lvl6.setVerticalAlignment(JLabel.CENTER);
        lvl6.setHorizontalAlignment(JLabel.LEFT);
        lvl6.setFont(f);


        btn20 = new JButton(" Area of triangle");
        btn20.setBackground(Color.LIGHT_GRAY);
        btn20.setBackground(Color.lightGray);
        btn20.setBorder(blackline);
        btn20.setFont(f); btn20.setCursor(cursor);
        btn20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Miscellaneous/Area of triangle/AreaofT.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Miscellaneous/Area of triangle/AreaofTriange.java");
                taJ.setText(data);
            }
        });


        btn21 = new JButton(" largest of three num");
        btn21.setBackground(Color.LIGHT_GRAY);
        btn21.setBackground(Color.lightGray);
        btn21.setBorder(blackline);
        btn21.setFont(f); btn21.setCursor(cursor);
        btn21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Miscellaneous/largest of theree numbers/largestofthree.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Miscellaneous/largest of theree numbers/lagestfrom3Number.java");
                taJ.setText(data);
            }
        });


        btn22 = new JButton(" Leap year");
        btn22.setBackground(Color.LIGHT_GRAY);
        btn22.setBackground(Color.lightGray);
        btn22.setBorder(blackline);
        btn22.setFont(f); btn22.setCursor(cursor);
        btn22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = readFile("D:/C-Codes/Miscellaneous/leap year/leap year.c");
                taC.setText(data);
                data = readFile("D:/C-Codes/Miscellaneous/leap year/leapYear.java");
                taJ.setText(data);
            }
        });



        taC.setBackground(Color.black);
        taC.setForeground(Color.white);
        taC.setBorder(blackline);
        taC.setFont(ff);

        taJ.setBackground(Color.black);
        taJ.setForeground(Color.white);
        taJ.setBorder(blackline);
        taJ.setFont(ff);


        p1.add(temp);p1.add(lvl1);p1.add(btn2);p1.add(btn3);p1.add(btn4);p1.add(lvl2);p1.add(btn5);
        p1.add(btn6);p1.add(btn7);p1.add(btn8);p1.add(btn9);p1.add(lvl3);p1.add(btn10);p1.add(btn11);p1.add(btn12);
        p1.add(lvl4);p1.add(btn13);p1.add(btn14);p1.add(btn15);p1.add(btn16);p1.add(btn17);
        p1.add(lvl5);p1.add(btn18);p1.add(btn19);p1.add(lvl6);p1.add(btn20);p1.add(btn21);p1.add(btn22);

        add(p1,BorderLayout.WEST);  add(p2,BorderLayout.NORTH); add(p3,BorderLayout.CENTER);

        setVisible(true);
        this.setIconImage(img.getImage());
        setSize(950,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    public String readFile(String filePath) {
        try {
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);
            String fileData = "";
            while (myReader.hasNextLine()) {
                fileData += myReader.nextLine()+"\n";
            }
            //System.out.println(fileData);
            myReader.close();
            return fileData;
        }catch (Exception ex) {
            System.out.println("ArithmeticException error occurred.");
            ex.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        new demo();
    }
}
