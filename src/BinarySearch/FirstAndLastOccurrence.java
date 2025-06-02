package BinarySearch;

//Binary Search 1.1
public class FirstAndLastOccurrence {

    public static int firstOccurrence(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        int mid = start + (end - start) / 2;

        while(start <= end) {
            if(arr[mid] == key) {
                ans = mid;
                end = mid - 1;
            }
            else if(arr[mid] < key) {
                start = mid + 1;
            }
            else if(arr[mid] > key) {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static int lastOccurrence(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        int mid = start + (end - start) / 2;

        while(start <= end) {
            if(arr[mid] == key) {
                ans = mid;
                start = mid + 1;
            }
            else if(arr[mid] < key) {
                start = mid + 1;
            }
            else if(arr[mid] > key) {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return ans;
    }

    public static void main(String []args) {
        int []arr = {1, 2, 4, 5, 5, 6};
        int storeFirst = firstOccurrence(arr, 9);
        int storeLast = lastOccurrence(arr, 8);
        System.out.println(storeFirst+ " " + storeLast);
    }

}
