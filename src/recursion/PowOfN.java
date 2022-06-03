package recursion;

public class PowOfN {
    public static void main(String[] args) {
        //System.out.println(pow(32,2));
        System.out.println(powVersion2(32,2));
    }
    public static long pow(int n,int x)
    {
        System.out.println("Calculating the pow("+n+")");
        if(n==0)
        {
            return 1;
        }
        return x * pow(n-1,2);
    }

    public static long powVersion2(int n,int x)
    {
        if(n==0)
        {
            return 1;
        }
        else if(n%2==0)
        {
            System.out.println("Entered into even");
            long temp=powVersion2(n/2,x);
            return temp*temp;
        }
        else
        {
            System.out.println("Entered into odd");
            return x *  powVersion2(n-1,x);
        }
    }
}
