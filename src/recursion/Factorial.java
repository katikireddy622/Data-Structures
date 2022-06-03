package recursion;

public class Factorial {
    public static int fac(int n)
    {
        System.out.println("Entered : "+n);
        if(n==1)
        {
            return 1;
        }
        return n*fac(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fac(4));
    }
}
