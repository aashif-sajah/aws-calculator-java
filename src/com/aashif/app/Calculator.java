package com.aashif.app;
import java.awt.*;

public class Calculator extends Frame {
    TextField answer;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,plus,minus,multi,devide,clear,equal;

    Calculator (){
        answer = new TextField();
        answer.setBounds(10,10,10,10);

        add(answer);

        setSize(500,600);
        setLayout(null);
        setTitle("calc");
        setVisible(true);

    }




    public static void main(String[] args) {
        new Calculator();
    }
    
}
