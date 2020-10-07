public class Atak {
    public String nazwa;
    private int sila;
    private int celnosc;

    public Atak(String nazwa, int sila, int celnosc)
    {
        this.nazwa=nazwa;
        this.sila=sila;
        this.celnosc=celnosc;
    }
    public int setcelnosc()
    {
        return celnosc;
    }
    public int setsila()
    {
        return sila;
    }
    public String setname()
    {
        return nazwa;
    }
}
