package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textpan,textadhar;
    JRadioButton r1,r2,r3,r4;
    JButton next;
    String formno;
    Signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 3 :-");
        l1.setFont(new Font("Raleway", Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category[] = {"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[] = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education ");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String education[] = {"Non - Graduate","Graduate","Post - Graduate","Doctorate","Others"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Ocuupation ");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        l7.setBounds(100,340,150,30);
        add(l7);

        String Occupation[] = {"Salaried","Self - Employed","Business","Student","Retired","Others"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,340,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("Pan Card Number ");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(100,390,170,30);
        add(l8);

        textpan = new JTextField();
        textpan.setFont(new Font("Raleway", Font.PLAIN,16));
        textpan.setBounds(350,390,320,30);
        add(textpan);

        JLabel l9 = new JLabel("Adhaar Number ");
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        l9.setBounds(100,440,150,30);
        add(l9);

        textadhar = new JTextField();
        textadhar.setFont(new Font("Raleway", Font.PLAIN,16));
        textadhar.setBounds(350,440,320,30);
        add(textadhar);

        JLabel l10 = new JLabel("Senior Citizen ");
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        l10.setBounds(100,490,150,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,490,100,30);
        add(r2);

        ButtonGroup buttonGroup5 = new ButtonGroup();
        buttonGroup5.add(r1);
        buttonGroup5.add(r2);

        JLabel l11 = new JLabel("Existing Account ");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(100,540,200,30);
        add(l11);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD,14));
        r3.setBackground(new Color(252,208,76));
        r3.setBounds(350,540,100,30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD,14));
        r4.setBackground(new Color(252,208,76));
        r4.setBounds(460,540,100,30);
        add(r4);

        ButtonGroup buttonGroup4 = new ButtonGroup();
        buttonGroup4.add(r3);
        buttonGroup4.add(r4);



        JLabel l12 = new JLabel("Form Number");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(700,10,200,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(800,10,500,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,18));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String rel = (String) comboBox.getSelectedItem();
            String cate = (String) comboBox2.getSelectedItem();
            String inc = (String) comboBox3.getSelectedItem();
            String edu = (String) comboBox4.getSelectedItem();
            String occ = (String) comboBox5.getSelectedItem();
            String pan = textpan.getText();
            String adhar = textadhar.getText();
            String scitizen = " ";
            if ((r1.isSelected())){
                scitizen="Yes";
            }
            else if(r2.isSelected()){
                scitizen="No";
            }
            String eAccount = " ";
            if(r3.isSelected()){
                eAccount="Yes";
            }
            else if(r4.isSelected()){
                eAccount="No";
            }

            try {
                if(textpan.getText().equals("")||textadhar.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the mandate fields");
                }
                else{
                    Con c1 = new Con();
                    String q ="insert into signup2 values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+adhar+"','"+scitizen+"','"+eAccount+"')";
                    c1.statement.executeUpdate(q);
                    new Signup3(formno);
                    setVisible(false);
                }
            }catch (Exception E){

            }
    }

    public static void main(String[] args) {
        new Signup2("");
    }

}
