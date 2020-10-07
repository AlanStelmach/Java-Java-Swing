import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Info extends JFrame implements ActionListener {

    JButton exit, bmenu;
    JLabel lab1, lab2, lab3, lab4, lab5, lab6;
    public static int z;

    public Info()
    {
        setSize(500,200);
        setTitle("O aplikacji");
        setLayout(null);
        exit = new JButton("Cofnij");
        exit.setBounds(140,100,200,20);
        exit.addActionListener(this);
        add(exit);
        lab1 = new JLabel("Autorem aplikacji jest:");
        lab1.setBounds(80,10,150,30);
        add(lab1);
        lab2 = new JLabel("Alan Stelmach");
        lab2.setBounds(250,10,150,30);
        add(lab2);
        lab3 = new JLabel("Data utworzenia aplikacji:");
        lab3.setBounds(80,30,150,30);
        add(lab3);
        lab4 = new JLabel("16.06.2019r");
        lab4.setBounds(250,30,150,30);
        add(lab4);
        lab5 = new JLabel("Obecna wersja aplikacji:");
        lab5.setBounds(80,50,150,30);
        add(lab5);
        lab6 = new JLabel("Wersja 1.0");
        lab6.setBounds(250,50,150,30);
        add(lab6);
        bmenu = new JButton("Menu");
        bmenu.setBounds(140,130,200,20);
        bmenu.addActionListener(this);
        add(bmenu);
    }
    public static void main(int x)
    {
        z=x;
        Info info = new Info();
        info.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        info.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj==exit)
        {
            if (z == 1) {
                New_window.main();
                dispose();
            } else if (z == 3) {
                Waluty.main(5);
                dispose();
            } else if (z == 4) {
                TTemp.main(5);
                dispose();
            } else if (z == 2) {
                Temp.main(5);
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