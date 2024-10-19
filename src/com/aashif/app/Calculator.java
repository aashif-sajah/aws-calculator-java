package com.aashif.app;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends Frame implements ActionListener{
    TextField answer;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,plus,minus,multi,devide,clear,equal;
    Calculator (){
        
        answer = new TextField("0");
        answer.setBounds(10,30,320,60);

    
        // last row

        btn0 = new Button("0");
        btn0.setBounds(90,330,160,60);
        btn0.addActionListener(this);

        equal = new Button("=");
        equal.setBounds(250,330,80,60);
        equal.addActionListener(this);

        //4th row

        btn1 = new Button("1");
        btn1.setBounds(10,270,80,60);
        btn1.addActionListener(this);

        btn2 = new Button("2");
        btn2.setBounds(90,270,80,60);
        btn2.addActionListener(this);

        btn3 = new Button("3");
        btn3.setBounds(170,270,80,60);
        btn3.addActionListener(this);

        plus = new Button("+");
        plus.setBounds(250,270,80,60);
        plus.addActionListener(this);

        // 3rd row

        btn4 = new Button("4");
        btn4.setBounds(10,210,80,60);
        btn4.addActionListener(this);

        btn5 = new Button("5");
        btn5.setBounds(90,210,80,60);
        btn5.addActionListener(this);

        btn6 = new Button("6");
        btn6.setBounds(170,210,80,60);
        btn6.addActionListener(this);

        minus = new Button("-");
        minus.setBounds(250,210,80,60);
        minus.addActionListener(this);

        // 2nd row

        btn7 = new Button("7");
        btn7.setBounds(10,150,80,60);
        btn7.addActionListener(this);

        btn8 = new Button("8");
        btn8.setBounds(90,150,80,60);
        btn8.addActionListener(this);

        btn9 = new Button("9");
        btn9.setBounds(170,150,80,60);
        btn9.addActionListener(this);

        multi = new Button("X");
        multi.setBounds(250,150,80,60);
        multi.addActionListener(this);

        // 1st row

        clear = new Button("Clear");
        clear.setBounds(10, 90, 250, 60);
        clear.addActionListener(this);

        devide = new Button("/");
        devide.setBounds(250,90,80,60);
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


        setSize(340,410);
        setLayout(null);
        setTitle("calc");
        setVisible(true);

    }

    @Override 
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == btn0){
            String data = answer.getText();
            data += "0";
            answer.setText(data);
        }

        if (e.getSource() == btn1){
            String data = answer.getText();
            data += "1";
            answer.setText(data);
        }


        if (e.getSource() == btn2){
            String data = answer.getText();
            data += "2";
            answer.setText(data);
        }

        if (e.getSource() == btn3){
            String data = answer.getText();
            data += "3";
            answer.setText(data);
        }

        if (e.getSource() == btn4){
            String data = answer.getText();
            data += "4";
            answer.setText(data);
        }

        if (e.getSource() == btn5){
            String data = answer.getText();
            data += "5";
            answer.setText(data);
        }

        if (e.getSource() == btn6){
            String data = answer.getText();
            data += "6";
            answer.setText(data);
        }

        if (e.getSource() == btn7){
            String data = answer.getText();
            data += "7";
            answer.setText(data);
        }

        if (e.getSource() == btn8){
            String data = answer.getText();
            data += "8";
            answer.setText(data);
        }

        if (e.getSource() == btn9){
            String data = answer.getText();
            data += "9";
            answer.setText(data);
        }

        if (e.getSource() == devide){
            String data = answer.getText();
            data += "/";
            answer.setText(data);
        }

        if (e.getSource() == plus){
            String data = answer.getText();
            data += "+";
            answer.setText(data);
        }

        if (e.getSource() == minus){
            String data = answer.getText();
            data += "-";
            answer.setText(data);
        }

        if (e.getSource() == multi){
            String data = answer.getText();
            data += "*";
            answer.setText(data);
        }


        // Check Clear

        if (e.getSource() == clear){
            String data = "";
            answer.setText(data);
            
        }

        if (e.getSource() == equal){
            String data = answer.getText();
            Double result = evaluateMath(data);
            answer.setText(String.valueOf(result));
        }
    }

    private Double evaluateMath(String data){
        Double result = null;
        String data1 = "";
        String data2 = "";
        char op = '\0';
        int i;

        for (i = 0; i < data.length();i++){
            if (Character.isDigit(data.charAt(i))){
                data1+=data.charAt(i);
            } else{
                op = data.charAt(i);
                break;
            }
        }

        data2 = data.substring(i+1);
        int num1 = Integer.parseInt(data1);
        int num2 = Integer.parseInt(data2);
        

        switch (op) {
            case '+':
                result = (double )(num1 + num2);
                break;
            
            case '-':
                result = (double )(num1 - num2);
                break;
            
            case '*':
                result = (double )(num1 * num2);
                break;
            
            case '/':
                try {
                    if (num2 == 0){
                        throw new ArithmeticException("Cannot Devide by Zero");
                    }
                    result = (double )(num1 / num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                
                break;
            default:
               System.out.println("Invalid Oparation");
        }

        
        return result;
        
        
    }




    public static void main(String[] args) {
        new Calculator();
    }
    
}
