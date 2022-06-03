package recursion;

public class Fibanoci {

    static int value=8;
    static int[] memorization=new int[value+1];
    public static void main(String[] args) {
        //System.out.println("Testing mem value of 3 is "+memorization[3]);
        //System.out.println(fibWithMemorizarion(value));
        //System.out.println(fib(value));
        //System.out.println(itterativeFib(value));
    }

    public static int fibWithMemorizarion(int n)
    {
        System.out.println("Calculating the fib("+n+")");
        if(n<=1)
        {
            return n;
        }
        else if(memorization[n]>0)
        {
            return memorization[n];
        }
        int x= fibWithMemorizarion(n-1)+ fibWithMemorizarion(n-2);
        memorization[n]=x;
        return x;
    }
    // 0,1,1,2,3,5,8,13,21
    public static int itterativeFib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int f1=0,f2=1,f=0;
        for (int i = 2; i <=n ; i++) {
            f=f1+f2;
            f1=f2;
            f2=f;
        }
        return f;
    }

    public static int fib(int n)
    {
        System.out.println("Calculating the fib("+n+")");
        if(n<=1)
        {
            return n;
        }
        int x= fib(n-1)+fib(n-2);
        return x;
    }
}
