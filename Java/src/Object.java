import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Object {
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
       /*Array array = new Array();
        array.ReadingData();
        array.DoMath();
        array.ShowTotal();
        Cat cat1 = new Cat("YES", "BLACK", "NORMAL",(float)4.00,9);
        Cat cat2 = new Cat("NO", "WHITE", "EPIC",(float)3.78,7);
        Cat cat3 = new Cat("MAYBE", "TRI-COLOR", "LEGENDARY",(float)2.34,3);*/
        float a,b;
        char sign;
        String [] tab;
        System.out.println("Podaj działąnie matematyczne w formie \"a + b\": (+,-,*,/)");
        String func=scanner.nextLine();
        tab=func.split(" ");
        a=Float.parseFloat(tab[0]);
        sign=tab[1].charAt(0);
        b=Float.parseFloat(tab[2]);
        Calculator calculator = new Calculator(a,b,sign);
    }
}

class Array
{
    Random random = new Random();
    double [][] array = new double[10][10];
    double total=0;
    void ReadingData()
    {
        for(int i=0; i<array.length; i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                if(i==j)
                {
                    array[i][j]=random.nextInt(10);
                }
                else
                {
                    array[i][j]=0;
                }
            }
        }
        /*for(int i=0; i<array.length; i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println("\n");
        }*/
    }
    void DoMath()
    {
        for(int i=0; i<array.length; i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                if(i==j)
                {
                    total+=array[i][j];
                }
            }
        }
    }
    void ShowTotal()
    {
        System.out.println("Wynik: " + total);
        Main.main(null);
    }
}

class Cat
{
    String name;
    String color;
    String race;
    float weight;
    float age;

    void Give_a_Call()
    {
        System.out.println("Miau Motherfucker! ^^");
    }
    void Feeding()
    {
        weight=(float)(weight+weight*0.1);
    }
    void GetOld()
    {
        age+=1;
    }
    Cat(String n, String c, String r, float w, float a)
    {
        name=n;
        color=c;
        race=r;
        weight=w;
        age=a;
    }
}

class Calculator
{
    Scanner scanner = new Scanner(System.in);
    private float a;
    private float b;
    private char sign;
    private float total=0;

    Calculator(float a, float b, char sign)
    {
        this.a=a;
        this.b=b;
        this.sign=sign;
        switch (sign)
        {
            case '+':
            {
                Addition();
                break;
            }
            case '-':
            {
                Subtraction();
                break;
            }
            case  '*':
            {
                Multiplication();
                break;
            }
            case '/':
            {
                Division();
                break;
            }
            default:
            {
                System.out.println("Błąd");
                String wait = scanner.nextLine();
                Object.main();
                break;
            }
        }
    }
    void Addition()
    {
        total=a+b;
        ShowTotal();
    }
    void Subtraction()
    {
        total=a-b;
        ShowTotal();
    }
    void Multiplication()
    {
        total=a*b;
        ShowTotal();
    }
    void Division()
    {
        total=a/b;
        ShowTotal();
    }
    void ShowTotal()
    {
        System.out.println("Wynik działąnia: " + a + " " + sign + " " + b + " = " + total);
        Object.main();
    }
}