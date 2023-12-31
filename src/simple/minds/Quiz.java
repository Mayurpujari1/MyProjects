package simple.minds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz extends JFrame implements ActionListener {
JButton next,submit,lifeline;
public static int count;
public static int timer = 25;
public static int ans_given = 0;
public static int score =0;
ButtonGroup options;

    static {
        count = 0;
    }
    String [][]q =new String [20][5];
    String [][]pa = new String[20][1];
    String [][]qa =new String[20][2];
    JLabel qno,question;
    JRadioButton opt1,opt2,opt3,opt4;
    String username;
    Quiz(String username)
    {
        this.username =username;
        setBounds(250,50,1440,900);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("simple/minds/Icons/quiz.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,1490,392);
        add(l1);

        qno = new JLabel("1.");
        qno.setFont(new Font("Tahoma",Font.PLAIN,24));
        qno.setBounds(100,450,40,30);
        add(qno);

        question = new JLabel("what is your name?");
        question.setFont(new Font("Tahoma",Font.PLAIN,24));
        question.setBounds(150,450,900,30);
        add(question);


        q[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "What is the return type of the hashCode() method in the Object class?";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "Which of the following is a marker interface?";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "Which of the following is a mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "Which of the following option leads to the portability and security of Java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the Java code secure and portable";
        q[9][3] = "Use of exception handling";
        q[9][4] = "Dynamic binding between objects";

        q[10][0]= "Which of the following is not a java feature?";
        q[10][1]="Dynamic";
        q[10][2] ="Architecture Neutral";
        q[10][3]="Use of Points";
        q[10][4]="object-oriented";

        q[11][0]="Can We have two public classes in one java file?";
        q[11][1]="True";
        q[11][2]="false";
        q[11][3]="None of above";
        q[11][4]="All of These";

        q[12][0]="An Object could be anything?";
        q[12][1]="Anything";
        q[12][2]="An Algorithem";
        q[12][3]="A data container";
        q[12][4]="A Program";

        q[13][0]="Which Of the following is not java keyword?";
        q[13][1]="static";
        q[13][2]="Try";
        q[13][3]="Integer";
        q[13][4]="new";

        q[14][0]="Choose the approprate data type for this field: is Swimmer?";
        q[14][1]="double";
        q[14][2]="boolen";
        q[14][3]="string";
        q[14][4]="int";

        q[15][0]="What is correct syntax for java main method?";
        q[15][1]="public void main (string[] args)";
        q[15][2]="public static void main (string[] args)";
        q[15][3]="public void main()";
        q[15][4]="none of above";

        q[16][0]="Java keywords are written in lowercase as well as uppercase?";
        q[16][1]="True";
        q[16][2]="false";
        q[16][3]="all of above";
        q[16][4]="none of above";

        q[17][0]="Choose approprate data type for this value:5.5?";
        q[17][1]="int";
        q[17][2]="double";
        q[17][3]="boolean";
        q[17][4]="string";

        q[18][0]="Java runs on?";
        q[18][1]="Windows";
        q[18][2]="Linux";
        q[18][3]="Mac";
        q[18][4]="All of Above";

        q[19][0]="Who is konow as founder of java?";
        q[19][1]="James Gosling";
        q[19][2]="E.K.Brukle";
        q[19][3]="All of Above";
        q[19][4]="None of Above";




        qa[0][1] = "JDB";
        qa[1][1] = "int";
        qa[2][1] = "java.util package";
        qa[3][1] = "Marker Interface";
        qa[4][1] = "Heap memory";
        qa[5][1] = "Remote interface";
        qa[6][1] = "import";
        qa[7][1] = "Java Archive";
        qa[8][1] = "java.lang.StringBuilder";
        qa[9][1] = "Bytecode is executed by JVM";
        qa[10][1]="Use of pointers";
        qa[11][1]="false";
        qa[12][1]="Anything";
        qa[13][1]="Integer";
        qa[14][1]="boolen";
        qa[15][1]="none of above";
        qa[16][1]="false";
        qa[17][1]="double";
        qa[18][1]="All of Above";
        qa[19][1]="James Gosling";







        opt1 =new JRadioButton("");
        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
        opt1.setBackground(Color.WHITE);
        opt1.setBounds(170,520,400,30);
        add(opt1);

        opt2 =new JRadioButton("");
        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
        opt2.setBackground(Color.WHITE);
        opt2.setBounds(170,560,400,30);
        add(opt2);

        opt3 =new JRadioButton("");
        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
        opt3.setBackground(Color.WHITE);
        opt3.setBounds(170,600,400,30);
        add(opt3);

        opt4 =new JRadioButton("");
        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
        opt4.setBackground(Color.WHITE);
        opt4.setBounds(170,640,400,30);
        add(opt4);

         options =new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);

        next =new JButton("Next");
        next.setFont(new Font("Tahoma",Font.PLAIN,22));
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setBounds(1100,550,200,40);
        add(next);


        lifeline =new JButton(" 50 50 lifeline");
        lifeline.setFont(new Font("Tahoma",Font.PLAIN,22));
        lifeline.setBackground(new Color(30,144,255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        lifeline.setBounds(1100,630,200,40);
        add(lifeline);



        submit=new JButton("submit");
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setEnabled(false);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setBounds(1100,710,200,40);
        add(submit);

        start(0);
    }


    @SuppressWarnings("ConstantConditions")
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given =1;
            if(options.getSelection() == null) {
                pa[count][0] = "";
            }else{
                pa[count][0] = options.getSelection().getActionCommand();
            }

            if(count == 18){
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count ++;
            start(count);


        } else if (ae.getSource() == submit) {
            ans_given =1;
            if(options.getSelection() == null) {
                pa[count][0] = "";
            }else{
                pa[count][0] = options.getSelection().getActionCommand();
            }
            for(int i =0;i < pa.length; i++){
                if(pa[i][0].equals(qa[i][1])){
                    score+=20;
                }else{
                    score+=0;
                }
            }
            this.setVisible(false);
            new score(username, score).setVisible(true);
        } else if (ae.getSource() == lifeline) {
            if(count == 2|| count == 4 || count == 6 || count == 8 || count ==9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
    }

    @SuppressWarnings("ConstantConditions")
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left - "+ timer + " seconds ";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma",Font.BOLD,22));


        if(timer > 0){
            g.drawString(time,1100,500);
        }else{
            g.drawString("Times UP!!",1100,500);
        }

        timer --;

        try{
            Thread.sleep(1000);
           repaint();
        }catch(Exception e){
            e.printStackTrace();
        }

        if(ans_given == 1){
            ans_given =0;
            timer = 25;
        }

        if(timer < 0){
            timer = 25;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if(count == 18){
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            if(count == 19){
                if(options.getSelection() == null) {
                    pa[count][0] = "";
                }else{
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                for(int i =0;i < pa.length; i++){
                    if(pa[i][0].equals(qa[i][1])){
                        score+=10;
                    }else{
                        score+=0;
                    }
                }
                this.setVisible(false);
                new score(username,score).setVisible(true);
            }else{
                if(options.getSelection() == null) {
                    pa[count][0] = "";
                }else{
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }


        }

    }



    public void start(int count){
        qno.setText("" + (count+1) + ".");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();



    }
    public static void main(String[] args)
    {
        new Quiz("").setVisible(true);
    }


}
