package KankeNaresh;

import java.util.LinkedHashMap;

/*
Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
  (examples)
  input: [1,2,8,9,12,46,76,82,15,20,30]
  Output:
    {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
 */
import java.util.Map;
public class Problem4 {
    public static void main(String[] args) {
        int arr[]={1,2,8,9,12,46,76,82,15,20,30};
        Map<Integer, Integer> result=new LinkedHashMap<>();
        for(int d=1;d<=9;d++){
            int count=0;
            for(int num:arr){
                if(num%d==0){
                    count++;
                }
            }
            result.put(d,count);
        }
        System.out.println(result);
    }
}
