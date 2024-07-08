package mergeSort;

public class MergeSort {
	    /* Function to merge the subarrays of a[] */
	    void merge(int[] a, int beg, int mid, int end) {
	        int n1 = mid - beg + 1;
	        int n2 = end - mid;

	        int[] LeftArray = new int[n1];
	        int[] RightArray = new int[n2];

	        /* Copy data to temporary arrays */
	        for (int i = 0; i < n1; i++)
	            LeftArray[i] = a[beg + i];
	        for (int j = 0; j < n2; j++)
	            RightArray[j] = a[mid + 1 + j];

	        int i = 0; // Initial index of first sub-array
	        int j = 0; // Initial index of second sub-array
	        int k = beg; // Initial index of merged sub-array

	        while (i < n1 && j < n2) {
	            if (LeftArray[i] <= RightArray[j]) {
	                a[k] = LeftArray[i];
	                i++;
	            } else {
	                a[k] = RightArray[j];
	                j++;
	            }
	            k++;
	        }
	        while (i < n1) {
	            a[k] = LeftArray[i];
	            i++;
	            k++;
	        }

	        while (j < n2) {
	            a[k] = RightArray[j];
	            j++;
	            k++;
	        }
	    }

	    /* Function to sort array using merge sort algorithm */
	    void mergeSort(int[] a, int beg, int end) {
	        if (beg < end) {
	            int mid = (beg + end) / 2;
	            mergeSort(a, beg, mid);
	            mergeSort(a, mid + 1, end);
	            merge(a, beg, mid, end);
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {42, 19, 28, 5, 6, 15};
	        MergeSort ms = new MergeSort();
	        System.out.println("Before sorting array elements are: " + java.util.Arrays.toString(arr));
	        ms.mergeSort(arr, 0, arr.length - 1);
	        System.out.println("After sorting array elements are: " + java.util.Arrays.toString(arr));
	    }
	}


	


