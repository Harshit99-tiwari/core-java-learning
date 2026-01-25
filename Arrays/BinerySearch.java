package Arrays;

public class BinerySearch {
    public static void main(String[] args) {
        int arr[] = { 4, 7, 12, 18, 23, 31, 27, 39, 45, 52 };
        int target = 31;
        int low = 0;
        int high = arr.length - 1;
        int res = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                res = mid;
                break;

            } else if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }
        }
        System.out.println(res);
        if (res != -1) {
            System.out.println("target found");
        } else {
            System.out.println("target not found");
        }
    }
}
