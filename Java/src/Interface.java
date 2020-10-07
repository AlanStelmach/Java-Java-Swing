import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    public static void main()
    {
        Charwoman charwoman=new Charwoman("A","B","C", 2300.00);
        charwoman.WageRise(500.00);
        charwoman.CountNetto();
        charwoman.AddWarning("No! Bad charwoman! Very bad!");
        charwoman.SetPunishment(500.00);
        ChainsawOperator chainsawOperator = new ChainsawOperator("D","E","F", 3460.00, "YES",1, true);
        chainsawOperator.WageRise(500.00);
        chainsawOperator.CountNetto();
        chainsawOperator.AddWarning("Yes, good boy! Cut him in a half! ^^");
        chainsawOperator.SetPunishment(500.00);
        chainsawOperator.SetState();
        System.out.println(chainsawOperator.medicalstatment ? "YES" : "NO");
        chainsawOperator.CheckProgress();
        chainsawOperator.ShowInfo();
        ShipmentDriver shipmentDriver = new ShipmentDriver("G","H", "I", 0.00);
        shipmentDriver.WageRise(500.00);
        shipmentDriver.CountNetto();
        shipmentDriver.AddWarning("Yes, Bro! Do it! Drive through them! ^^");
        shipmentDriver.SetPunishment(500.00);
        shipmentDriver.AddVechicle("Name What?", 1234567890);
        shipmentDriver.TechnicalStatus();
        shipmentDriver.ShowInfo();
        ProductionManager productionManager = new ProductionManager("J","K","L", 100000.00);
        productionManager.SetPayday();
        productionManager.ShowInfo();
        productionManager.CountWageRise();
        MarketingManager marketingManager = new MarketingManager("M","N", "O", 6699.69);
        marketingManager.SetPayday();
        marketingManager.ShowInfo();
        marketingManager.CountWageRise();
        marketingManager.SetUpCar("1234567890");
        marketingManager.AddNewCustomer();
        marketingManager.DeleteCustomer();
    }
}

interface Worker
{
    void WageRise(double rise);
    double CountNetto();
    void AddWarning(String warning);
    void SetPunishment(double punishment);
}

interface Driver
{
    void AddVechicle(String name, int platenumber);
    boolean TechnicalStatus();
    void ShowInfo();
}

interface WarehauseWorker
{
    void SetState();
    boolean CheckMedicalStatment();
    void CheckProgress();
    void ShowInfo();
}

class Charwoman implements Worker
{
    private String name;
    private String surname;
    private String address;
    private double payday;
    private String [] warnings;

    Charwoman(String n, String sn, String a, double p)
    {
        name=n;
        surname=sn;
        address=a;
        payday=p;
    }

    @Override
    public void WageRise(double rise) {
        payday=payday+rise;
    }

    @Override
    public double CountNetto() {
        payday=payday-payday*0.23;
        return payday;
    }

    @Override
    public void AddWarning(String warning) {
        int index = warnings.length;
        warnings[index] = warning;
    }

    @Override
    public void SetPunishment(double punishment) {
        payday = payday-punishment;
    }
}

class ChainsawOperator implements Worker, WarehauseWorker
{
    private String name;
    private String surname;
    private String address;
    private double payday;
    String typoofmachine;
    int numberofworkspace;
    boolean medicalstatment;
    private String [] warnings;

    ChainsawOperator(String n, String sn, String a, double p, String tom, int now, boolean ms)
    {
        name=n;
        surname=sn;
        address=a;
        payday=p;
        typoofmachine=tom;
        numberofworkspace=now;
        medicalstatment=ms;
    }

    @Override
    public void WageRise(double rise) {
        payday=payday+rise;
    }

    @Override
    public double CountNetto() {
        payday=payday-payday*0.23;
        return payday;
    }

    @Override
    public void AddWarning(String warning) {
        int index = warnings.length;
        warnings[index] = warning;
    }

    @Override
    public void SetPunishment(double punishment) {
        payday = payday-punishment;
    }

    @Override
    public void SetState() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nowy numer stanowiska: ");
        numberofworkspace=scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public boolean CheckMedicalStatment() {
        boolean total;
        if(medicalstatment==true)
        {
            total=true;
        }
        else
        {
            total=false;
        }

        return total;
    }

    @Override
    public void CheckProgress() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość wykonanych półproduktów przez pracownika: ");
        int i = scanner.nextInt();
        int x = i/100;
        payday=payday+x*20;
    }

    @Override
    public void ShowInfo() {
        System.out.println("Imię: " + name + " Nazwisko: " + surname + " Adres: " + address + " Wypłata: " + payday + " Rodzaj maszyny: " + typoofmachine + " Numer stanowiska: " + numberofworkspace + " Badania lekarskie: " + (medicalstatment ? "Posiada.": "Nieposiada."));
    }
}

class ShipmentDriver implements Worker, Driver
{
    private String name;
    private String surname;
    private String address;
    private double payday;
    private String carname;
    private int platenumber;
    boolean technicalstatus;
    private String [] warnings;

    ShipmentDriver(String n, String sn, String a, double p)
    {
        name=n;
        surname=sn;
        address=a;
        payday=p;
    }

    @Override
    public void WageRise(double rise) {
        payday=payday+rise;
    }

    @Override
    public double CountNetto() {
        payday=payday-payday*0.23;
        return payday;
    }

    @Override
    public void AddWarning(String warning) {
        int index = warnings.length;
        warnings[index] = warning;
    }

    @Override
    public void SetPunishment(double punishment) {
        payday=payday-punishment;
    }

    @Override
    public void AddVechicle(String name, int platenumber) {
        carname=name;
        this.platenumber=platenumber;
    }

    @Override
    public boolean TechnicalStatus() {
        boolean total;
        if(technicalstatus==true)
        {
            total=true;
        }
        else
        {
            total=false;
        }

        return total;
    }

    @Override
    public void ShowInfo() {
        System.out.println("Imię: " + name + " Nazwisko: " + surname + " Adres: " + address + " Wypłata: " + payday + " Nazwa samochodu: " + carname + " Numer rejestracji: " + platenumber + " Badania techniczne samochodu: " + (technicalstatus ? "Posiada.": "Nieposiada."));
    }
}

abstract class Management
{
    String name;
    String surname;
    String address;
    double payday;
    abstract void SetPayday();
    abstract void ShowInfo();
    abstract void CountWageRise();
}

class ProductionManager extends Management
{
    Scanner scanner = new Scanner(System.in);
    boolean daynorm;
    int hoursovernorm;

    ProductionManager(String n, String sn, String a, double p)
    {
        name=n;
        surname=sn;
        address=a;
        payday=p;
    }

    @Override
    void SetPayday() {
        System.out.println("Podaj nową wartość wypłaty: ");
        payday=scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    void ShowInfo() {
        System.out.println("Imię: " + name + " Nazwisko: " + surname + " Adres: " + address + " Wypłata: " + payday);
    }

    @Override
    void CountWageRise() {
        System.out.println("Czy została wyrobiona norma: [true/false]");
        daynorm = scanner.nextBoolean();
        if(daynorm==true)
        {
            System.out.println("Podaj ilość godzin ponad normę: ");
            hoursovernorm = scanner.nextInt();
            if(hoursovernorm<=5 && hoursovernorm>0) {
                payday = payday + hoursovernorm * 30;
                System.out.println("Menadżer produkcji o imieniu: " + name + " i nazwisku: " + surname + " przekroczył normę o " + hoursovernorm + " i zostaje mu dodana podwyżka do płacy w wysokości: " + hoursovernorm * 30 + " zł");
            }
            else
            {
                System.out.println("Podana wartość jest zbyt duża!");
            }
            scanner.nextLine();
        }
        else
        {
            System.out.println("Menadżer produkcji o imieniu: " + name + " i nazwisku: " + surname + " nie wyrobił normy");
        }
    }
}

class MarketingManager extends Management
{
    Scanner scanner = new Scanner(System.in);
    Boolean car=false;
    String platenumber;
    String staffnumber;
    ArrayList<Customer> arrayList = new ArrayList<>();

    MarketingManager(String n, String sn, String a, double p)
    {
        name=n;
        surname=sn;
        address=a;
        payday=p;
    }

    public void SetUpCar(String platenumber)
    {
        this.platenumber=platenumber;
        car=true;
    }

    @Override
    void SetPayday() {
        System.out.println("Podaj nową wartość wypłaty: ");
        payday=scanner.nextDouble();
        scanner.nextLine();
    }

    @Override
    void ShowInfo() {
        if(car==true)
        {
            System.out.println("Imię: " + name + " Nazwisko: " + surname + " Adres: " + address + " Wypłata: " + payday + " Numer służbowy: " + staffnumber + " Numer rejestracyjny samochodu: " + platenumber);
        }
        else
        {
            System.out.println("Imię: " + name + " Nazwisko: " + surname + " Adres: " + address + " Wypłata: " + payday + " Numer służbowy: " + staffnumber);
        }
    }

    @Override
    void CountWageRise() {
        payday=payday+arrayList.size()*25;
    }

    public void AddNewCustomer()
    {
        String n,sn,a,num;
        System.out.println("Podaj imię nowego klienta: ");
        n=scanner.nextLine();
        System.out.println("Podaj nazwisko nowego klienta: ");
        sn=scanner.nextLine();
        System.out.println("Podaj adres nowego klienta: ");
        a=scanner.nextLine();
        System.out.println("Podaj numer nowego klienta: ");
        num=scanner.nextLine();
        arrayList.add(new Customer(n,sn,a,num));
    }
    public void DeleteCustomer()
    {
        int j=1;
        for(int i=0; i<arrayList.size(); i++)
        {
            System.out.println(j + " : " + arrayList.get(i).name + " " + arrayList.get(i).surname + " " + arrayList.get(i).address + " " + arrayList.get(i).number);
        }
        System.out.println("Podaj indeks klienta którego chcesz usunąć: ");
        int index = scanner.nextInt();
        arrayList.remove(index);
    }
}

class Customer
{
    String name;
    String surname;
    String address;
    String number;

    Customer(String n, String sn, String a, String num)
    {
        name=n;
        surname=sn;
        address=a;
        number=num;
    }
}