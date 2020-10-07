import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.annotation.AnnotationFormatError;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadania
{
    public static void main()
    {
        /*// --- PART 1 ---
        Part1 part1 = new Part1();
        part1.main();
        // --- PART 2 ---
        Part2 part2 = new Part2();
        part2.main();
        // --- PART 3 ---
        Part3 part3 = new Part3();
        part3.main();
        // --- PART 4 ---
        Part4 part4 = new Part4();
        part4.main();
        // --- PART 5 ---
        Part5 part5 = new Part5();
        part5.main();
        // --- PART 6 ---
        Part6 part6 = new Part6();
        part6.Zoo();
        // --- PART 7 ---
        Part7 part7 = new Part7();
        part7.main();*/
        Part8 part8 = new Part8();
        part8.main();
    }
}

class Part1 {
    void main()
    {
        Scanner scan = new Scanner(System.in);
        String name, surname, city;
        System.out.println("Podaj imię:");
        name = scan.nextLine();
        System.out.println("Podaj nazwisko:");
        surname = scan.nextLine();
        System.out.println("Podaj miejscowość:");
        city = scan.nextLine();
        System.out.println("Wizytówka:");
        System.out.println(name + " " + surname + " " + city);

        System.out.println("Podaj zmienną x w m^2:");
        double x = scan.nextDouble();
        System.out.println("Podaj zmienną y w m^2:");
        double y = scan.nextDouble();
        System.out.println("Działka ma " + Math.round(x * y) + " m^2 i " + (x * y) / 100 + " arów");
        String s1, s2;
        scan.nextLine();

        System.out.println("Podaj pierwsze słowo:");
        s1 = scan.nextLine();
        System.out.println("Podaj drugie słowo:");
        s2 = scan.nextLine();
        String s3 = s1 + " " + s2;
        System.out.println(s3);

        System.out.println("Podaj kwotę brutto:");
        double k1 = scan.nextDouble();
        double k2 = k1 - (19.5 / 100 * k1 + 8 / 100 * k1 + 2.45 / 100 * k1);
        System.out.println("Twoja kwota netto to: " + k2);

        System.out.println("Remont:");
        System.out.println("Podaj powierzchnię w m^2:");
        double count1 = scan.nextDouble();
        System.out.println("Podaj wydajność farby: (m^2/l):");
        double count2 = scan.nextDouble();
        System.out.println("Podaj ilość farby w litrach:");
        double amount = scan.nextDouble();
        System.out.println("Podaj cenę za puszkę farby:");
        double price = scan.nextDouble();
        double i = count1 / count2;
        double z = i / amount;
        System.out.println("Cena za remont: " + price * z);

        System.out.println("F na C");
        double f = scan.nextDouble();
        System.out.println("Po przeliczeniu F na C: " + ((f - 32) / 1.8));

        System.out.println("M na C");
        double m = scan.nextDouble();
        System.out.println("Po przeliczeniu M na C: " + (m * 39.37));

        System.out.println("Minuty");
        int min = scan.nextInt();
        int years = 0;
        int days = 0;

        int mm = min;
        years = min / 525600;
        mm = mm - years * 525600;
        days = mm / 1440;
        System.out.println("Lata: " + years + " dni: " + days);

        System.out.println("BMI");
        double w = scan.nextDouble();
        double h = scan.nextDouble();
        System.out.println("BMI : " + (w / h));

        System.out.println("Odległość km:");
        double km = scan.nextDouble();
        System.out.println("W ile h:");
        int hours = scan.nextInt();
        System.out.println("W ile mm:");
        int mm1 = scan.nextInt();
        System.out.println("W ile sec:");
        int sec = scan.nextInt();
        double result1 = km / hours;
        System.out.println(result1);
        double result2 = km / (hours * 60 + mm1);
        System.out.println(result2);
        double result3 = km / (hours * 60 + mm1 * 60 + sec);
        System.out.println(result3);

        System.out.println("Podaj dwie liczby całkowite:");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((a + b) / 2);
        if (a > b) {
            System.out.println(a - b);
        } else if (b > a) {
            System.out.println(b - a);
        } else {
            System.out.println("Default");
        }
        if (a > b) {
            System.out.println(a);
        } else if (b > a) {
            System.out.println(b);
        } else {
            System.out.println("Są równe!");
        }
        if (a < b) {
            System.out.println(a);
        } else if (b < a) {
            System.out.println(b);
        } else {
            System.out.println("Są równe!");
        }

        System.out.println("Podaj zmienną: ");
        int xyz = scan.nextInt();
        if (xyz % 2 == 0) {
            System.out.println("Parzysta!");
            System.out.println(true + " 1");
        } else if (xyz % 2 != 0) {
            System.out.println("Nieparzysta!");
            System.out.println(false + " 0");
        } else {
            System.out.println("Default");
        }
        int tab[] = new int[4];
        for (int i1 = 0; i < 4; i++) {
            System.out.println("Podaj zmienną nr " + i + 1);
            tab[i1] = scan.nextInt();
        }

        if (tab[0] == tab[1] && tab[0] == tab[2] && tab[0] == tab[3]) {
            System.out.println("Wszystkie są równe!");
        } else {
            System.out.println("Wszystkie są różne!");
        }
    }
}

class Part2 {
    void main()
    {
            Scanner scan = new Scanner(System.in);
            double PI = Math.PI;
            System.out.format("%.5f%n", PI);
            System.out.println(PI);
            double pow1 = Math.pow(PI, 2);
            System.out.format("%.2f%n", pow1);
            System.out.println("Promień:");
            double r = scan.nextDouble();
            double obj = 4 / 3 * Math.PI * Math.cbrt(r);
            System.out.format("%.2f%n", obj);
            int a = 37;
            int b = 11;
            int wynik1 = a / b;
            System.out.println(wynik1);
            double wynik2 = (double) a / (double) b;
            System.out.println(wynik2 - wynik1);

            System.out.println("Podaj x i y:");
            float x = scan.nextFloat();
            float y = scan.nextFloat();
            System.out.format("%.2f%n", x + y);
            System.out.format("%.2f%n", x - y);
            System.out.format("%.2f%n", x * y);
            System.out.format("%.2f%n", x / y);

            System.out.println("Podaj x i y ponownie:");
            double c = scan.nextDouble();
            double d = scan.nextDouble();
            System.out.println(c * d);

            Random random = new Random();
            System.out.println("Podaj imię Twojego Pokemon'a:");
            String imie1 = scan.nextLine();
            String imie2 = scan.nextLine();
            int lvl1 = random.nextInt(900) + 100;
            int lvl2 = random.nextInt(900) + 100;
            Pokemon pok1 = new Pokemon(imie1, lvl1);
            Pokemon pok2 = new Pokemon(imie2, lvl2);
            char c1, c2;

            c1 = 87;
            c2 = 'Y';
            System.out.println(c1 + " " + c2);
            c1++;
            c1--;
            char c3 = 0;
            for (; ; ) {
                System.out.println(c3);
                c3++;
                if (c3 == 256) {
                    break;
                }
            }


            int tab[];
            int tab2[][] = new int[4][5];
            tab = new int[10];
            int i = 0;
            for (; ; ) // int i=0; i<tab.lenght; i++
            {
                tab[i] = random.nextInt(random.nextInt(random.nextInt(1000) + 1000) + random.nextInt(1000) + 1000) + random.nextInt(random.nextInt(100) + 100) + random.nextInt(100) + 100;
                System.out.println(tab[i]);
                i++;
                if (i == tab.length - 1) {
                    break;
                }
            }
            for (int j = 0; j < tab2.length; j++) {
                for (int k = 0; k < tab2[j].length; k++) {

                    tab2[j][k] = i;
                    i++;
                    System.out.println(tab2[j][k]);
                }
            }
            int x1 = 42;
            double y1 = 42.25;
            System.out.println(x1 % 10);
            System.out.println(y1 % 10);
    }
}

class Part3
{
    void main()
    {
        Scanner scan = new Scanner(System.in);
        double a,b,c;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        if((Math.pow(a,2)+Math.pow(b,2))==Math.pow(c,2))
        {
            System.out.println("Jest prostokątny!");
        }
        else
        {
            System.out.println("Nie :))");
        }
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        double delta = Math.pow(b,2) - 4*a*c;
        if(delta==0)
        {
            System.out.format("%.2f%n",-b/2*a);
        }
        else if (delta>0)
        {
            System.out.format("%.2f%n",(-b-Math.sqrt(delta))/2*a);
            System.out.format("%.2f%n",(-b+Math.sqrt(delta))/2*a);
        }
        else
        {
            System.out.println("Brak rozwiązań!");
        }
        int count=0;
        if(delta==0)
        {
            count=1;
        }
        else if(delta>0)
        {
            count=2;
        }
        switch (count){
            case 1:
            {
                System.out.format("%.2f%n",-b/2*a);
                break;
            }
            case 2:
            {
                System.out.format("%.2f%n",(-b-Math.sqrt(delta))/2*a);
                System.out.format("%.2f%n",(-b+Math.sqrt(delta))/2*a);
                break;
            }
            default:
            {
                System.out.println("Brak miejsc zerowych!");
            }
        }
        for(;;)
            {
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        if(a==0)
        {
            System.out.println("Błąd");
            break;
        }
        else
        {
            System.out.format("%.2f%n",(c-b)/a);
        }
        }
        Random random = new Random();
        int x = scan.nextInt();
        int z = random.nextInt(9);
        if(x==z)
        {
            System.out.println("Gratuluję!");
        }
        else
        {
            System.out.println("Nope!");
        }

        x = scan.nextInt();
        if(x>20)
        {
            System.out.println("Ciepło!");
        }
        else if(x<=20 && x>10)
        {
            System.out.println("Tak sobie!");
        }
        else
        {
            System.out.println("Zimno!");
        }

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }
        }
        else if(b>a)
        {
            if(b>c)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }
        else if(c>a)
        {
            if(c>b)
            {
                System.out.println(c);
            }
            else
            {
                System.out.println(b);
            }
        }

        x = scan.nextInt();
        if(x==0)
        {
            System.out.println("Zero!");
        }
        else if(x>0)
        {
            System.out.println("Dodatnia!");
            if(Math.abs(x)>1000000)
            {
                System.out.println("Duża");
            }
            else
            {
                System.out.println("Mała");
            }
        }
        else if(x<0)
        {
            System.out.println("Ujemna!");
            if(Math.abs(x)>1000000)
            {
                System.out.println("Duża");
            }
            else
            {
                System.out.println("Mała");
            }
        }
        int q, w, e;
        q = scan.nextInt();
        w = scan.nextInt();
        e = scan.nextInt();

        if(q>w)
        {
            if(q>e)
            {
                System.out.println(q);
            }
            else
            {
                System.out.println(e);
            }
        }
        else if(w>q)
        {
            if(w>e)
            {
                System.out.println(w);
            }
            else
            {
                System.out.println(e);
            }
        }
        else if(e>q)
        {
            if(e>w)
            {
                System.out.println(e);
            }
            else
            {
                System.out.println(w);
            }
        }
    }
}

class Part4
{
    void main()
    {
        System.out.println("Pętla FOR");
        for(int x=0; x<=10; x++)
        {
            System.out.println("y = 3 * " + x + " = " + 3 * x);
        }
        System.out.println("Pętla DO - WHILE");
        int x=0;
        do {
            System.out.println("y = 3 * " + x + " = " + 3 * x);
            x++;
        }while(x<=10);
        System.out.println("Pętla WHILE");
        x=0;
        while(x<=10)
        {
            System.out.println("y = 3 * " + x + " = " + 3 * x);
            x++;
        }
        System.out.println();
        x=0;
        System.out.println("1-20 FOR");
        for(;;)
        {
            System.out.println(x);
            x++;
            if (x==21)
                break;
        }
        System.out.println("1-20 DO - WHILE");
        x=0;
        do {
            System.out.println(x);
            x++;
        }while(x<=20);
        System.out.println("1-20 WHILE");
        x=0;
        while (x<=20)
        {
            System.out.println(x);
            x++;
        }
        System.out.println();
        System.out.println("SUM FOR");
        x=0;
        int sum=0;
        for(;;)
        {
            sum+=x;
            x++;
            if(x==101)
                break;
        }
        System.out.println(sum);
        System.out.println("SUM DO - WHILE");
        x=0;
        sum=0;
        do {
            sum+=x;
            x++;
        }while(x<=100);
        System.out.println(sum);
        System.out.println("SUM WHILE");
        x=0;
        sum=0;
        while(x<=100)
        {
            sum+=x;
            x++;
        }
        System.out.println(sum);
        System.out.println();
        System.out.println("SUM %2 FOR");
        x=0;
        sum=0;
        for(;;)
        {
            if(x%2==0)
            {
                sum+=x;
            }
            x++;
            if(x==101)
                break;
        }
        System.out.println(sum);
        System.out.println("SUM %2 DO - WHILE");
        x=0;
        sum=0;
        do {
            if(x%2==0)
            {
                sum+=x;
            }
            x++;
        }while(x<=100);
        System.out.println(sum);
        System.out.println("SUM %2 WHILE");
        x=0;
        sum=0;
        while(x<=100)
        {
            if (x%2==0)
            {
                sum+=x;
            }
            x++;
        }
        System.out.println(sum);
        System.out.println();
        Random random = new Random();
        int max=0;
        int min=9;
        sum=0;
        int [] tab = new int[5];
        for(int i=0;i<5;i++)
        {
            tab[i]=random.nextInt(9);
        }
        for(int i=0;i<tab.length;i++)
        {
            if(max<tab[i])
            {
                max=tab[i];
            }
            if(min>tab[i])
            {
                min=tab[i];
            }
            sum+=tab[i];
        }
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
        System.out.println("AVG: " + (double)sum/5);
        System.out.println();
        System.out.println("----------------------");
        System.out.println();
        max=0;
        min=9;
        sum=0;
        int i=0;
        while(i<tab.length)
        {
            if(max<tab[i])
            {
                max=tab[i];
            }
            if(min>tab[i])
            {
                min=tab[i];
            }
            sum+=tab[i];
            i++;
        }
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
        System.out.println("AVG: " + (double)sum/5);
        System.out.println();
        for(int z=1; z<=100; z++)
        {
            for (int y=1; y<=100; y++)
            {
                System.out.println("Result: " + z*y);
            }
        }
        System.out.println();
        for(int z=65; z<=90; z++)
        {
            System.out.println((char)z);
        }
    }
}
class Part5
{
    void main()
    {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        box box = new box();
        box.getData(a,b);
        box.doMath();
        box.showResult();
        System.out.println("-_-_-_-_-_-_-_-_-_-");
        float c = scan.nextFloat();
        float d = scan.nextFloat();
        float e = scan.nextFloat();
        sqrt sqrt = new sqrt();
        sqrt.getData(c,d,e);
    }
}
class box
{
    private float a;
    private float b;
    private float result;
    void getData(float a, float b)
    {
        this.a=a;
        this.b=b;
    }
    void doMath()
    {
        result=a*b;
    }
    void showResult()
    {
        System.out.println("A: " + a + " B: " + b + " Result: " + result);
    }
}
class sqrt
{
    private float a, b, c, delta, r1, r2;
    private  float result;
    int fake;
    void getData(float a, float b, float c)
    {
        if(a==0)
        {
            System.out.println("Result: " + (-1*c)/b);
        }
        else {
            this.a = a;
            this.b = b;
            this.c = c;
            doMath();
        }
    }
    void doMath()
    {
        delta=(float)Math.pow(b,2)-4*a*c;
        int d;
        if (delta==0)
        {
            d=1;
        }
        else if(delta>0)
        {
            d=2;
        }
        else
        {
            d=3;
        }
        switch (d)
        {
            case 1:
            {
                result=(-1*b)/2*a;
                showResult();
                break;
            }
            case 2:
            {
                r1=(float) (-1*b-Math.sqrt(delta))/2*a;
                r2=(float) (-1*b+Math.sqrt(delta))/2*a;
                fake=1;
                showResult();
                break;
            }
            case 3:
            {
                result=0;
                showResult();
                break;
            }
            default:
            {
                break;
            }
        }
    }
    void showResult()
    {
        if (fake==1)
        {
            System.out.println("A: " + a + " B: " + b + " C: " + c + " X1: " + r1 + " X2: " + r2);
        }
        else if(result==0)
        {
            System.out.println("Brak rozwiązań!");
        }
        else
        {
            System.out.println("X: " + result);
        }
    }
}
 class Part6{
    void Zoo()
    {
        Elephant elephant = new Elephant();
        elephant.age=3;
        elephant.name="Elephant";
        elephant.weight=(float)4500.99;
        elephant.Eat(250);
        elephant.color="Grey";
        elephant.has_fangs=true;
        elephant.Do_Sound();
        Giraffe giraffe = new Giraffe();
        giraffe.age=4;
        giraffe.name="Giraffe";
        giraffe.weight=(float)800;
        giraffe.Eat(250);
        giraffe.height=(float)6;
        giraffe.Eat_From_Tree();
        Tiger tiger = new Tiger();
        tiger.age=2;
        tiger.name="Tiger";
        tiger.weight=(float)100;
        tiger.Eat(250);
        tiger.fur_color="Orange-Black-White";
        tiger.Eating_Meat=true;
        tiger.Eat_The_Prey();

    }
 }
 class Animal{
    public float weight;
    public int age;
    public String name;
    public void Eat(float x)
    {
        weight=weight+x;
    }
 }
 class Elephant extends Animal
 {
     public String color;
     public boolean has_fangs;
     public void Do_Sound()
     {
         System.out.println("Making sound!");
     }
 }
 class Giraffe extends Animal
 {
     public float height;
     public void Eat_From_Tree()
     {
         System.out.println("I'm eating!");
     }
 }
 class Tiger extends Animal
 {
    public String fur_color;
    public boolean Eating_Meat;
    public void Eat_The_Prey()
    {
        System.out.println("I'm eating!");
    }
    public void Eat(float x)
    {
        weight=weight+x;
    }
 }

 class Part7
 {
     void main() {

         String str="";
         File file = new File("D:\\Użytkownicy\\Alan\\Test\\text.txt");

         ArrayList <Character> characters = new ArrayList<>();
         int u=0;

         try {
             FileReader fileReader = new FileReader(file);
             int c;
             while ((c = fileReader.read()) != -1) {
                 characters.add((char)c);
                 str+=characters.get(u);
                 u++;
             }
            System.out.println(characters.size());
            fileReader.close();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }

        String [] Strtab = new String[str.length()];
        char [] Chtab = new char[str.length()];
        int count=0;
        int index;
        int i;
        for (i=0; i<str.length();i++)
        {
            Chtab[i]=str.charAt(i);
        }
        System.out.println("Liczba znaków w pliku wynosi: "+ i);
        index=i;
         for (i=0; i<Chtab.length;i++)
         {
             if(Chtab[i]==' ' || Chtab[i]=='\t' || Chtab[i]=='\n')
             {
                 count++;
             }
         }
         System.out.println("Liczba białych znaków: "+count);
        Strtab=str.split(" ");
        System.out.println("Liczba wyrazów w napisie: "+Strtab.length);

        int [] tab = new int[3];
         System.out.println();
        tab[0]=index;
        tab[1]=count;
        tab[2]=Strtab.length;
        for(i=0;i<tab.length;i++)
        {
            System.out.println((i+1)+": "+tab[i]);
        }
     }
 }

 class Part8
 {
     void main()
     {
         Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        person.Initialize();
        person.Print();
        Staff staff = new Staff();
        staff.Initialize();
        staff.Print();
        Outpost outpost = new Outpost();
         System.out.println("Menu: ");
         System.out.println("1. Dodaj list");
         System.out.println("2. Dodaj paczkę");
         System.out.println("3. Usuwanie");
         System.out.println("4. Pokaż");
         System.out.println();
         System.out.println("Wybierz opcję: ");
         int i=scanner.nextInt();
         switch (i)
         {
             case 1:
             {
                 outpost.AddLetter();
                 break;
             }
             case 2:
             {
                 outpost.AddPackage();
                 break;
             }
             case 3:
             {
                 outpost.Delete();
                 break;
             }
             case 4:
             {
                 outpost.Show();
                 break;
             }
             default:
             {
                 scanner.nextLine();
                 System.out.println("Błędna wartość!");
                 String wait=scanner.nextLine();
                 Part8 part8 = new Part8();
                 part8.main();
                 break;
             }
         }
     }
 }

 class Person
 {
     String name;
     String surname;
     String address;
     String postcode;
     String city;

     void Initialize()
     {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Podaj imię: ");
         name=scanner.nextLine();
         System.out.println("Podaj nazwisko: ");
         surname=scanner.nextLine();
         System.out.println("Podaj adres: ");
         address=scanner.nextLine();
         System.out.println("Podaj kod pocztowy: ");
         postcode=scanner.nextLine();
         System.out.println("Podaj miasto: ");
         city=scanner.nextLine();
     }

     void Print()
     {
         System.out.println("Imie: " + name + " Nazwisko: " + surname + " Adres: " + address + " Kod pocztowy: " + postcode + " Nazwa miasta: " + city);
     }
 }

 class Staff extends Person
 {
     String education;
     String position;

     void Initialize()
     {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Podaj wykształcenie: ");
         education=scanner.nextLine();
         System.out.println("Podaj stanowisko: ");
         position=scanner.nextLine();
     }

     void Print()
     {
         System.out.println("Imie: " + name + " Nazwisko: " + surname + " Adres: " + address + " Kod pocztowy: " + postcode + " Nazwa miasta: " + city + " Wykształcenie: " + education + " Stanowisko: " + position);
     }
 }

 class Letter
 {
    String sendesurrname;
    String recipientsurname;
    String senderaddress;
    String recipientaddress;
    String senderpostcode;
    String recipientpostcode;
    boolean registered;
    boolean priority;
    static int id;

    Letter(String ss, String rs, String sa, String ra, String sp, String rp, boolean r, boolean p, int id)
    {
        sendesurrname=ss;
        recipientsurname=rs;
        senderaddress=sa;
        recipientaddress=ra;
        senderpostcode=sp;
        recipientpostcode=rp;
        registered=r;
        priority=p;
        this.id=id;
    }
     String GetSS()
    {
        return sendesurrname;
    }
     void SetSS(String a) { sendesurrname=a; }
     String GetRS()
     {
         return recipientsurname;
     }
     void SetRS(String a) { recipientsurname=a; }
     String GetSA()
     {
         return senderaddress;
     }
     void SetSA(String a) { senderaddress=a; }
     String GetRA()
     {
         return recipientaddress;
     }
     void SetRA(String a) { recipientaddress=a; }
     String GetSP()
     {
         return senderpostcode;
     }
     void SetSP(String a) { senderpostcode=a; }
     String GetRP()
     {
         return recipientpostcode;
     }
     void SetRP(String a) { recipientpostcode=a; }
     Boolean GetR() { return registered; }
     void SetR(Boolean r) { registered=r; }
     Boolean GetP()
     {
         return priority;
     }
     void SetP(boolean p)
     {
        priority=p;
     }
     int GetID()
     {
         return id;
     }
     void SetID(int i) { id=i; }

     float Payment(float price)
     {
         float total=0;
         if(registered==true && priority==true)
         {
             total=(float)(price+price*1.25);
         }
         else if(registered==true && priority==false)
         {
             total=(float)(price+price*0.5);
         }
         else if(registered==false && priority==true)
         {
             total=(float)(price+price*0.75);
         }
         return total;
     }
 }

 class Package extends Letter
 {
    float weight;
    float height;
    float width;
    float depth;
    String gauge;

    Package(String ss, String rs, String sa, String ra, String sp, String rp, boolean r, boolean p, int id, float w, float h, float wi, float d)
    {
        super(ss,rs,sa,ra,sp,rp,r,p,id);
        weight=w;
        height=h;
        width=wi;
        depth=d;
        SetGauge();
    }
    void SetGauge()
    {
        float volume = width*depth*height;
        if(weight<=1 && volume<1000)
        {
            gauge="Small";
        }
        else if (weight>1 && weight<=2 && volume<27000)
        {
            gauge="Medium";
        }
        else if (weight>2 && weight<=5 && volume<125000)
        {
            gauge="Large";
        }
        else if (weight>5 && weight<=10 && volume<421875)
        {
            gauge="Large+";
        }
    }
     float Payment()
     {
         float total=0;
         if(gauge.equals("Small"))
         {
             total=(float) 9.99;
         }
         else if(gauge.equals("Medium"))
         {
             total=(float) 13;
         }
         else if(gauge.equals("Large"))
         {
             total=(float)15.99;
         }
         else if (gauge.equals("Large+"))
         {
             total=(float)25;
         }
         return total;
     }
 }

 class Outpost
 {
     Scanner scanner = new Scanner(System.in);
    ArrayList<Letter> arrayList1;
    ArrayList<Package> arrayList2;

    void AddLetter()
    {
        String sendesurrname;
        String recipientsurname;
        String senderaddress;
        String recipientaddress;
        String senderpostcode;
        String recipientpostcode;
        boolean registered;
        boolean priority;
        int id;
        System.out.println("Podaj nazwisko nadawcy: ");
        sendesurrname=scanner.nextLine();
        System.out.println("Podaj nazwisko odbiorcy: ");
        recipientsurname=scanner.nextLine();
        System.out.println("Podaj adres nadawcy: ");
        senderaddress=scanner.nextLine();
        System.out.println("Podaj adres odbiorcy: ");
        recipientaddress=scanner.nextLine();
        System.out.println("Podaj kod pocztowy nadawcy: ");
        senderpostcode=scanner.nextLine();
        System.out.println("Podaj kod pocztowy odbiorcy: ");
        recipientpostcode=scanner.nextLine();
        System.out.println("Podaj czy paczka jest polecona [true/false]: ");
        registered=scanner.nextBoolean();
        System.out.println("Podaj czy paczka jest priorytetowa [true/false]:");
        priority=scanner.nextBoolean();
        System.out.println("Podaj id paczki: ");
        id=scanner.nextInt();
        arrayList1.add(new Letter(sendesurrname,recipientsurname,senderaddress,recipientaddress,senderpostcode,recipientpostcode,registered,priority,id));
        scanner.nextLine();
    }
    void AddPackage()
    {
        String sendesurrname;
        String recipientsurname;
        String senderaddress;
        String recipientaddress;
        String senderpostcode;
        String recipientpostcode;
        boolean registered;
        boolean priority;
        int id;
        float weight;
        float height;
        float width;
        float depth;
        System.out.println("Podaj nazwisko nadawcy: ");
        sendesurrname=scanner.nextLine();
        System.out.println("Podaj nazwisko odbiorcy: ");
        recipientsurname=scanner.nextLine();
        System.out.println("Podaj adres nadawcy: ");
        senderaddress=scanner.nextLine();
        System.out.println("Podaj adres odbiorcy: ");
        recipientaddress=scanner.nextLine();
        System.out.println("Podaj kod pocztowy nadawcy: ");
        senderpostcode=scanner.nextLine();
        System.out.println("Podaj kod pocztowy odbiorcy: ");
        recipientpostcode=scanner.nextLine();
        System.out.println("Podaj czy paczka jest polecona [true/false]: ");
        registered=scanner.nextBoolean();
        System.out.println("Podaj czy paczka jest priorytetowa [true/false]:");
        priority=scanner.nextBoolean();
        System.out.println("Podaj id paczki: ");
        id=scanner.nextInt();
        System.out.println("Podaj wagę paczki: ");
        weight=scanner.nextFloat();
        System.out.println("Podaj wysokość paczki: ");
        height=scanner.nextFloat();
        System.out.println("Podaj szerokość paczki: ");
        width=scanner.nextFloat();
        System.out.println("Podaj głębokość paczki: ");
        depth=scanner.nextFloat();
        arrayList2.add(new Package(sendesurrname,recipientsurname,senderaddress,recipientaddress,senderpostcode,recipientpostcode,registered,priority,id,weight,height,width,depth));
        scanner.nextLine();
    }
    void Delete()
    {
        System.out.println("Menu: ");
        System.out.println("1. Usunięcie listu");
        System.out.println("2. Usunięcie paczki");
        System.out.println("3. Wstecz");
        System.out.println();
        System.out.println("Wybierz opcję: ");
        int i=scanner.nextInt();
        switch (i)
        {
            case 1:
            {
                for(int j=0, k=1;j<arrayList1.size();j++)
                {
                    System.out.println(k+": "+arrayList1.get(j).sendesurrname+" "+arrayList1.get(j).recipientsurname+" "+arrayList1.get(j).senderaddress+" "+arrayList1.get(j).recipientaddress+" "+arrayList1.get(j).senderpostcode+" "+arrayList1.get(j).recipientpostcode+" "+(arrayList1.get(j).registered ? "TAK" : "NIE")+" "+(arrayList1.get(j).priority ? "TAK" : "NIE")+" "+arrayList1.get(j).id);
                }
                System.out.println();
                System.out.println("Podaj element numer elementu który chcesz usunąć: ");
                int j=scanner.nextInt();
                arrayList1.remove(j);
                break;
            }
            case 2:
            {
                for(int j=0, k=1;j<arrayList2.size();j++)
                {
                    System.out.println(k+": "+arrayList2.get(j).sendesurrname+" "+arrayList2.get(j).recipientsurname+" "+arrayList2.get(j).senderaddress+" "+arrayList2.get(j).recipientaddress+" "+arrayList2.get(j).senderpostcode+" "+arrayList2.get(j).recipientpostcode+" "+(arrayList2.get(j).registered ? "TAK" : "NIE")+" "+(arrayList2.get(j).priority ? "TAK" : "NIE")+" "+arrayList2.get(j).id+" "+arrayList2.get(j).weight+" "+arrayList2.get(j).height+" "+arrayList2.get(j).width+" "+arrayList2.get(j).depth+" "+arrayList2.get(j).gauge);
                }
                System.out.println();
                System.out.println("Podaj element numer elementu który chcesz usunąć: ");
                int j=scanner.nextInt();
                arrayList2.remove(j);
                break;
            }
            case 3:
            {
                Part8 part8 = new Part8();
                part8.main();
                break;
            }
            default:
            {
                scanner.nextLine();
                System.out.println("Błędna wartość!");
                String wait=scanner.nextLine();
                Part8 part8 = new Part8();
                part8.main();
                break;
            }
        }
    }
    void Show()
    {
        System.out.println("Menu: ");
        System.out.println("1. Listy");
        System.out.println("2. Paczki");
        System.out.println("3. Wstecz");
        System.out.println();
        System.out.println("Wybierz opcję: ");
        int i=scanner.nextInt();
        switch (i)
        {
            case 1:
            {
                for(int j=0, k=1;j<arrayList1.size();j++)
                {
                    System.out.println(k+": "+arrayList1.get(j).sendesurrname+" "+arrayList1.get(j).recipientsurname+" "+arrayList1.get(j).senderaddress+" "+arrayList1.get(j).recipientaddress+" "+arrayList1.get(j).senderpostcode+" "+arrayList1.get(j).recipientpostcode+" "+(arrayList1.get(j).registered ? "TAK" : "NIE")+" "+(arrayList1.get(j).priority ? "TAK" : "NIE")+" "+arrayList1.get(j).id);
                }
                break;
            }
            case 2:
            {
                for(int j=0, k=1;j<arrayList2.size();j++)
                {
                    System.out.println(k+": "+arrayList2.get(j).sendesurrname+" "+arrayList2.get(j).recipientsurname+" "+arrayList2.get(j).senderaddress+" "+arrayList2.get(j).recipientaddress+" "+arrayList2.get(j).senderpostcode+" "+arrayList2.get(j).recipientpostcode+" "+(arrayList2.get(j).registered ? "TAK" : "NIE")+" "+(arrayList2.get(j).priority ? "TAK" : "NIE")+" "+arrayList2.get(j).id+" "+arrayList2.get(j).weight+" "+arrayList2.get(j).height+" "+arrayList2.get(j).width+" "+arrayList2.get(j).depth+" "+arrayList2.get(j).gauge);
                }
                break;
            }
            case 3:
            {
                Part8 part8 = new Part8();
                part8.main();
                break;
            }
            default:
            {
                scanner.nextLine();
                System.out.println("Błędna wartość!");
                String wait=scanner.nextLine();
                Part8 part8 = new Part8();
                part8.main();
                break;
            }
        }

    }
 }