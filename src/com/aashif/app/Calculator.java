package com.aashif.app;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener{
    TextField answer;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,plus,minus,multi,devide,clear,equal;

    Calculator (){
        answer = new TextField("Nigga!");
        answer.setBounds(0,0,300,75);
        answer.setText("Aashif");

        // last row

        btn0 = new Button("0");
        btn0.setBounds(75,335,150,65);
        btn0.addActionListener(this);

        equal = new Button("=");
        equal.setBounds(225,335,75,65);
        equal.addActionListener(this);

        //4th row

        btn1 = new Button("1");
        btn1.setBounds(0,270,75,65);
        btn1.addActionListener(this);

        btn2 = new Button("2");
        btn2.setBounds(75,270,75,65);
        btn2.addActionListener(this);

        btn3 = new Button("3");
        btn3.setBounds(150,270,75,65);
        btn3.addActionListener(this);

        plus = new Button("+");
        plus.setBounds(225,270,75,65);
        plus.addActionListener(this);

        // 3rd row

        btn4 = new Button("4");
        btn4.setBounds(0,205,75,65);
        btn4.addActionListener(this);

        btn5 = new Button("5");
        btn5.setBounds(75,205,75,65);
        btn5.addActionListener(this);

        btn6 = new Button("6");
        btn6.setBounds(150,205,75,65);
        btn6.addActionListener(this);

        minus = new Button("-");
        minus.setBounds(225,205,75,65);
        minus.addActionListener(this);

        // 2nd row

        btn7 = new Button("7");
        btn7.setBounds(0,140,75,65);
        btn7.addActionListener(this);

        btn8 = new Button("8");
        btn8.setBounds(75,140,75,65);
        btn8.addActionListener(this);

        btn9 = new Button("9");
        btn9.setBounds(150,140,75,65);
        btn9.addActionListener(this);

        multi = new Button("X");
        multi.setBounds(225,140,75,65);
        multi.addActionListener(this);

        // 1st row

        clear = new Button("Clear");
        clear.setBounds(0, 75, 225, 65);
        clear.addActionListener(this);

        devide = new Button("/");
        devide.setBounds(225,75,75,65);
        devide.addActionListener(this);
        



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
        add(equal);


        setSize(300,400);
        setLayout(null);
        setTitle("calc");
        setVisible(true);

    }

    public void actionPerfomed(ActionEvent e){
        if (e.getSource() == btn0){
            String data = answer.getText();
            data += "0";
        }

        if (e.getSource() == btn0){
            String data = answer.getText();
            data += "0";
        }

        if (e.getSource() == btn1){
            String data = answer.getText();
            data += "1";
        }


        if (e.getSource() == btn2){
            String data = answer.getText();
            data += "2";
        }

        if (e.getSource() == btn3){
            String data = answer.getText();
            data += "3";
        }

        if (e.getSource() == btn4){
            String data = answer.getText();
            data += "4";
        }

        if (e.getSource() == btn5){
            String data = answer.getText();
            data += "5";
        }

        if (e.getSource() == btn6){
            String data = answer.getText();
            data += "6";
        }

        if (e.getSource() == btn7){
            String data = answer.getText();
            data += "7";
        }

        if (e.getSource() == btn8){
            String data = answer.getText();
            data += "8";
        }

        if (e.getSource() == btn9){
            String data = answer.getText();
            data += "9";
        }

        // Check Clear

        if (e.getSource() == clear){
            String data = "";
            answer.setText(data);
            
        }


    }




    public static void main(String[] args) {
        new Calculator();
    }
    
}
