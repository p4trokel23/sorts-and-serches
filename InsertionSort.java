import java.util.Calendar;
public class InsertionSort
{
    public static int[] main(String [] args)
    {
        int [] nums = new int[70];        
        for(int i=0; i<nums.length; i++) 
        {
            nums[i] = (int)(Math.random()*100+1);
        }
        //Calendar myCal = Calendar.getInstance();
        //long start = myCal.getTimeInMillis();
        for(int i=1; i<nums.length; i++)
        {
            int nextValue = nums[i], pos=i;
            while(pos>0 && nextValue<nums[pos-1])
            {
                nums[pos]=nums[pos-1];
                pos--;
            }
            nums[pos]= nextValue;
        }
        for(int i=0; i<nums.length;i++)
        {
           // System.out.println(nums[i]);
        }
        //myCal = Calendar.getInstance();
        //long end = myCal.getTimeInMillis();
        
        int low = nums[0];
        int high = nums[nums.length-1];

        return nums;
    }
}


