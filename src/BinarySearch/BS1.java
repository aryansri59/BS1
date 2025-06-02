package BinarySearch;

//This one is a basic of Binary
public class BS1 {

    public static void main(String []args) {

        int []arr = {11, 22, 33, 44, 55};
        int start = 0, end = arr.length-1;
        int find_key = 22;
        int mid = (start+end) / 2;

        while(end >= start) {

            if(arr[mid] == find_key) {
                System.out.println(mid);       // Print index value
                break;
            }
            else if(arr[mid] < find_key) {
                start = mid + 1;
                mid = (start+end) / 2;
            }
            else if(arr[mid] > find_key) {
                end = mid - 1;
                mid = (start+end) / 2;
            }
        }

    }

}
