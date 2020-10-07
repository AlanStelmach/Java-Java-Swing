import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temp extends JFrame implements ActionListener {

    private JLabel C, F, K;
    private JTextField tC, tF, tK;
    private JButton button, breturn, bmenu;
    private double tempC, tempF, tempK;
    private ButtonGroup bg1;
    private JRadioButton CtoF, FtoC, CtoK, KtoC, FtoK, KtoF;
    JMenu submenu2, submenu3, submenu4;
    JMenuBar menubar;
    JMenuItem Wopen, TTopen, Iopen;
    public static int z;

    public Temp()
    {
        setSize(500,400);
        setTitle("Przelicznik temperatur");
        setLayout(null);
        C = new JLabel("Stopnie C");
        F = new JLabel("Stopnie F");
        K = new JLabel("Stopnie K");
        C.setBounds(20,20,150,20);
        F.setBounds(20,70,150,20);
        K.setBounds(20,120,150,20);
        add(C);
        add(F);
        add(K);
        tC = new JTextField();
        tF = new JTextField();
        tK = new JTextField();
        tC.setBounds(170,20,150,20);
        tF.setBounds(170,70,150,20);
        tK.setBounds(170,120,150,20);
        add(tC);
        add(tF);
        add(tK);
        button = new JButton("Przelicz");
        button.setBounds(170,160,150,20);
        button.addActionListener(this);
        add(button);
        tC.addActionListener(this);
        tF.addActionListener(this);
        tK.addActionListener(this);
        bg1 = new ButtonGroup();
        CtoF = new JRadioButton("C na F", true);
        FtoC = new JRadioButton("F na C", false);
        CtoK = new JRadioButton("C na K", false);
        KtoC = new JRadioButton("K na C", false);
        FtoK = new JRadioButton("F na K", false);
        KtoF = new JRadioButton("K na F", false);
        CtoF.setBounds(100,200,80,20);
        FtoC.setBounds(100,230,80,20);
        CtoK.setBounds(200,200,80,20);
        KtoC.setBounds(200,230,80,20);
        FtoK.setBounds(300,200,80,20);
        KtoF.setBounds(300,230,80,20);
        bg1.add(CtoF);
        bg1.add(FtoC);
        bg1.add(CtoK);
        bg1.add(KtoC);
        bg1.add(FtoK);
        bg1.add(KtoF);
        add(CtoF);
        add(FtoC);
        add(CtoK);
        add(KtoC);
        add(FtoK);
        add(KtoF);
        menubar = new JMenuBar();
        submenu2 = new JMenu("Przelicznik walut");
        submenu3 = new JMenu("Przeliczanie średniej temperatury tygodniowo");
        submenu4 = new JMenu("O aplikacji");
        Wopen = new JMenuItem("Otwórz");
        TTopen = new JMenuItem("Otwórz");
        Iopen = new JMenuItem("Otwórz");
        setJMenuBar(menubar);
        menubar.add(submenu2);
        menubar.add(submenu3);
        menubar.add(submenu4);
        submenu2.add(Wopen);
        submenu3.add(TTopen);
        submenu4.add(Iopen);
        Wopen.addActionListener(this);
        TTopen.addActionListener(this);
        Iopen.addActionListener(this);
        tC.setToolTipText("Podaj temperaturę w stopniach C");
        tF.setToolTipText("Podaj temperaturę w stopniach F");
        tK.setToolTipText("Podaj temperaturę w stopniach K");
        breturn = new JButton("Cofnij");
        breturn.setBounds(140,270,200,20);
        breturn.addActionListener(this);
        add(breturn);
        bmenu = new JButton("Menu");
        bmenu.setBounds(140,300,200,20);
        bmenu.addActionListener(this);
        add(bmenu);
    }
    public static void main(int x)
    {
        z=x;
        Temp apk = new Temp();
        apk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        apk.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        if(obj==button)
        {
            if(CtoF.isSelected())
            {
                tempC = Double.parseDouble(tC.getText());
                tempF = 32.0+9.0/5.0*tempC;
                tF.setText(String.valueOf(tempF));
            }
            else if(FtoC.isSelected())
            {
                tempF = Double.parseDouble(tF.getText());
                tempC = (tempF-32.0)*5.0/9.0;
                tC.setText(String.valueOf(tempC));
            }
            else if(CtoK.isSelected())
            {
                tempC = Double.parseDouble(tC.getText());
                tempK =  tempC + 273.15;
                tK.setText(String.valueOf(tempK));
            }
            else if(KtoC.isSelected())
            {
                tempK = Double.parseDouble(tK.getText());
                tempC = tempK - 273.15;
                tC.setText(String.valueOf(tempC));
            }
            else if(FtoK.isSelected())
            {
                tempF = Double.parseDouble(tF.getText());
                tempK = (tempF + 459.67) * 5/9;
                tK.setText(String.valueOf(tempK));
            }
            else if(KtoF.isSelected())
            {
                tempK = Double.parseDouble(tK.getText());
                tempF = (tempK * 1.8) - 459.67;
                tF.setText(String.valueOf(tempF));
            }
        }
        if(obj==tC)
        {
            if(CtoF.isSelected())
            {
                tempC = Double.parseDouble(tC.getText());
                tempF = 32.0+9.0/5.0*tempC;
                tF.setText(String.valueOf(tempF));
            }
            else if(CtoK.isSelected())
            {
                tempC = Double.parseDouble(tC.getText());
                tempK =  tempC + 273.15;
                tK.setText(String.valueOf(tempK));
            }
            else if(FtoC.isSelected() || FtoK.isSelected() || KtoC.isSelected() || KtoF.isSelected())
            {
                Error1.main();
            }
        }
        else if(obj==tF)
        {
            if(FtoC.isSelected())
            {
                tempF = Double.parseDouble(tF.getText());
                tempC = (tempF-32.0)*5.0/9.0;
                tC.setText(String.valueOf(tempC));
            }
            else if(FtoK.isSelected())
            {
                tempF = Double.parseDouble(tF.getText());
                tempK = (tempF + 459.67) * 5/9;
                tK.setText(String.valueOf(tempK));
            }
            else if(CtoF.isSelected() || CtoK.isSelected() || KtoC.isSelected() || KtoF.isSelected())
            {
                Error1.main();
            }
        }
        else if(obj==tK)
        {
            if(KtoC.isSelected())
            {
                tempK = Double.parseDouble(tK.getText());
                tempC = tempK - 273.15;
                tC.setText(String.valueOf(tempC));
            }
            else if(KtoF.isSelected())
            {
                tempK = Double.parseDouble(tK.getText());
                tempF = (tempK * 1.8) - 459.67;
                tF.setText(String.valueOf(tempF));
            }
            else if(CtoF.isSelected() || CtoK.isSelected() || FtoC.isSelected() || FtoK.isSelected())
            {
                Error1.main();
            }
        }
        if (obj==breturn)
        {
            if(z==1)
            {
                New_window.main();
                dispose();
            }
            else if(z==3)
            {
                Waluty.main(2);
                dispose();
            }
            else if(z==4)
            {
                TTemp.main(2);
                dispose();
            }
            else if(z==5)
            {
                Info.main(2);
                dispose();
            }
        }
        else if(obj==Iopen)
        {
            Info.main(2);
            dispose();
        }
        else if(obj==Wopen)
        {
            Waluty.main(2);
            dispose();
        }
        else if(obj==TTopen)
        {
            TTemp.main(2);
            dispose();
        }
        else if(obj==bmenu)
        {
            New_window.main();
            dispose();
        }
    }
}