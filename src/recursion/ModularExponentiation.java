package recursion;

public class ModularExponentiation {
    public static void main(String[] args) {
        System.out.println(modExp(5,1,7));
    }

    public static long modExp(int x,int n, int m)
    {
        if(n==0)
        {
            return 1;
        }
        else if(n%2==0)
        {
            long temp=modExp(x,n/2,m)%m;
            return (temp*temp)%m;
        }
        else
        {
         return ((x%m)*(modExp(x,n-1,m)%m))%m;
        }
    }
}
