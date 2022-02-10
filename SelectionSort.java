import java.util.Calendar;
public class SelectionSort
{
    public static long main(String [] args)
    {
        int [] nums = new int[30000];
        
        for(int i=0; i<nums.length; i++) 
        {
            nums[i] = (int)(Math.random()*50+1);
            //System.out.println(nums[i]);
        }
        Calendar myCal = Calendar.getInstance();
        long start = myCal.getTimeInMillis();
         for(int i=0; i<nums.length; i++)
        {
            int low = nums[i];
            int hold = 0;
            for(int j=i+1; j<nums.length; j++)
            {
                if(nums[j]<low)
                {
                    low = nums[j];
                    hold = j;
                }
            }
            nums[hold] = nums [i];
            nums [i] = low;
           
            //System.out.println(nums[i]);
    
        }
        myCal = Calendar.getInstance();
        long end = myCal.getTimeInMillis();
        
        return end-start;
    }
}

