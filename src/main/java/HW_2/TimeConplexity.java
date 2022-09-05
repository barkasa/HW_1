package HW_2;

public class TimeConplexity {

    public static void main(String[] args) {
        System.out.println(GCD(165, 99));
    }

    public static int GCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }





    void test1(int n)
    {
        if (n==1)
            return;
        for (int i=1; i<=n; i++)
            for (int j=1; j<=n; j++)
                System.out.println("*");

    }

    // O(n)
  //---------------------------------------------------------
    void test2(int n)
    {
        int i, j, a = 0;

        for (i = 0; i < n; i++)
            for (j = n; j > i; j--)
                a = a + i + j;
    }

// O(n2/2)
//---------------------------------------------------------
    void test3(int n)
    {
        int i, j, a = 0;
        for (i = n/2; i <=n; i++)
            for (j = 2; j <=n; j=j*2)
                a=a+n/2;
    }

    // O(n2/2)
    //---------------------------------------------------------
    void test4(int n)
    {
        int a = 0, i = n;
        while (i > 0) {
            a += i;
            i /= 2;
        }
    }

    // O(log n)


}
//---------------------------------------------------------