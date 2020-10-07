import java.io.EOFException;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Program MAIN. Podaj wartość: [1-4]");
        int total = scan.nextInt();
        switch (total)
        {

            case 1: {
                // --- LESSON1 ---

                // Ctrl+A + Ctrl+L wyrównanie

                System.out.println("Hello World!");

                // final - stała

                int i = 0;
                int j = 2;
                for (; ; ) {
                    System.out.println(i);
                    i++;
                    if (i == 1000) {
                        break;
                    }
                }

                // Math.sqrt(); Math.cbrt() - sześcienny

                double p = Math.pow(j, 2);
                System.out.println(p);

                String s1 = "Witaj";
                String s2 = s1.substring(0, 3);

                System.out.println(s1);
                System.out.println(s2);


                int l1 = scan.nextInt();
                System.out.println(l1);

                scan.nextLine(); // czyszczenie skanera

                String s3 = scan.nextLine();
                System.out.println(s3);

                switch (l1) {
                    case 1:
                        System.out.println("To 1");
                        break;
                    case 2:
                        System.out.println("To 2");
                        break;
                    default:
                        System.out.println("To " + l1);
                        break;
                }

                //if -> else if -> else, for, while, do...while, switch (z) {case 1: break; ... default:} itd.

                // Ctrl + Shift + / Fajne opcje!
                // Ctrl + /
            }
            case 2: {
                // --- LESSON2 ---

                int liczba, count = 0, reszta, suma = 0;
                liczba = scan.nextInt();

                for (int i1 = 1; i1 <= liczba; i1++) {
                    if (liczba % i1 == 0)
                        count++;
                }

                if (count == 2) {
                    int liczba2 = liczba;
                    System.out.println("Jest pierwsza");
                    int count1 = 0;
                    while (liczba != 0) {
                        reszta = liczba % 10;
                        suma += reszta;
                        liczba = liczba / 10;
                    }
                    for (int i2 = 1; i2 <= suma; i2++) {
                        if (suma % i2 == 0)
                            count1++;
                    }
                    if (count1 == 2) {
                        System.out.println("Liczba jest super-pierwsza");
                        int[] tab = new int[20];
                        int suma2 = 0, count3 = 0;
                        for (int i3 = 0; liczba2 > 0; i3++) {
                            tab[i3] = liczba2 % 2;
                            liczba2 = liczba2 / 2;
                        }
                        for (int i4 = 0; i4 < tab.length; ++i4) {
                            suma2 += tab[i4];
                        }
                        for (int i5 = 1; i5 <= suma2; i5++) {
                            if (suma2 % i5 == 0)
                                count3++;
                        }
                        if (count3 == 2)
                            System.out.println("Liczba jest B-super-pierwsza");
                    }
                } else if (count > 2) {
                    int suma1 = 0;
                    for (int i1 = 1; i1 < liczba; i1++) {
                        if (liczba % i1 == 0) {
                            suma1 += i1;
                        }
                    }
                    if (suma1 == liczba) {
                        System.out.println("Jest doskonała");
                    }
                }

                int x = 3;
                int y = x > 5 ? x - 3 : x + 3;
                System.out.println(y);

                // FOR, FOREACH, WHILE, Do ... WHILE

                int ale = 1;
                for (; ; ) {
                    double d = 123;
                    double pow1 = Math.pow(d, ale);
                    ale++;
                    System.out.println(pow1);
                    break;
                }


                String binary[] = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
                int a = 3;
                int b = 6;
                int c = a | b;
                int d = a & b;
                int e = a ^ b;
                int f = (~a & b) | (a & ~b);
                int g = ~a & 0x0f;
                System.out.println(binary[a]);
                System.out.println(binary[b]);
                System.out.println(binary[c]);
                System.out.println(binary[d]);
                System.out.println(binary[e]);
                System.out.println(binary[f]);
                System.out.println(binary[g]);

                // int b = ++a; - najpierw inkrementuje, potem przypisanie , int b = a++; - najpierw przypisanie, inkrementacja potem
                // if () else if else > < >= <= == != && ||
                break;
            }
            case 3: {
                // --- LESSON 3 ---

                Class.main();
                //OK.main();
                //A_lot_of_threads.main();
                /*TypeClass<Integer> typeClass = new TypeClass<>(5);
                System.out.println(typeClass.getObj());
                typeClass.showObj();
                typeClass.main();
                System.out.println("----------------------");
                TypeClass<String> typeClass1 = new TypeClass<>("ABCD");
                System.out.println(typeClass1.getObj());
                typeClass1.showObj();
                typeClass1.main();*/
                //Zadania.main();
                //Extended.main();
                //Interface.main();
                //Program.main();
                //Object.main();
                //Swing4Life.main(1);
                /*A a = new A();
                B b = new B();
                a.i=1;
                a.j=2;
                a.show();
                b.i=2;
                b.j=5;
                b.k=6;
                b.showk();
                b.show();
                b.sh();*/
                break;
            }
            case 4:
            {
                Void Void = new Void();
                Void.Void();
                Void2 Void2 = new Void2();
                Void2.Void2();
                Void3 Void3 = new Void3();
                Void3.Void3();
                Void4 Void4 = new Void4();
                Void4.Void4(12,0);
                try {
                    Void4.Void5(12, 0);
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
                break;
            }
            default:
            {
                Main.main(null);
                break;
            }
        }
    }
}
// --- Dziedziczenie ---
class A{
    int i,j;

    void show()
    {
        System.out.println(i+" "+j);
    }
}
class B extends A
{
    int k;

    void showk()
    {
        System.out.println(k);
    }
    void sh()
    {
        System.out.println(i+ " "+ j + " " + k);
    }
}

// --- Klasy abstrakcyjne i interfejsy ---
interface Organizm {

    boolean istotaZlozonaZwody = true;

    void jedz(int pozywienie);
    void rozmnazajSie();
}


class Chomik extends Gryzon  implements Organizm, Ssak {
// nie możemy dziedziczyć po wielu klasach abstrakcyjnych
    //możemy implementować wiele interfejsów

    @Override
    public void jedz(int pozywienie) {
        boolean x = istotaZlozonaZwody;
    }

    @Override
    public void rozmnazajSie() {

    }

    @Override
    public void karmPiersia() {

    }

    @Override
    void uciekaj() {

    }
}


abstract class Gryzon {
    int waga;
    String kolor;

    abstract void uciekaj();
}

interface Ssak {
    void karmPiersia();
}

// --- Wyjątki ---

class Void
{
    public void Void()
    {
        int d,a;
        try
        {
            d=0;
            a=42/d;
            System.out.println("Tak");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Nie");
        }
        System.out.println("Ok");
    }
}

class Void2
{
    public void Void2()
    {
        Random random = new Random();
        int a=0, b=0, c=0;
        for(int i=0; i<32000; i++)
        {
            try {
                b=random.nextInt();
                c=random.nextInt();
                a=12345/(b/c);
            }
            catch (ArithmeticException e) {
                System.out.println("Tak " + e);
                a = 0;
            }
            System.out.println("a: "+a);
        }
    }
}

class Void3
{
    public void Void3()
    {
            int a=1;
            try {
                System.out.println(a);
                int b=42/a;
                int c [] = {1};
                c[42]=99;
            }
            catch (ArithmeticException e)
            {
                System.out.println("Tak "+e);
            }catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Nie " +e);
            }
            System.out.println("Ok");
        }
}

class Void4
{
    public double Void4(double x, double y)
    {
        try {
            return x / y;
        }
        catch (Throwable e)
        {
            return 0;
        }
    }
    public double Void5(double x, double y) throws Exception
    {
        return x/y;
    }
}