

public class SortComparison
{
    public static void main (String [] args)
    {
        long totalTime = 0;
        for (int i =0; i<15;i++)
        {
            totalTime += BubbleSort.main(null);
            
        }
        System.out.println("Total Bubble Sort time: "+totalTime+"\t"+"\t"+"avg: "+ totalTime/15);
        
        totalTime = 0;
        for (int i =0; i<15;i++)
        {
            totalTime += SelectionSort.main(null);
            
        }
        System.out.println("Total Selection Sort time: "+totalTime+"\t"+"\t"+"avg: "+ totalTime/15);
         
        totalTime = 0;
        for (int i =0; i<15;i++)
        {
            totalTime += InsertionSort.main(null);
            
        }
        System.out.println("Total Insertion Sort time: "+totalTime+"\t"+"\t"+"avg: "+ totalTime/15);
   }
}
