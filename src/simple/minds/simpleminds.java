package simple.minds;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class simpleminds extends JFrame implements ActionListener
{
    JButton b1,b2;
    JTextField t1;

    simpleminds()
    {
        setBounds(400,200,1200,500);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("simple/minds/Icons/login.jpeg"));
        JLabel l1 = new JLabel(i1);

        l1.setBounds(0,0,600,500);
        add(l1);

        JLabel l2 =new JLabel("SIMPLE MINDS");
        l2.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        l2.setForeground(new Color(30,144,254));
        l2.setBounds(750,40,350,45);
        add(l2);


        JLabel l3 =new JLabel("ENTER YOUR NAME");
        l3.setFont(new Font("Mongalian Baiti",Font.BOLD,18));
        l3.setForeground(new Color(30,144,254));
        l3.setBounds(810,150,300,20);
        add(l3);

        t1 =new JTextField();
        t1.setBounds(735,200,300,25);
        t1.setFont(new Font("Timqs New Roman",Font.BOLD,20));
        add(t1);

        b1 =new JButton("Rules");
        b1.setBounds(735,270,120,25);
        b1.setBackground(new Color(30,144,254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 =new JButton("Exit");
        b2.setBounds(915,270,120,25);
        b2.setBackground(new Color(30,144,254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        setVisible(true);
    }


    public  static void main(String[] args)
    {
        new simpleminds();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            String name =t1.getText();
            this.setVisible(false);
            new Rules(name);
        }else
            System.exit(0);
    }
}
