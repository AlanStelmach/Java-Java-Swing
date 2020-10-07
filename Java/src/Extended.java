import java.util.Scanner;

public class Extended {
    public static void main()
    {
        Lightspeed lightspeed = new Lightspeed();
        lightspeed.main();
        Conversion conversion = new Conversion();
        conversion.main();
        Digits digits = new Digits();
        digits.main();
        Promote promote = new Promote();
        promote.main();
        Box box = new Box();
        box.main();
    }
}

class Lightspeed {
    void main()
    {
        int lightspeed = 299792;
        long days=1000;
        long sec;
        long dis;

        sec=days*24*60*60;
        dis=lightspeed*sec;

        System.out.println("W " + days + " dni, światło pokona około " + dis + " kilometrów");
    }
}

class Conversion {
    void main()
    {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("Konwersja!");
        b = (byte) i;
        System.out.println(i + b);
        i = (int) d;
        System.out.println(d + i);
        b = (byte) d;
        System.out.println(d + b);
    }
}

class Digits {
    static void main()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę trzycyfrową:");
        int a = scan.nextInt();
        if(a>=100 && a<=999)
        {
            int u=a;
            int suma=0;
            for(int i=0; i<3; i++) {
                suma +=u%10;
            }
            System.out.println(suma);
        }
        else
        {
            System.out.println("Liczba nie jest 3 cyfrowa!");
            for(int i=0; i<10000; i++)
            {
                i++;
            }
            Digits.main();
        }
    }
}

class Promote {
    void main()
    {
        byte b = 42;
        char c ='a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f*b)+(i/c)-(d*s);
        System.out.println((f*b) + " + " + (i/c) + " - " + (d*s));
        System.out.println("result= " + result);
    }
}

class Box {
    void main()
    {
        double a, b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();
        b = scan.nextDouble();
        System.out.println(a*b);
    }
}

