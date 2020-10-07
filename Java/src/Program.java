import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Comparator;

import java.util.concurrent.TimeUnit;

public class Program {
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Name_List> arrayList = new ArrayList<>();
        String name;
        String surname;
        String sex;
        int dep_number;
        float wage;
        int age;
        int child;
        String society;
        boolean in_mariage=Boolean.parseBoolean(null);
        String wait;
        String file_name=null;
        File file = new File("D:\\Użytkownicy\\Alan\\Test\\name.txt");
        try {
            Scanner myReader1 = new Scanner(file);
            file_name=myReader1.nextLine();
            myReader1.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        File file1 = new File("D:\\Użytkownicy\\Alan\\Test\\"+file_name);
        try
        {
            Scanner myReader2 = new Scanner(file1);
            while(myReader2.hasNextLine())
            {
                wait=myReader2.nextLine();
                String [] tab;
                tab=wait.split(" ");
                for(int i=0;i<tab[4].length();i++)
                {
                    char [] tab1=new char[tab[4].length()];
                    char c=tab[4].charAt(i);
                    if(c=='.') {
                       tab1[i]=',';
                    }
                    else
                    {
                        tab1[i]=c;
                    }
                }
                arrayList.add(new Name_List(tab[0],tab[1],tab[2].charAt(0),Integer.parseInt(tab[3]),Float.parseFloat(tab[4]),Integer.parseInt(tab[5]),Integer.parseInt(tab[6]),Boolean.parseBoolean(tab[7])));
            }
            myReader2.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        int x;
        System.out.println("Menu:");
        System.out.println("1. Lista wszystkich pracowników");
        System.out.println("2. Dodaj nowego pracownika");
        System.out.println("3. Eksport listy pracowników do pliku tekstowego");
        System.out.println("4. Usuwanie pracowników z listy pracowników");
        System.out.println("5. Edycja danych o pracownikach");
        System.out.println("6. Dodatkowe funkcje");
        System.out.println("7. Informacje o progranmie");
        System.out.println("8. Zmiana nazwy pliku z listą pracowników");
        System.out.println("9. Dodatkowe funkcje dla plików tekstowych");
        System.out.println();
        System.out.println("Podaj numer opcji którą chcesz wybrać:");
        x=scan.nextInt();
        System.out.println();

        switch (x)
        {
            case 1:
            {
                System.out.println("Liczba pracowników: " + arrayList.size());
                int j=1;
                for(int i=0;i<arrayList.size();i++)
                {
                    System.out.print(j + ": ");
                    arrayList.get(i).Short_Show();
                    j++;
                }
                System.out.println();
                System.out.println("Naciśnij Enter aby przejść do menu");
                scan.nextLine();
                wait=scan.nextLine();
                Program.main();
                break;
            }
            case 2:
            {
                System.out.println("Ilu pracowników chcesz dodać do listy pracowników:");
                int y=scan.nextInt();
                scan.nextLine();
                for(int i=0; i<y; i++)
                {
                    System.out.println("Podaj imię:");
                    name=scan.nextLine();
                    System.out.println("Podaj nazwisko:");
                    surname=scan.nextLine();
                    System.out.println("Podaj płeć: [M - Male/F - Female]");
                    sex=scan.nextLine();
                    if(sex.toUpperCase().equals("M"))
                    {

                    }
                    else if(sex.toUpperCase().equals("F"))
                    {

                    }
                    else
                    {
                        System.out.println("Błędna wartość!");
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        wait=scan.nextLine();
                        Program.main();
                        break;
                    }
                    System.out.println("Podaj numer działu:");
                    dep_number=scan.nextInt();
                    System.out.println("Podaj płace:");
                    wage=scan.nextFloat();
                    System.out.println("Podaj wiek:");
                    age=scan.nextInt();
                    System.out.println("Podaj liczbę dzieci:");
                    child=scan.nextInt();
                    scan.nextLine();
                    System.out.println("Podaj status społeczny: [TAK/NIE]");
                    society=scan.nextLine();
                    if(society.toUpperCase().equals("TAK"))
                    {
                        in_mariage=true;
                    }
                    else if(society.toUpperCase().equals("NIE"))
                    {
                        in_mariage=false;
                    }
                    else
                    {
                        System.out.println("Błędna wartość!");
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        wait=scan.nextLine();
                        Program.main();
                        break;
                    }
                    arrayList.add(new Name_List(name, surname, sex.charAt(0), dep_number, (float)wage, age, child, in_mariage));
                }
                try {
                    FileWriter fileWriter = new FileWriter(file1);
                    for(int i=0;i<arrayList.size();i++)
                    {
                        fileWriter.write(arrayList.get(i).FileSave()+"\n");
                    }
                    fileWriter.close();
                }
                catch (IOException e) {
                    e.printStackTrace();}
                System.out.println();
                System.out.println("Naciśnij Enter aby przejść do menu");
                wait=scan.nextLine();
                Program.main();
                break;
            }
            case 3:
            {
                try {
                    FileWriter fileWriter = new FileWriter(file1);
                    for(int i=0; i<arrayList.size();i++) {
                        fileWriter.write(arrayList.get(i).FileSave()+"\n");
                    }
                    fileWriter.close();
                    System.out.println("Naciśnij Enter aby przejść do menu");
                    scan.nextLine();
                    wait=scan.nextLine();
                    Program.main();
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    if(file1.exists())
                    {
                        if(file1.canRead())
                        {
                            if (file1.canWrite())
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("Plik nie ma możliwośći zapisu!");
                                System.out.println();
                                System.out.println("Naciśnij Enter aby przejść do menu");
                                wait=scan.nextLine();
                                Program.main();
                                break;
                            }
                        }
                        else
                        {
                            System.out.println("Plik nie może zostać odczytany!");
                            System.out.println();
                            System.out.println("Naciśnij Enter aby przejść do menu");
                            wait=scan.nextLine();
                            Program.main();
                            break;
                        }
                    }
                    else if (!file1.exists())
                    {
                        System.out.println("Plik nie istnieje!");
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        wait=scan.nextLine();
                        Program.main();
                        break;
                    }
                }

                break;
            }
            case 4:
            {
                System.out.println("Liczba pracowników: " + arrayList.size());
                int j=1;
                for(int i=0;i<arrayList.size();i++)
                {
                    System.out.print(j + ": ");
                    arrayList.get(i).Special_Show();
                    j++;
                }
                System.out.println("Podaj id pracownika którego chcesz usunąć:");
                int z=scan.nextInt();
                if(z>arrayList.size() && z<0)
                {
                    System.out.println("Błędna wartość!");
                    System.out.println();
                    System.out.println("Naciśnij Enter aby przejść do menu");
                    wait=scan.nextLine();
                    Program.main();
                    break;
                }
                else
                {
                    arrayList.remove(z-1);
                    try {
                        FileWriter fw = new FileWriter(file1);
                        for(int i=0;i<arrayList.size();i++)
                        {
                            fw.write(arrayList.get(i).FileSave()+"\n");
                        }
                        fw.close();
                    }
                    catch (IOException e) {
                        e.printStackTrace();}
                    System.out.println("Naciśnij Enter aby przejść do menu");
                    scan.nextLine();
                    wait=scan.nextLine();
                    Program.main();
                }
                break;
            }
            case 5:
            {
                System.out.println("Liczba pracowników: " + arrayList.size());
                int j=1;
                for(int i=0;i<arrayList.size();i++)
                {
                    System.out.print(j + ": ");
                    arrayList.get(i).Short_Show();
                    j++;
                }
                System.out.println("Podaj id pracownika którego chcesz wyedytować:");
                int g=scan.nextInt();
                if(g>arrayList.size() && g<0)
                {
                    System.out.println("Błędna wartość!");
                    System.out.println();
                    System.out.println("Naciśnij Enter aby przejść do menu");
                    scan.nextLine();
                    wait=scan.nextLine();
                    Program.main();
                    break;
                }
                else
                {
                    arrayList.get(g-1).Special_Show();
                    System.out.println("Menu edytowania:");
                    System.out.println("1. Nazwisko");
                    System.out.println("2. Numer działu");
                    System.out.println("3. Płaca");
                    System.out.println("4. Wiek");
                    System.out.println("5. Ilość dzieci");
                    System.out.println("6. Stan społeczny");
                    System.out.println();
                    System.out.println("Podaj numer opcji którą chcesz wybrać:");
                    int f=scan.nextInt();
                    scan.nextLine();
                    System.out.println();
                    switch (f)
                    {
                        case 1:
                        {
                            System.out.println(arrayList.get(g-1).Name1());
                            arrayList.get(g-1).Surname();
                            System.out.println("Obecne nazwisko: "+arrayList.get(g-1).Surname1());
                            System.out.println("Podaj nowe nazwisko: ");
                            String d = scan.nextLine();
                            arrayList.get(g-1).Surname_Change(d);
                            try {
                                FileWriter fw = new FileWriter(file1);
                                for(int i=0;i<arrayList.size();i++)
                                {
                                    fw.write(arrayList.get(i).FileSave()+"\n");
                                }
                                fw.close();
                            }
                            catch (IOException e) {
                                e.printStackTrace();}
                            System.out.println("Naciśnij Enter aby przejść do menu");
                            scan.nextLine();
                            wait=scan.nextLine();
                            Program.main();
                            break;
                        }
                        case 2:
                        {
                            arrayList.get(g-1).Name();
                            arrayList.get(g-1).Surname();
                            System.out.println("Obecny numer działu: "+arrayList.get(g-1).Dep_Number());
                            System.out.println("Podaj nowy numer działu: ");
                            int d = scan.nextInt();
                            arrayList.get(g-1).Dep_Number_Change(d);
                            try {
                                FileWriter fw = new FileWriter(file1);
                                for(int i=0;i<arrayList.size();i++)
                                {
                                    fw.write(arrayList.get(i).FileSave()+"\n");
                                }
                                fw.close();
                            }
                            catch (IOException e) {
                                e.printStackTrace();}
                            System.out.println("Naciśnij Enter aby przejść do menu");
                            scan.nextLine();
                            wait=scan.nextLine();
                            Program.main();
                            break;
                        }
                        case 3:
                        {
                            arrayList.get(g-1).Name();
                            arrayList.get(g-1).Surname();
                            System.out.println("Obecna płaca: "+arrayList.get(g-1).Wage());
                            System.out.println("Podaj nową płace: ");
                            float d = scan.nextFloat();
                            arrayList.get(g-1).Wage_Change(d);
                            try {
                                FileWriter fw = new FileWriter(file1);
                                for(int i=0;i<arrayList.size();i++)
                                {
                                    fw.write(arrayList.get(i).FileSave()+"\n");
                                }
                                fw.close();
                            }
                            catch (IOException e) {
                                e.printStackTrace();}
                            System.out.println("Naciśnij Enter aby przejść do menu");
                            scan.nextLine();
                            wait=scan.nextLine();
                            Program.main();
                            break;
                        }
                        case 4:
                        {
                            arrayList.get(g-1).Name();
                            arrayList.get(g-1).Surname();
                            System.out.println("Obecny wiek: "+arrayList.get(g-1).Age());
                            System.out.println("Podaj nowy wiek: ");
                            int d = scan.nextInt();
                            arrayList.get(g-1).Age_Change(d);
                            try {
                                FileWriter fw = new FileWriter(file1);
                                for(int i=0;i<arrayList.size();i++)
                                {
                                    fw.write(arrayList.get(i).FileSave()+"\n");
                                }
                                fw.close();
                            }
                            catch (IOException e) {
                                e.printStackTrace();}
                            System.out.println("Naciśnij Enter aby przejść do menu");
                            scan.nextLine();
                            wait=scan.nextLine();
                            Program.main();
                            break;
                        }
                        case 5:
                        {
                            arrayList.get(g-1).Name();
                            arrayList.get(g-1).Surname();
                            System.out.println("Obecna ilość dzieci: "+arrayList.get(g-1).Child());
                            System.out.println("Podaj nową ilość dzieci: ");
                            int d = scan.nextInt();
                            arrayList.get(g-1).Child_Change(d);
                            try {
                                FileWriter fw = new FileWriter(file1);
                                for(int i=0;i<arrayList.size();i++)
                                {
                                    fw.write(arrayList.get(i).FileSave()+"\n");
                                }
                                fw.close();
                            }
                            catch (IOException e) {
                                e.printStackTrace();}
                            System.out.println("Naciśnij Enter aby przejść do menu");
                            scan.nextLine();
                            wait=scan.nextLine();
                            Program.main();
                            break;
                        }
                        case 6:
                        {
                            scan.nextLine();
                            arrayList.get(g-1).Name();
                            arrayList.get(g-1).Surname();
                            System.out.println("Obecny stan społeczny: "+(arrayList.get(g-1).In_Mariage()? "TAK" : "NIE"));
                            System.out.println("Podaj nowy stan społeczny: [TAK/NIE]");
                            String I_M=scan.nextLine();
                            boolean d;
                            if(I_M.toUpperCase().equals("TAK"))
                            {
                                d=true;
                            }
                            else if (I_M.toUpperCase().equals("NIE"))
                            {
                                d=false;
                            }
                            else
                            {
                                System.out.println("Błędna wartość!");
                                System.out.println();
                                System.out.println("Naciśnij Enter aby przejść do menu");
                                wait=scan.nextLine();
                                Program.main();
                                break;
                            }
                            arrayList.get(g-1).In_Mariage_Change(d);
                            try {
                                FileWriter fw = new FileWriter(file1);
                                for(int i=0;i<arrayList.size();i++)
                                {
                                    fw.write(arrayList.get(i).FileSave()+"\n");
                                }
                                fw.close();
                            }
                            catch (IOException e) {
                                e.printStackTrace();}
                            System.out.println("Naciśnij Enter aby przejść do menu");
                            scan.nextLine();
                            wait=scan.nextLine();
                            Program.main();
                            break;
                        }
                        default:
                        {
                            System.out.println("Błędna wartość!");
                            System.out.println();
                            System.out.println("Naciśnij Enter aby przejść do menu");
                            wait=scan.nextLine();
                            Program.main();
                            break;
                        }
                    }
                }
                break;
            }
            case 6:
            {
                System.out.println("Menu dodatkowych funkcji:");
                System.out.println("1. Liczba pracowników z pensją większą niż podana");
                System.out.println("2. Średnia płaca w danym dziale");
                System.out.println("3. Największa pensja u kobiet i u mężczyzn");
                System.out.println("4. Stosunek średniej płacy kobiet do średniej płacy mężczyzn");
                System.out.println("5. Zwiększenie wszystkim płacy o 10% wraz ze specjalnymi dodatkami");
                System.out.println("6. Wyświetlenie danych o wszystkich działach");
                System.out.println("7. Zwiększenie wszystkim płacy o podaną kwotę");
                System.out.println("8. Sortowanie pracowników według nazwiska");
                System.out.println("9. Sortowanie pracowników według wysokości pensji");
                System.out.println();
                System.out.println("Podaj numer opcji którą chcesz wybrać:");
                int h=scan.nextInt();
                System.out.println();
                switch (h)
                {
                    case 1:
                    {
                        int count=0;
                        System.out.println("Podaj wartość płacy do porównania:");
                        float w=scan.nextFloat();
                        for(int i=0;i<arrayList.size();i++)
                        {
                            boolean wage1=arrayList.get(i).Wage_Above(w);
                            if(wage1==true)
                            {
                                count++;
                            }
                            else if(wage1==false)
                            {
                                continue;
                            }
                            else
                            {
                                continue;
                            }
                        }
                        System.out.println("Liczba pracowników z pensją większą niż: " + w + " wynosi: " + count);
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        scan.nextLine();
                        wait=scan.nextLine();
                        Program.main();
                        break;
                    }
                    case 2:
                    {
                        scan.nextLine();
                        float [] sum = new float[4];
                        int [] count = new int[4];
                        float [] tab = new float[4];
                        for(int i=0;i<sum.length;i++)
                        {
                            sum[i]=0;
                            count[i]=0;
                            tab[i]=0;
                        }
                        for(int i=0; i<arrayList.size(); i++)
                        {
                            if(arrayList.get(i).Dep_Number()==1)
                            {
                                sum[0]+=arrayList.get(i).Wage();
                                count[0]++;
                            }
                            if(arrayList.get(i).Dep_Number()==2)
                            {
                                sum[1]+=arrayList.get(i).Wage();
                                count[1]++;
                            }
                            if(arrayList.get(i).Dep_Number()==3)
                            {
                                sum[2]+=arrayList.get(i).Wage();
                                count[2]++;
                            }
                            if(arrayList.get(i).Dep_Number()==4)
                            {
                                sum[3]+=arrayList.get(i).Wage();
                                count[3]++;
                            }
                        }
                        for(int i=0; i<tab.length; i++)
                        {
                            tab[i]=sum[i]/count[i];
                        }
                        int j=1;
                        for(int i=0; i<tab.length; i++)
                        {
                            System.out.println("Średnia płaca w dziale: " + j + " wynosi: " + tab[i]);
                            j++;
                        }
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        wait=scan.nextLine();
                        Program.main();
                        break;
                    }
                    case 3:
                    {
                        scan.nextLine();
                        float max_f, max_m;
                        max_f=0;
                        max_m=0;
                        for(int i=0;i<arrayList.size();i++)
                        {
                            if(arrayList.get(i).Sex()=="F".charAt(0))
                            {
                                if(arrayList.get(i).Wage()>max_f)
                                {
                                    max_f=arrayList.get(i).Wage();
                                }
                            }
                            else if(arrayList.get(i).Sex()=="M".charAt(0))
                            {
                                if(arrayList.get(i).Wage()>max_m)
                                {
                                    max_m=arrayList.get(i).Wage();
                                }
                            }
                        }
                        System.out.println("Największa pensja u kobiet: " + max_f);
                        System.out.println("Największa pensja u mężczyzn: " + max_m);
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        wait=scan.nextLine();
                        Program.main();
                        break;
                    }
                    case 4:
                    {
                        scan.nextLine();
                        float [] sum = new float[2];
                        int [] count = new int[2];
                        float [] tab = new float[2];
                        for(int i=0;i<arrayList.size();i++)
                        {
                            if(arrayList.get(i).Sex()=="F".charAt(0))
                            {
                                sum[0]+=arrayList.get(i).Wage();
                                count[0]++;
                            }
                            else if(arrayList.get(i).Sex()=="M".charAt(0))
                            {
                                sum[1]+=arrayList.get(i).Wage();
                                count[1]++;
                            }
                        }
                        tab[0]=sum[0]/count[0];
                        tab[1]=sum[1]/count[1];
                        System.out.println("Stosunek średniej płacy kobiet do średniej płacy mężczyzn wynosi: " + tab[0]/tab[1]);
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        wait=scan.nextLine();
                        Program.main();
                        break;
                    }
                    case 5:
                    {
                        scan.nextLine();
                        for(int i=0;i<arrayList.size();i++)
                        {
                            arrayList.get(i).Wage_Rise((float) 0.10, i);
                        }
                        try {
                            FileWriter fileWriter = new FileWriter(file1);
                            for(int i=0;i<arrayList.size();i++)
                            {
                                fileWriter.write(arrayList.get(i).FileSave()+"\n");
                            }
                            fileWriter.close();
                        }
                        catch (IOException e)
                        {
                            e.printStackTrace();
                        }
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        wait=scan.nextLine();
                        Program.main();
                        break;
                    }
                    case 6:
                    {
                        scan.nextLine();
                        int [] id = new int[4];
                        int [] count_sexm = new  int[4];
                        int [] count_sexf = new int[4];
                        float [] sum = new float[4];
                        int [] count = new int[4];
                        float [] tab = new float[4];
                        for(int i=0;i<sum.length;i++)
                        {
                            id[i]=0;
                            count_sexm[i]=0;
                            count_sexf[i]=0;
                            sum[i]=0;
                            count[i]=0;
                            tab[i]=0;
                        }
                        for(int i=0; i<arrayList.size(); i++)
                        {
                            if(arrayList.get(i).Dep_Number()==1)
                            {
                                sum[0]+=arrayList.get(i).Wage();
                                count[0]++;
                                id[0]=arrayList.get(i).Dep_Number();
                                if (arrayList.get(i).Sex()=="M".charAt(0))
                                {
                                    count_sexm[0]++;
                                }
                                else if (arrayList.get(i).Sex()=="F".charAt(0))
                                {
                                    count_sexf[0]++;
                                }
                            }
                            if(arrayList.get(i).Dep_Number()==2)
                            {
                                sum[1]+=arrayList.get(i).Wage();
                                count[1]++;
                                id[1]=arrayList.get(i).Dep_Number();
                                if (arrayList.get(i).Sex()=="M".charAt(0))
                                {
                                    count_sexm[1]++;
                                }
                                else if (arrayList.get(i).Sex()=="F".charAt(0))
                                {
                                    count_sexf[1]++;
                                }
                            }
                            if(arrayList.get(i).Dep_Number()==3)
                            {
                                sum[2]+=arrayList.get(i).Wage();
                                count[2]++;
                                id[2]=arrayList.get(i).Dep_Number();
                                if (arrayList.get(i).Sex()=="M".charAt(0))
                                {
                                    count_sexm[2]++;
                                }
                                else if (arrayList.get(i).Sex()=="F".charAt(0))
                                {
                                    count_sexf[2]++;
                                }
                            }
                            if(arrayList.get(i).Dep_Number()==4)
                            {
                                sum[3]+=arrayList.get(i).Wage();
                                count[3]++;
                                id[3]=arrayList.get(i).Dep_Number();
                                if (arrayList.get(i).Sex()=="M".charAt(0))
                                {
                                    count_sexm[3]++;
                                }
                                else if (arrayList.get(i).Sex()=="F".charAt(0))
                                {
                                    count_sexf[3]++;
                                }
                            }
                        }
                        int z=tab.length;
                        for(int i=0; i<z; i++)
                        {
                            if(count[i]!=0)
                            {
                                tab[i] = sum[i] / count[i];
                            }
                            else{}


                        }
                        int f=tab.length;
                        for(int i=0; i<f; i++)
                        {
                            if(count[i]!=0)
                            {
                                System.out.println("Średnia płaca w dziale: " + id[i] + " wynosi: " + tab[i] + " ,natomiast stosunek pracowników żeńskich do męskich wynosi: " + ( count_sexf[i]==count_sexm[i] ? "Równy" : (count_sexf[i]>=count_sexm[i] ? "Więcej kobiet" : "Więcej mężczyzn")));
                                System.out.println();
                                System.out.println("Wszyscy pracownicy w dziale nr: " + id[i]);
                                System.out.println();
                                int l=1;
                                for(int j=0; j<arrayList.size(); j++)
                                {
                                    if(id[i]==arrayList.get(j).Dep_Number())
                                    {
                                        System.out.print(l +" : ");
                                        arrayList.get(j).Show();
                                        l++;
                                    }
                                }
                                System.out.println();
                            }
                            else {}

                        }
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        wait=scan.nextLine();
                        Program.main();
                        break;
                    }
                    case 7:
                    {
                        float sum=0;
                        float sumk=0;
                        float summ=0;
                        scan.nextLine();
                        System.out.println("Podaj kwotę o jaką ma zostać powiększona pensja pracowników:");
                        float rise=scan.nextFloat();
                        for(int i=0; i<arrayList.size(); i++)
                        {
                            arrayList.get(i).Wage_Rise(rise);
                            sum+=arrayList.get(i).Wage();
                            if(arrayList.get(i).Sex()=="M".charAt(0))
                            {
                                summ+=arrayList.get(i).Wage();
                            }
                            else if(arrayList.get(i).Sex()=="F".charAt(0))
                            {
                                sumk+=arrayList.get(i).Wage();
                            }
                            else{}
                        }
                        try {
                            FileWriter fileWriter = new FileWriter(file1);
                            for(int i=0;i<arrayList.size();i++)
                            {
                                fileWriter.write(arrayList.get(i).FileSave()+"\n");
                            }
                            fileWriter.close();
                        }
                        catch (IOException e)
                        {
                            e.printStackTrace();
                        }

                        System.out.println("Suma pensji po modyfikacji: " + sum + " Stosunek pensji kobiet do pensji mężczyzn: " + (sumk/summ));
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        scan.nextLine();
                        wait = scan.nextLine();
                        Program.main();
                        break;
                    }
                    case 8: {
                        Name_List temp;
                        scan.nextLine();
                        System.out.println("Wybierz jak chcesz posortować pracowników: [True - rosnąco/False - malejąco]");
                        String choice = scan.nextLine();
                        if(choice.toLowerCase().equals("false"))
                        {
                            for (int i = 0; i < arrayList.size() - 1; i++) {
                                for (int j = 0; j < arrayList.size() - 1; j++) {
                                    if (arrayList.get(j).Surname1().toLowerCase().compareTo(arrayList.get(j + 1).Surname1().toLowerCase()) < 0) {
                                        temp = arrayList.get(j);
                                        arrayList.set(j, arrayList.get(j + 1));
                                        arrayList.set(j + 1, temp);
                                    }
                                }
                            }
                        }
                        else if(choice.toLowerCase().equals("true"))
                        {
                            for (int i = 0; i < arrayList.size() - 1; i++) {
                                for (int j = 0; j < arrayList.size() - 1; j++) {
                                    if (arrayList.get(j).Surname1().toLowerCase().compareTo(arrayList.get(j + 1).Surname1().toLowerCase()) > 0) {
                                        temp = arrayList.get(j);
                                        arrayList.set(j, arrayList.get(j + 1));
                                        arrayList.set(j + 1, temp);
                                    }
                                }
                            }
                        }
                        else {

                            System.out.println("Błędna wartość!");
                            System.out.println();
                            System.out.println("Naciśnij Enter aby przejść do menu");
                            wait = scan.nextLine();
                            Program.main();
                            break;
                        }
                        try {
                            FileWriter fileWriter = new FileWriter(file1);
                            for(int i=0;i<arrayList.size();i++)
                            {
                                fileWriter.write(arrayList.get(i).FileSave()+"\n");
                            }
                            fileWriter.close();
                        }
                        catch (IOException e)
                        {
                            e.printStackTrace();
                        }
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        wait = scan.nextLine();
                        Program.main();
                        break;
                    }
                    case 9:
                    {
                        Name_List temp;
                        scan.nextLine();
                        System.out.println("Wybierz jak chcesz posortować pracowników: [True - rosnąco/False - malejąco]");
                        String choice = scan.nextLine();
                        if(choice.toLowerCase().equals("false"))
                        {
                            for (int i = 0; i < arrayList.size() - 1; i++) {
                                for (int j = 0; j < arrayList.size() - 1; j++) {
                                    if (arrayList.get(j).Wage()<arrayList.get(j+1).Wage()) {
                                        temp = arrayList.get(j);
                                        arrayList.set(j, arrayList.get(j + 1));
                                        arrayList.set(j + 1, temp);
                                    }
                                }
                            }
                        }
                        else if(choice.toLowerCase().equals("true"))
                        {
                            for (int i = 0; i < arrayList.size() - 1; i++) {
                                for (int j = 0; j < arrayList.size() - 1; j++) {
                                    if (arrayList.get(j).Wage()>arrayList.get(j+1).Wage()) {
                                        temp = arrayList.get(j);
                                        arrayList.set(j, arrayList.get(j + 1));
                                        arrayList.set(j + 1, temp);
                                    }
                                }
                            }
                        }
                        else {

                            System.out.println("Błędna wartość!");
                            System.out.println();
                            System.out.println("Naciśnij Enter aby przejść do menu");
                            wait = scan.nextLine();
                            Program.main();
                            break;
                        }
                        try {
                            FileWriter fileWriter = new FileWriter(file1);
                            for(int i=0;i<arrayList.size();i++)
                            {
                                fileWriter.write(arrayList.get(i).FileSave()+"\n");
                            }
                            fileWriter.close();
                        }
                        catch (IOException e)
                        {
                            e.printStackTrace();
                        }
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        wait = scan.nextLine();
                        Program.main();
                        break;
                    }
                    default:
                    {
                        System.out.println("Błędna wartość!");
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        wait=scan.nextLine();
                        Program.main();
                        break;
                    }
                }
                break;
            }
            case 7:
            {
                scan.nextLine();
                System.out.println("Informacje o programie:");
                System.out.println("Autor: AWPL");
                System.out.println("Data ostatniej modyfikacji: 2020r.");
                System.out.println();
                System.out.println("Naciśnij Enter aby przejść do menu");
                wait=scan.nextLine();
                Program.main();
                break;
            }
            case 8:
            {
                File Delete = new File("D:\\Użytkownicy\\Alan\\Test\\"+file_name);
                System.out.println("Obecna nazwa: " + file_name);
                if(Delete.delete())
                {

                }
                else
                {
                    System.out.println("Błędna wartość!");
                    System.out.println();
                    System.out.println("Naciśnij Enter aby przejść do menu");
                    wait=scan.nextLine();
                    Program.main();
                }
                System.out.println("Podaj nową nazwę pliku z listą pracowników bez formatu \".txt\" :");
                scan.nextLine();
                file_name=scan.nextLine();
                file_name+=".txt";
                System.out.println("Nowa nazwa: " + file_name);
                try {
                    FileWriter fileWriter1 = new FileWriter(file);
                    fileWriter1.write(file_name);
                    fileWriter1.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                File file2 = new File("D:\\Użytkownicy\\Alan\\Test\\"+file_name);
                try {
                    FileWriter fileWriter = new FileWriter(file2);
                    for(int i=0;i<arrayList.size();i++)
                    {
                        fileWriter.write(arrayList.get(i).FileSave()+"\n");
                    }
                    fileWriter.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
                System.out.println();
                System.out.println("Naciśnij Enter aby przejść do menu");
                wait=scan.nextLine();
                Program.main();
                break;
            }
            case 9:
            {
                try {
                    FileWriter fileWriter = new FileWriter(file1);
                    for(int i=0; i<arrayList.size();i++) {
                        fileWriter.write(arrayList.get(i).FileSave()+"\n");
                    }
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace(); }

                System.out.println("Menu dodatkowych funkcji dla plików tekstowych:");
                System.out.println("1. Wyświetlenie danych o osobie z najdłuższym nazwiskiem");
                System.out.println("2. Średni wiek osób posiadających dzieci");
                System.out.println("3. Zakodowanie danych");
                System.out.println();
                System.out.println("Podaj numer opcji którą chcesz wybrać:");
                int y=scan.nextInt();
                System.out.println();

                switch (y)
                {
                    case 1:
                    {
                        scan.nextLine();
                        String max=arrayList.get(0).Surname1();
                        int o=0;
                        for(int i=1; i<arrayList.size(); i++)
                        {
                            if(max.length()<arrayList.get(i).Surname1().length())
                            {
                                max=arrayList.get(i).Surname1();
                                o=i;
                            }
                        }
                        arrayList.get(o).Show();
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        wait=scan.nextLine();
                        Program.main();
                        break;
                    }
                    case 2:
                    {
                        scan.nextLine();
                        int sum=0;
                        int count=0;
                        for(int i=0; i<arrayList.size(); i++)
                        {
                            if(arrayList.get(i).Child()>0)
                            {
                                sum+=arrayList.get(i).Age();
                                count++;
                            }
                        }
                        System.out.println("Dla osób posiadających dzieci, średni wiek wynosi: " + (float)(sum/count));
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        wait=scan.nextLine();
                        Program.main();
                        break;
                    }
                    case 3:
                    {
                        scan.nextLine();
                        char fl, ll;
                        String surn;
                        float sum=0;
                        int count=0;
                        for(int i=0; i<arrayList.size(); i++)
                        {
                            sum+=arrayList.get(i).Wage();
                            count++;
                        }
                        float avq=sum/count;
                        for(int i=0; i<arrayList.size(); i++)
                        {
                            if(arrayList.get(i).Wage()<avq)
                            {
                                surn=arrayList.get(i).Surname1();
                                fl=surn.charAt(0);
                                ll=surn.charAt(surn.length()-1);
                                String finnal=Character.toString(fl);
                                for(int j=0; j<surn.length()-2; j++)
                                {
                                    finnal+=Character.toString('*');
                                }
                                arrayList.get(i).Surname_Change(finnal+ll);
                            }
                        }
                        try {
                            FileWriter fileWriter = new FileWriter(file1);
                            for(int i=0; i<arrayList.size();i++) {
                                fileWriter.write(arrayList.get(i).FileSave()+"\n");
                            }
                            fileWriter.close();
                        } catch (IOException e) {
                            e.printStackTrace(); }
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        wait=scan.nextLine();
                        Program.main();
                        break;
                    }
                    default:
                    {
                        System.out.println("Błędna wartość!");
                        System.out.println();
                        System.out.println("Naciśnij Enter aby przejść do menu");
                        wait=scan.nextLine();
                        Program.main();
                        break;
                    }
                }

                break;
            }
            default:
            {
                System.out.println("Błędna wartość!");
                System.out.println();
                System.out.println("Naciśnij Enter aby przejść do menu");
                wait=scan.nextLine();
                Program.main();
                break;
            }
        }
    }
}

class Name_List
{

        private String name;
        private String surname;
        private char sex;
        private int dep_number;
        private float wage;
        private int age;
        private int child;
        private boolean in_mariage;

        public Name_List(String n, String sn, char s, int d, float w, int a, int ch, boolean i_m)
        {
            name=n;
            surname=sn;
            sex=s;
            dep_number=d;
            wage=w;
            age=a;
            child=ch;
            in_mariage=i_m;
        }

        public String FileSave()
        {
            String file=name+" "+surname+" "+sex+" "+dep_number+" "+wage+" "+age+" "+child+" "+in_mariage;
            return file;
        }
        public void Show()
        {
            System.out.println("Imię: " + name + " Nazwisko: " + surname + " Płeć: " + sex + " Numer wydziału: " + dep_number + " Wypłata: "+ wage + " Wiek: " + age + " Ilość dzieci: " + child + " Czy w małżeństwie? " + (in_mariage ? "Tak" : "Nie") );
        }
        public void Short_Show()
        {
            System.out.println("Imię: " + name + " Nazwisko: " + surname + " Wypłata: " + wage);
        }
        public void Special_Show()
        {
            System.out.println("Imię: " + name.toUpperCase() + " Nazwisko: " + surname.toUpperCase());
        }
        public boolean Wage_Above(float w)
        {
            boolean result = Boolean.parseBoolean(null);
            if(w>wage)
            {
                result=false;
            }
            else if (w<wage)
            {
                result=true;
            }
            return result;
        }
        public void Wage_Rise(float pr, int i)
        {
            int j=i+1;
            System.out.println("ID pracownika: " + j);
            System.out.println("Stara pensja: " + wage);
            wage=wage+wage*pr;
            if(child!=0)
            {
                wage=(float)(wage+wage*child*0.02);
            }
            if(in_mariage==true)
            {
                wage=(float)(wage+wage*0.03);
            }
            System.out.println("Nowa pensja: " + wage);
            System.out.println();
        }
        public void Wage_Rise(float pr)
        {
            wage=wage+pr;
        }
        public void Name()
        {
            System.out.println(name);
        }
        public void Surname()
        {
            System.out.println(surname);
        }
        public String Name1()
        {
            return name;
        }
        public String Surname1()
        {
            return surname;
        }
        public char Sex()
        {
            return sex;
        }
        public int Dep_Number()
        {
            return dep_number;
        }
        public float Wage()
        {
            return wage;
        }
        public int Age()
        {
            return age;
        }
        public int Child()
        {
            return child;
        }
        public boolean In_Mariage()
        {
            return in_mariage;
        }

        public void Surname_Change(String sn)
        {
            surname=sn;
        }
        public void Dep_Number_Change(int d)
        {
            dep_number=d;
        }
        public void Wage_Change(float w)
        {
            wage=w;
        }
        public void Age_Change(int a)
        {
            age=a;
        }
        public void Child_Change(int ch)
        {
            child=ch;
        }
        public void In_Mariage_Change(boolean i_m)
        {
            in_mariage=i_m;
        }
}