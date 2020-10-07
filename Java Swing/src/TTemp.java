import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TTemp extends JFrame implements ActionListener {

    JMenu submenu1, submenu3, submenu4;
    JMenuBar menubar;
    JMenuItem Topen, Wopen, Iopen;
    JButton breturn, count, bmenu;
    JLabel lab1, lab2, lab3, lab4, lab5, lab6, lab7, lab8;
    JTextField td1, td2, td3, td4, td5, td6, td7, wynik;
    Double t1, t2, t3, t4, t5, t6, t7, ts;
    public static int z;

    public TTemp()
    {
        setSize(500,700);
        setTitle("Przelicznik średniej temperatury w tygodniu");
        setLayout(null);
        menubar = new JMenuBar();
        submenu1 = new JMenu("Przelicznik temperatur");
        submenu3 = new JMenu("Przelicznik walut");
        submenu4 = new JMenu("O aplikacji");
        Topen = new JMenuItem("Otwórz");
        Wopen = new JMenuItem("Otwórz");
        Iopen = new JMenuItem("Otwórz");
        setJMenuBar(menubar);
        menubar.add(submenu1);
        menubar.add(submenu3);
        menubar.add(submenu4);
        submenu1.add(Topen);
        submenu3.add(Wopen);
        submenu4.add(Iopen);
        Topen.addActionListener(this);
        Wopen.addActionListener(this);
        Iopen.addActionListener(this);
        lab1 = new JLabel("Poniedziałek:");
        lab2 = new JLabel("Wtorek:");
        lab3 = new JLabel("Środa:");
        lab4 = new JLabel("Czwartek:");
        lab5 = new JLabel("Piątek:");
        lab6 = new JLabel("Sobota:");
        lab7 = new JLabel("Niedziela:");
        lab8 = new JLabel("Średnia temperatura w tym tygodniu:");
        breturn = new JButton("Cofnij");
        breturn.setBounds(140,570,200,20);
        breturn.addActionListener(this);
        add(breturn);
        lab1.setBounds(30,20,100,20);
        lab2.setBounds(30,70,100,20);
        lab3.setBounds(30,120,100,20);
        lab4.setBounds(30,170,100,20);
        lab5.setBounds(30,220,100,20);
        lab6.setBounds(30,270,100,20);
        lab7.setBounds(30,320,100,20);
        lab8.setBounds(110,370,250,20);
        add(lab1);
        add(lab2);
        add(lab3);
        add(lab4);
        add(lab5);
        add(lab6);
        add(lab7);
        add(lab8);
        count = new JButton("Przelicz");
        count.setBounds(140,470,150,20);
        count.addActionListener(this);
        add(count);
        td1 = new JTextField();
        td2 = new JTextField();
        td3 = new JTextField();
        td4 = new JTextField();
        td5 = new JTextField();
        td6 = new JTextField();
        td7 = new JTextField();
        wynik = new JTextField();
        td1.setBounds(140,20,150,20);
        td2.setBounds(140,70,150,20);
        td3.setBounds(140,120,150,20);
        td4.setBounds(140,170,150,20);
        td5.setBounds(140,220,150,20);
        td6.setBounds(140,270,150,20);
        td7.setBounds(140,320,150,20);
        wynik.setBounds(140,420,150,20);
        add(td1);
        add(td2);
        add(td3);
        add(td4);
        add(td5);
        add(td6);
        add(td7);
        add(wynik);
        bmenu = new JButton("Menu");
        bmenu.setBounds(140,600,200,20);
        bmenu.addActionListener(this);
        add(bmenu);
        td1.setToolTipText("Temperatura z Poniedziałku");
        td2.setToolTipText("Temperatura z Wtorku");
        td3.setToolTipText("Temperatura z Środy");
        td4.setToolTipText("Temperatura z Czwartku");
        td5.setToolTipText("Temperatura z Piątku");
        td6.setToolTipText("Temperatura z Soboty");
        td7.setToolTipText("Temperatura z Niedzieli");
        wynik.setToolTipText("Średnia temperatura w ciągu całego tygodnia");
    }
    public static void main(int x)
    {
        z=x;
        TTemp tTemp = new TTemp();
        tTemp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tTemp.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj==count)
        {
            t1 = Double.parseDouble(td1.getText());
            t2 = Double.parseDouble(td2.getText());
            t3 = Double.parseDouble(td3.getText());
            t4 = Double.parseDouble(td4.getText());
            t5 = Double.parseDouble(td5.getText());
            t6 = Double.parseDouble(td6.getText());
            t7 = Double.parseDouble(td7.getText());
            ts = (t1+t2+t3+t4+t5+t6+t7)/7;
            wynik.setText(String.valueOf(ts));
        }
        else if(obj==Topen)
        {
            Temp.main(4);
            dispose();
        }
        else if(obj==Wopen)
        {
            Waluty.main(4);
            dispose();
        }
        else if(obj==Iopen)
        {
            Info.main(4);
            dispose();
        }
        else if(obj==breturn)
        {
            if(z==1)
            {
                New_window.main();
                dispose();
            }
            else if(z==3)
            {
                Waluty.main(4);
                dispose();
            }
            else if(z==2)
            {
                Temp.main(4);
                dispose();
            }
            else if(z==5)
            {
                Info.main(4);
                dispose();
            }
        }
        else if(obj==bmenu)
        {
            New_window.main();
            dispose();
        }
    }
}