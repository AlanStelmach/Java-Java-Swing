import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Error1 extends JFrame implements ActionListener {

    JButton ok;
    JLabel lab1, lab2;

    public Error1()
    {
        setSize(300,150);
        setTitle("Error");
        setLayout(null);
        ok = new JButton("Ok");
        ok.setBounds(90,60,100,20);
        ok.addActionListener(this);
        add(ok);
        lab1 = new JLabel("Błąd! Użyłeś złego sposobu przeliczania!");
        lab1.setBounds(20,0,300,30);
        add(lab1);
        lab2 = new JLabel("Zmień sposób przeliczania i spróbuj ponownie!");
        lab2.setBounds(10,20,300,30);
        add(lab2);
    }
    public static void main()
    {
        Error1 error = new Error1();
        error.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        error.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }
}