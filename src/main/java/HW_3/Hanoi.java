package HW_3;



    import java.util.Scanner;

    public class Hanoi {


        static void hanoi(int n, char start, char mid, char end) {

            if(n==1) {
                System.out.println(n+"Из"+start+"К"+end);
                return;
            }
            hanoi(n-1,start,end,mid);
            System.out.println(n+"Из"+start+"К"+end);
            hanoi(n-1,mid,start,end);

        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            hanoi(n,'A','B','C');
        }
    }


