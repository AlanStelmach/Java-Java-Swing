import java.util.Arrays;

public class Inter2 {
    public static void main()
    {
        MyNum myNum;
        myNum = () -> 123.23;
        System.out.println(myNum.getValue());
        System.out.println("--------------");
        myNum = () -> Math.random()*100;
        System.out.println(myNum.getValue());
        System.out.println(myNum.getValue());

        Numerictest numerictest = (n) -> (n%2)==0;

        if(numerictest.test(10)) System.out.println("Tak");
        if(!numerictest.test(9)) System.out.println("Nie");

        Numerictest numerictest1 = (n) -> n>=0;

        if(numerictest1.test(1)) System.out.println("Tak");
        if(!numerictest1.test(-1)) System.out.println("Nie");

        Numerictest2 numerictest2 = (d,n) -> (d%n)==0;
        if(numerictest2.test(10,2)) System.out.println("Tak");
        if(!numerictest2.test(10,3)) System.out.println("Nie");

        NumericFunc numericFunc = (n) -> {
            int result=1;
            for(int i=0;i<=n;i++)
            {
                result=i*result;
            }
            return result;
        };
        System.out.println(numericFunc.func(3));
        System.out.println(numericFunc.func(5));

        AVG avg = (n) -> {
          int sum=0;
          int sr;
          for(int i=0;i<n.length;i++)
          {
              sum=n[i];
          }
          sr=sum/n.length;
          sr=sr*100;
          sr=Math.round(sr);
          sr=sr/100;
          return sr;
        };
        int [] tab = {1,2,34,567,13,12,8,5,4,9,0};
        System.out.println(avg.test(tab));

        AVG mediana = (n) -> {
            int x;
            Arrays.sort(n);
            if(n.length%2==0)
            {
                x = n[n.length/2]+n[n.length/2-1];
                x/=2;
            }
            else
            {
                x = n[n.length/2];
            }
            return x;
        };

        System.out.println(mediana.test(tab));
    }
}

interface MyNum
{
    double getValue();
}

interface Numerictest
{
    boolean test(int n);
}

interface Numerictest2
{
    boolean test(int d,int n);
}

interface NumericFunc
{
    int func(int n);
}

interface AVG
{
    float test(int [] n);
}