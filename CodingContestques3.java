/*
user is asked to enter 2 numbers and output should be LCM and HCF of two numbers separated by space
*/


//code:
 
 

import java.util.*;

public class question3 {

    public static int findGCD(int x, int y) {
        int a = x;
        int b = y;
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList();
        while (true) {
            System.out.println("enter 2 numbers between 1 and 10^4");
            int x = sc.nextInt();
            int y = sc.nextInt();
            al.add(x);
            al.add(y);
            for (int i = 0; i < al.size(); i++)
                System.out.print(al.get(i) + " ");
            System.out.println();
            int m = findGCD(x, y);
            int n = (x * y) / m;
            ArrayList<Integer> al1 = new ArrayList<>();
            al1.add(m);
            al1.add(n);
            for (int i = 0; i < al1.size(); i++)
                System.out.print(al1.get(i) + " ");
            System.out.println();

        }
    }

}
