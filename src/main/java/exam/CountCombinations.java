package exam;

public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
    int count[] = new int[N + 1];
         
        count[0] = 1;
         
        for (int i = 1; i <= N; i++)
            for (int j = 0; j < arr.length; j++)
     
                if (i >= arr[j])
                    count[i] += count[i - arr[j]];
         
        
        return count[N];
    
    
   
  }
  public static void main(String[] args)
    {
        int N = 7;
        System.out.println("Total number of ways = "
                                    + countWays(N));
    }

}
