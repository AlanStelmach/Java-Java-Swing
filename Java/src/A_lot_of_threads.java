public class A_lot_of_threads {
    public static void main()
    {
        Thread t = Thread.currentThread();
        System.out.println(t);

        t.setName("Mój wątek!");
        System.out.println(t);
        try
        {
            for(int n=5;n>0;n--)
            {
                System.out.println(n);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("YES");
        }
        String name="HELLO";
        NewThread nt = new NewThread(name, 2000);
        NewThread nt1 = new NewThread("YES", 500);
        NewThread nt2 = new NewThread("NO", 1000);

        nt.t.start();
        nt1.t.start();
        nt2.t.start();

        System.out.println("Wątek jeden żyje: " + nt.t.isAlive());
        System.out.println("Wątek dwa żyje: " + nt1.t.isAlive());
        System.out.println("Wątek trzy żyje: " + nt2.t.isAlive());

        try{

            //Thread.sleep(10000);
            nt1.t.join(); //instrukcja
            nt2.t.join();
            nt.t.join();

        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("OK");

        NextThread nextThread = new NextThread();

        nextThread.start();
        try{
            for(int i=5; i>0; i--)
            {
                System.out.println(i);
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("OK");
    }
}

class NewThread implements Runnable
{
    String name;
    Thread t;
    int time;
    NewThread(String name, int time)
    {
        this.time=time;
        this.name=name;
        t=new Thread(this,"YES");
        System.out.println(t);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name+" "+i);
                Thread.sleep(time);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("OK");
    }
}

class NextThread extends Thread
{
    NextThread()
    {
        super("YES");
        System.out.println(this);
    }

    public void run()
    {
        try
        {
            for(int i=5; i>5; i--)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("OK");
    }
}