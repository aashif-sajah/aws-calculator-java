package com.aashif.app;
import java.awt.*;

public class Calculator extends Frame {
    TextField answer;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,plus,minus,multi,devide,clear,equal;

    Calculator (){
        answer = new TextField("Nigga!");
        answer.setBounds(0,0,300,75);
        answer.setText("Aashif");

        // last row

        btn0 = new Button("0");
        btn0.setBounds(75,335,150,65);

        equal = new Button("=");
        equal.setBounds(225,335,75,65);

        //4th row

        btn1 = new Button("1");
        btn1.setBounds(0,270,75,65);

        btn2 = new Button("2");
        btn2.setBounds(75,270,75,65);

        btn3 = new Button("3");
        btn3.setBounds(150,270,75,65);

        plus = new Button("+");
        plus.setBounds(225,270,75,65);

        // 3rd row

        btn4 = new Button("4");
        btn4.setBounds(0,215,75,65);

        btn5 = new Button("5");
        btn5.setBounds(75,215,75,65);

        btn6 = new Button("6");
        btn6.setBounds(150,215,75,65);

        minus = new Button("-");
        minus.setBounds(225,215,75,65);

        // 2nd row

        btn7 = new Button("7");
        btn7.setBounds(0,150,75,65);

        btn8 = new Button("8");
        btn8.setBounds(75,150,75,65);

        btn9 = new Button("9");
        btn9.setBounds(150,150,75,65);

        multi = new Button("X");
        multi.setBounds(225,150,75,65);

        // 1st row

        clear = new Button("Clear");
        clear.setBounds(0, 75, 225, 65);

        devide = new Button("/");
        devide.setBounds(225,75,75,65);
        



        add(btn0);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(plus);
        add(minus);
        add(multi);
        add(devide);
        add(answer);
        add(clear);


        setSize(300,400);
        setLayout(null);
        setTitle("calc");
        setVisible(true);

    }




    public static void main(String[] args) {
        new Calculator();
    }
    
}
