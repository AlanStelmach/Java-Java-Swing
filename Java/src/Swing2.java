import java.util.ArrayList;
import java.util.HashMap;

public class Swing2 {
    public static void main()
    {

    }
}

class Vehicle
{
    private String name;
    private String model;
    private String type;
    private String vin;
    private String date;
    private long mileage;


    Vehicle(String n, String m, String t, String v, String d, long mi)
    {
        name=n;
        model=m;
        type=t;
        vin=v;
        date=d;
        mileage=mi;
    }
}

class Owner
{
    private String name;
    private String surname;
    private String address;
    private int h_number;
    private String post_code;
    private String town_name;
    private ArrayList<Vehicle> vehicles;

    Owner(String n, String sn, String a, int hn, String pc, String tn)
    {
        name=n;
        surname=sn;
        address=a;
        h_number=hn;
        post_code=pc;
        town_name=tn;
    }

    public void addVehicle(String n, String m, String t, String  v, String d, long mi)
    {
        vehicles.add(new Vehicle(n,m,t,v,d,mi));
    }
}

class Office
{
    HashMap<String, Owner> hashMap = new HashMap<>();
    HashMap<String, ArrayList<String>> hashMap2 = new HashMap<>();

    
}