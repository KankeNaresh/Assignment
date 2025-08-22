package KankeNaresh;
/*
Problem-3: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]

  Output: (examples)
    1) input a = 1, then output : 1
    2) input a = 2, then output : 1
    3) input a = 3, then output : 1, 3, 5
    4) input a = 4, then output : 1, 3, 5
    5) input a = 5, then output : 1, 3, 5, 7, 9
    6) input a = 6, then output : 1, 3, 5, 7, 9
    .
    .
    7) input a = x, then output : 1, 3, 5, 7, .......
 */
import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int count=0;
        if(a%2==0){
            count=a-1;
        }else{
            count=a;
        }
        for(int i=1;i<=count;i++){
            int odd=2*i-1;
            if(i<count){
                System.out.print(odd+", ");
            }else{
                System.out.print(odd);
            }
        }
    }
}
