//Binary Search
public class Number_Floor {

    public static void main(String[] args) {

        int[] floorArr = {2, 4, 6, 8, 10, 12, 14, 16};

        int ans = floorNum(floorArr, 5);

        System.out.println(floorArr[ans]);

    }
    //smallest number >= x to target
    static int floorNum(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int middle = (start + end) / 2;

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }

        }
        return end;

    }
}
