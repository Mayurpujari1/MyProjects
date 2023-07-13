package simple.minds;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener
{
    JButton b1,b2;
    String username;
    Rules(String username)
    {
        this.username = username;
        setBounds(600,200,800,650);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel l1 = new JLabel("Welcome " + username + " to Simple Minds");
        l1.setForeground(new Color(31,44,255));
        l1.setFont(new Font("viner Hand ITC",Font.BOLD,28));
        l1.setBounds(50,20,700,30);
        add(l1);

        JLabel l2 =new JLabel("Rules");
        l2.setFont(new Font("Tahoma",Font.PLAIN,16));
        l2.setBounds(20,90,600,350);
        l2.setText("<html>"+
                "1.You are traned to be a programmer not a story teller,answer point to point"+"<br><br>"+
                "2.Do not unnecessarily smile at the person next to you, they may also not know the answer"+"<br><br>"+
                "3.You may have lot of options in a life but here all questions are compulsory"+"<br><br>"+
                "4.Crying is allowed but please do so quitely"+"<br><br>"+
                "5.Only fool ask and a wise answer(Be wise not otherwise)"+"<br><br>"+
                "6.Do not get nervous if your friend is answring more questions may be he is doing Jai Mata Di"+"<br><br>"+
                "7.Brace yourself,this paper is not for the faint hearted"+"<br><br>"+
                "8.May you more than what knows,Good Luck"+"<br><br>"+"<html>");
        add(l2);

        b1 =new JButton("Back");
        b1.setBounds(250,500,100,30);
        b1.setBackground(new Color(30,144,255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 =new JButton("Start");
        b2.setBounds(400,500,100,30);
        b2.setBackground(new Color(30,144,255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);
    }

    public static void main(String []args)
    {
        new Rules("");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            this.setVisible(false);
            new simpleminds().setVisible(true);
        }else if(e.getSource()== b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
}
