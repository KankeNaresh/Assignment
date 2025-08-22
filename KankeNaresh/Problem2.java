/*
Problem-2: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]

  Output: (examples)
    1) input a = 1, then output : 1
    2) input a = 2, then output : 1, 3
    3) input a = 3, then output : 1, 3, 5
    4) input a = 4, then output : 1, 3, 5, 7
    .
    .
    5) input a = x, then output : 1, 3, 5, 7, .......
 */
package KankeNaresh;
import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            int odd=(2*i)-1;
            if(i<a){
                System.out.print(odd+" ");
            }else{
                System.out.print(odd);
            }
        }
    }
}
