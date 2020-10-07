public class Class {
    public static void main() {
        Q q = new Q();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);

        producer.t.start();
        consumer.t.start();

        System.out.println("YES");
    }
}

class Q
{
    int n;
    boolean valueset=false;

    synchronized int get()
    {
        while (!valueset)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
        System.out.println("Pobrano: " +n);
        valueset=false;
        return n;
    }
    synchronized void put(int n)
    {
        while(valueset)
        {
            try {
                wait();
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
        this.n=n;
        valueset=true;
        System.out.println("Włożono: "+n);
        notify();
    }
}

class Producer implements Runnable
{
    Q q;
    Thread t;

    Producer(Q q)
    {
        this.q=q;
        t = new Thread(this, "Producent");
    }

    public void run()
    {
        int i=0;
        while (true)
        {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable
{
    Q q;
    Thread t;

    Consumer(Q q)
    {
        this.q=q;
        t = new Thread(this,"Konsument");
    }

    public void run()
    {
        int i=0;
        while (true)
        {
            q.get();
        }
    }
}