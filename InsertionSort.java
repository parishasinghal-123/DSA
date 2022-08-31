public class InsertionSort {
    public static void PrintArray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void Sorting(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int current = arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j])
           
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,6,3,8,0};
        Sorting(arr);
        PrintArray(arr);
    }
}