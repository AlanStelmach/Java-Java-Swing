import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Error2 extends JFrame implements ActionListener {

    JButton ok;
    JLabel lab1, lab2;

    public Error2()
    {
        setSize(300,150);
        setTitle("Error");
        setLayout(null);
        ok = new JButton("Ok");
        ok.setBounds(90,60,100,20);
        ok.addActionListener(this);
        add(ok);
        lab1 = new JLabel("Przeliczanie danej wartości waluty");
        lab1.setBounds(40,0,300,30);
        add(lab1);
        lab2 = new JLabel("na tą samą walutę nie ma sensu :)");
        lab2.setBounds(40,20,300,30);
        add(lab2);
    }
    public static void main()
    {
        Error2 error = new Error2();
        error.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        error.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }
}