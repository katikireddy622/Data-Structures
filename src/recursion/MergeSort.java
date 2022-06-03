package recursion;

public class MergeSort {
    public static void main(String[] args) {
        int[] unsortedArray=new int[]{2,4,1,6,8,5,3,7};
        mergeSort(unsortedArray,unsortedArray.length);
        for (int i : unsortedArray) {
            System.out.println(i);
        }
    }
    public static void mergeSort(int[] arr, int n)
    {
        if(n==1)
        {
            return ;
        }

        int mid=0;
        if(n%2==0)
        {
            mid=n/2;
        }
        else
        {
            mid=(n/2)+1;
        }
        int[] left = new int[mid];
        int[] right = new int[n-mid];

        for (int i = 0; i <mid ; i++) {
            left[i]=arr[i];
        }

        for (int p=0, i = mid; i <n ; i++,p++) {
            right[p]=arr[i];
        }
        mergeSort(left,left.length);
        mergeSort(right,right.length);
        merge(left,right,arr);
    }
    public static int[] merge(int[] left,int[] right,int[] mergedArray)
    {
        int i=0,j=0,k=0;
        while (i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                mergedArray[k]=left[i];
                i++;
            }
            else
            {
                mergedArray[k]=right[j];
                j++;
            }
            k++;
        }
        while (i<left.length)
        {
            mergedArray[k]=left[i];
            k++;
            i++;
        }
        while (j<right.length)
        {
            mergedArray[k]=right[j];
            k++;
            j++;
        }
        return mergedArray;
    }
}
