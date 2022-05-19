/*
While Loop 03
Exercise: While Loop 3

use a while loop to print the first 10 numbers of the Fibonacci sequence
 */
public class Main {
    public static void main(String[] args) {
        int fn=0;
        int fm=1;
  
        while(fn < 55){
            System.out.println(fn);
            int f=fn+fm;
            fn=fm;
            fm=f;
        }
    }
}
