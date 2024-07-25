public class MergeSort2 {


        // Function to sort the array using merge sort
        public static void mergeSort(int[] arr, int l, int r) {
            // Base case: If the array has one or no elements, it's already sorted
            if (l >= r) {
                return;
            }

            // Calculate the midpoint of the array
            int mid = l + (r - l) / 2;

            // Create and populate the left and right subarrays
            int[] b = new int[mid - l + 1]; // Left subarray
            int[] c = new int[r - mid];     // Right subarray

            for (int i = l; i <= mid; i++) {
                b[i - l] = arr[i];
            }

            for (int j = mid + 1; j <= r; j++) {
                c[j - (mid + 1)] = arr[j];
            }

            // Recursively sort the left and right subarrays
            mergeSort(b, 0, b.length - 1);
            mergeSort(c, 0, c.length - 1);

            // Merge the sorted subarrays into the original array
            merge(b, c, arr, l);
        }

        // Function to merge two sorted subarrays into one
        public static void merge(int[] s1, int[] s2, int[] s, int l) {
            int i = 0; // Index for s1
            int j = 0; // Index for s2
            int k = l; // Index for s (merged array)

            // Merge elements from s1 and s2 into s
            while (i < s1.length && j < s2.length) {
                if (s1[i] <= s2[j]) {
                    s[k++] = s1[i++];
                } else {
                    s[k++] = s2[j++];
                }
            }

            // Copy remaining elements from s1, if any
            while (i < s1.length) {
                s[k++] = s1[i++];
            }

            // Copy remaining elements from s2, if any
            while (j < s2.length) {
                s[k++] = s2[j++];
            }
        }

        // Main method to test the merge sort function
        public static void main(String[] args) {
            int[] arr = {38, 27, 43, 3, 9, 82, 10}; // Example array
            mergeSort(arr, 0, arr.length - 1);

            // Print sorted array
            for (int num : arr) {
                System.out.print("Sorted array" + num + " ");
            }
        }
    }


