import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class New_window extends JFrame implements ActionListener {

    JLabel lab, lab1, lab2, lab3;
    JMenu submenu1, submenu2, submenu3, submenu4;
    JMenuBar menubar;
    JButton sm1, sm2, sm3, exit;
    JMenuItem Topen, Wopen, TTopen, Iopen;

    public New_window()
    {
        setSize(800,500);
        setTitle("Panel powitalny");
        setLayout(null);
        lab = new JLabel("Witaj! Co dziś chciałbyś zrobić? :)");
        lab.setFont(new Font("SansSerif",Font.BOLD, 20));
        lab.setBounds(230,10,1000,30);
        add(lab);
        menubar = new JMenuBar();
        submenu1 = new JMenu("Przelicznik temmperatur");
        submenu2 = new JMenu("Przelicznik walut");
        submenu3 = new JMenu("Przelicznik średniej temperatury tygodniowo");
        submenu4 = new JMenu("O aplikacji");
        Topen = new JMenuItem("Otwórz");
        Wopen = new JMenuItem("Otwórz");
        TTopen = new JMenuItem("Otwórz");
        Iopen = new JMenuItem("Otwórz");
        setJMenuBar(menubar);
        menubar.add(submenu1);
        menubar.add(submenu2);
        menubar.add(submenu3);
        menubar.add(submenu4);
        submenu1.add(Topen);
        submenu2.add(Wopen);
        submenu3.add(TTopen);
        submenu4.add(Iopen);
        lab1 = new JLabel("Okno przeliczania temperatur:");
        lab1.setFont(new Font("SansSerif",Font.PLAIN, 18));
        lab1.setBounds(40,50,500,20);
        add(lab1);
        lab2 = new JLabel("Okno przeliczania walut:");
        lab2.setFont(new Font("SansSerif",Font.PLAIN, 18));
        lab2.setBounds(40,125,500,20);
        add(lab2);
        lab3 = new JLabel("Okno przeliczania średniej temperatury tygodniowo:");
        lab3.setFont(new Font("SansSerif",Font.PLAIN, 18));
        lab3.setBounds(40,200,500,20);
        add(lab3);
        sm1 = new JButton("Przelicznik Temperatur");
        sm2 = new JButton("Przelicznik Walut");
        sm3 = new JButton("Przelicznik Średniej temperatury");
        exit = new JButton("Wyjście");
        sm1.setBounds(250,85,300,20);
        sm2.setBounds(250,160,300,20);
        sm3.setBounds(250,235,300,20);
        exit.setBounds(290,400,200,20);
        add(sm1);
        add(sm2);
        add(sm3);
        add(exit);
        Topen.addActionListener(this);
        Wopen.addActionListener(this);
        TTopen.addActionListener(this);
        Iopen.addActionListener(this);
        sm1.addActionListener(this);
        sm2.addActionListener(this);
        sm3.addActionListener(this);
        exit.addActionListener(this);
    }
    public static void main()
    {
        New_window new_window = new New_window();
        new_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        new_window.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj==Topen || obj==sm1)
        {
            Temp.main(1);
            dispose();
        }
        else if(obj==Wopen || obj==sm2)
        {
            Waluty.main(1);
            dispose();
        }
        else if(obj==TTopen || obj==sm3)
        {
            TTemp.main(1);
            dispose();
        }
        else if(obj==Iopen)
        {
            Info.main(1);
            dispose();
        }
        else
        {
            dispose();
        }
    }
}