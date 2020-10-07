public class TypeClass<T> {
    T obj;

    TypeClass(T obj)
    {
        this.obj=obj;
    }
    public T getObj()
    {
        return obj;
    }
    public void showObj()
    {
        System.out.println("Type T to: " + obj.getClass().getName());
    }
    public void main()
    {
        TypeClass2<String,Integer> typeClass2 = new TypeClass2<>("String", 6);
        System.out.println(typeClass2.getObj()+" "+typeClass2.getObj2());
        Integer [] tab = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Stats<Integer> stats = new Stats<>(tab);
        stats.avarage();
        moon moon = new moon();
        Integer [] tab1={1,2,3,4};
        System.out.println(moon.avq(tab1));
    }
}

class TypeClass2<T,V>
{
    T obj;
    V obj2;

    TypeClass2(T obj, V obj2)
    {
        this.obj=obj;
        this.obj2=obj2;
    }

    T getObj()
    {
        return obj;
    }
    V getObj2()
    {
        return obj2;
    }
}

class Stats<T extends Number> //String nie jest podklasą Numbers, wszelkie Objekty nie należące do Number zostaną odrzucone
{
    T[] nums;

    Stats(T[] obj)
    {
        nums=obj;
    }
    double avarage()
    {
        double sum=0.0;
        for(int i=0; i<nums.length;i++)
        {
            sum+=nums[i].doubleValue();
        }
        return sum/nums.length;
    }
}

class moon
{
    static <T extends Number> double avq(T x[])
    {
        double a=0;
        for (int i=0; i<x.length;i++)
        {
            a=a+x[i].doubleValue();
        }
        return a/x.length;
    }
}