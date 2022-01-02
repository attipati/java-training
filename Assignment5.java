
package assignments;
public class Assignment5 {
    public static void main(String args[]) {
        //Scanner sc = new Scanner(System.in);
        //int n= sc.nextInt();
        int arr[]={30,120,-4,60,90,330,220,3};
        Assignment5 as=new Assignment5();
        //int arr[] = new int[n];
        //for(int i=0;i<n;i++)
        /*{
            arr[i]=sc.nextInt();
        }*/
        //int result = obj.LargestInArray(int arr[],int n);
        System.out.println(as.LargestInArray(arr,arr.length));
     
    }
    public int LargestInArray(int arr[],int n)
    {
        int max = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
        
    }
}