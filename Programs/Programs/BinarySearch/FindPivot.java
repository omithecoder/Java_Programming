package Programs.BinarySearch;

public class FindPivot {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,1,2};
        int start =0;
        int end = arr.length-1;
        int mid=0;
        if(arr[start]<arr[end])
        {
            System.out.println(arr[end]);
        }
        else {
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (mid < arr.length - 1 && (arr[mid] > arr[mid + 1])) {
                    System.out.println(arr[mid]);
                    break;
                } else if (mid > 0 && (arr[mid] < arr[mid - 1])) {
                    System.out.println(arr[mid - 1]);
                    break;
                } else if (arr[start] > arr[mid]) {
                    end = mid - 1;
                } else if (arr[start] < arr[mid]) {
                    start = mid;
                }
            }
        }



    }
}
