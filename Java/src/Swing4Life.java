import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Random;

public class Swing4Life extends JFrame implements ActionListener {
    Random random = new Random();
    JLabel label, label1;
    JButton button;
    String [] arrayList = new String[]{"TEST1","TEST2","TEST3","TEST4"};

    Swing4Life()
    {
        setSize(800,500);
        setTitle("Panel powitalny");
        setLayout(null);
        label = new JLabel("Alan Stelmach");
        label.setFont(new Font("SansSerif",Font.BOLD, 20));
        label.setBounds(325,10,1000,20);
        add(label);
        button = new JButton("Random");
        button.setBounds(200,40,350,20);
        add(button);
        button.addActionListener(this);
        int i = random.nextInt(arrayList.length)-1;
        String name=arrayList[i];
        label1 = new JLabel(name);
        label1.setFont(new Font("SansSerif",Font.BOLD, 20));
        label1.setBounds(325,90,1000,20);
    }

    Swing4Life(int x)
    {
        setSize(800,500);
        setTitle("Panel powitalny");
        setLayout(null);
        label = new JLabel("Alan Stelmach");
        label.setFont(new Font("SansSerif",Font.BOLD, 20));
        label.setBounds(325,10,1000,20);
        add(label);
        button = new JButton("Random");
        button.setBounds(200,40,350,20);
        add(button);
        button.addActionListener(this);
        int i = random.nextInt(4);
        String name=arrayList[i];
        label1 = new JLabel(name);
        label1.setFont(new Font("SansSerif",Font.BOLD, 20));
        label1.setBounds(325,90,1000,20);
        add(label1);
    }

    public static void main(int i)
    {
        if(i==1) {
            Swing4Life new_window = new Swing4Life();
            new_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            new_window.setVisible(true);
        }
        else
        {
            Swing4Life swing4Life = new Swing4Life(i);
            swing4Life.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            swing4Life.setVisible(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        if(object==button)
        {
            main(2);
            dispose();
        }
    }
}
