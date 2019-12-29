package elevenPractice;

import java.util.*;

public class eleven_17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter n: ");
        int n=input.nextInt();
        int flag=n;
        int i=2;
        int m=1;
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> list1=new ArrayList<Integer>();
        int []a=new int[1000];
        while(n!=1) {
            if(n%i==0) {
                list.add(i);
                n=n/i;
                a[i]++;
            }
            else
                i++;    

        }
        for(int j=0;j<1000;j++)
        {
            if(a[j]!=0&&(a[j]%2==1))
                m=m*j;
        }
        System.out.println(m);
        System.out.println(m*flag);
    }

}
