//using p
    
    
    import java.util.*;
public class maxsubarrays2 {

    public static void maxsubarraySum(int number[]) {
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]= new int[number.length];
        for(int i=0; i<number.length; i++){
            int start=i;

            //claculate prefix array
            for(int i=1; i<prefix.length;i++)
            for(int j=i; j<number.length; j++){
                int end =j;
                currSum=0;
           //     for(int k=start; k<=end; k++){
                    //subarray sum
          //          currSum+=number[k];
            //    }
         //   }
            System.out.println(currSum);
            if(maxSum<currSum){
                maxSum=currSum;
            }
            

        }
        
      System.out.println("max sum = " +maxSum);  
    }
    public static void main(String[] args) {
        int number[]={2, 4, 6, 8, 10};
        maxsubarraySum(number);
    }
}



