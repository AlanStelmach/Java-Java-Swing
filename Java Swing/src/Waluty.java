import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Waluty extends JFrame implements ActionListener {

    JComboBox cbox1, cbox2;
    JMenu submenu1, submenu3, submenu4;
    JMenuBar menubar;
    JMenuItem Topen, TTopen, Iopen;
    JLabel lab1, lab2;
    JTextField tv1, tv2;
    JButton count, breturn, bmenu;
    Double v1, v2;
    public static int z;

    public Waluty()
    {
        setSize(600,400);
        setTitle("Przelicznik walut");
        setLayout(null);
        menubar = new JMenuBar();
        submenu1 = new JMenu("Przelicznik temperatur");
        submenu3 = new JMenu("Przeliczanie średniej temperatury tygodniowo");
        submenu4 = new JMenu("O aplikacji");
        Topen = new JMenuItem("Otwórz");
        TTopen = new JMenuItem("Otwórz");
        Iopen = new JMenuItem("Otwórz");
        setJMenuBar(menubar);
        menubar.add(submenu1);
        menubar.add(submenu3);
        menubar.add(submenu4);
        submenu1.add(Topen);
        submenu3.add(TTopen);
        submenu4.add(Iopen);
        Topen.addActionListener(this);
        TTopen.addActionListener(this);
        Iopen.addActionListener(this);
        lab1 = new JLabel("Wartość pierwszej waluty:");
        lab2 = new JLabel("Wartość po przeliczeniu na drugą walutę:");
        lab1.setBounds(20,20,250,20);
        lab2.setBounds(20,70,250,20);
        add(lab1);
        add(lab2);
        tv1 = new JTextField();
        tv2 = new JTextField();
        tv1.setBounds(270,20,150,20);
        tv2.setBounds(270,70,150,20);
        add(tv1);
        add(tv2);
        count = new JButton("Przelicz");
        count.setBounds(270,130,150,20);
        count.addActionListener(this);
        add(count);
        breturn = new JButton("Cofnij");
        breturn.setBounds(190,270,200,20);
        breturn.addActionListener(this);
        add(breturn);
        cbox1 = new JComboBox();
        cbox2 = new JComboBox();
        cbox1.setBounds(430,20,100,20);
        cbox2.setBounds(430,70,100,20);
        cbox1.addItem("EUR");
        cbox1.addItem("PLN");
        cbox1.addItem("USD");
        cbox2.addItem("PLN");
        cbox2.addItem("EUR");
        cbox2.addItem("USD");
        add(cbox1);
        add(cbox2);
        bmenu = new JButton("Menu");
        bmenu.setBounds(190,300,200,20);
        bmenu.addActionListener(this);
        add(bmenu);
        tv1.setToolTipText("Podaj wartość do przeliczenia");
        tv2.setToolTipText("Wynik po przeliczeniu");
    }
    public static void main(int x)
    {
        z=x;
        Waluty waluty = new Waluty();
        waluty.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        waluty.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj==breturn)
        {
            if(z==1)
            {
                New_window.main();
                dispose();
            }
            else if(z==2)
            {
                Temp.main(3);
                dispose();
            }
            else if(z==4)
            {
                TTemp.main(3);
                dispose();
            }
            else if(z==5)
            {
                Info.main(3);
                dispose();
            }
        }
        else if(obj==count) {
            String val1 = cbox1.getSelectedItem().toString();
            String val2 = cbox2.getSelectedItem().toString();
            if (val1.equals("EUR") && val2.equals("EUR"))
            {
                Error2.main();
            }
            else if (val1.equals("PLN") && val2.equals("PLN"))
            {
                Error2.main();
            }
            else if (val1.equals("USD") && val2.equals("USD"))
            {
                Error2.main();
            }
            else if (val1.equals("EUR") && val2.equals("PLN"))
            {
                v1 = Double.parseDouble(tv1.getText());
                v2 = v1*4.26;
                tv2.setText(String.valueOf(v2));
            }
            else if (val1.equals("EUR") && val2.equals("USD"))
            {
                v1 = Double.parseDouble(tv1.getText());
                v2 = v1*1.13;
                tv2.setText(String.valueOf(v2));
            }
            else if (val1.equals("PLN") && val2.equals("EUR"))
            {
                v1 = Double.parseDouble(tv1.getText());
                v2 = v1*0.23;
                tv2.setText(String.valueOf(v2));
            }
            else if (val1.equals("PLN") && val2.equals("USD"))
            {
                v1 = Double.parseDouble(tv1.getText());
                v2 = v1*0.27;
                tv2.setText(String.valueOf(v2));
            }
            else if (val1.equals("USD") && val2.equals("PLN"))
            {
                v1 = Double.parseDouble(tv1.getText());
                v2 = v1*3.77;
                tv2.setText(String.valueOf(v2));
            }
            else if (val1.equals("USD") && val2.equals("EUR"))
            {
                v1 = Double.parseDouble(tv1.getText());
                v2 = v1*0.89;
                tv2.setText(String.valueOf(v2));
            }
        }
        else if(obj==Iopen)
        {
            Info.main(3);
            dispose();
        }
        else if(obj==Topen)
        {
            Temp.main(3);
            dispose();
        }
        else if (obj==TTopen)
        {
            TTemp.main(3);
            dispose();
        }
        else if(obj==bmenu)
        {
            New_window.main();
            dispose();
        }
    }
}