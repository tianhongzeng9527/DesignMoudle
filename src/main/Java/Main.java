import java.util.ArrayList;
import java.util.List;

/**
 * Created by tian on 16-5-29.
 */
public class Main {

    public static void main(String[] args) {
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = i;
        }
        Main main = new Main();
        main.subsets(a);
        System.out.println(main.lists);
    }

    List<List<Integer>> lists = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsets(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            permutation(nums, 0, i);
        }
        return lists;
    }

    public int findPeakElement(int[] nums) {
        if (nums.length == 1)
            return 0;
        if (nums.length > 1) {
            if (nums[0] > nums[1]) {
                return 0;
            }

            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                    return nums[i];
                }
            }
            if (nums[nums.length - 1] > nums[nums.length - 2])
                return nums.length - 1;
        }
        return -1;
    }

    public void permutation(int[] a, int index, int n) {
        if (index == n) {
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0; i < n; i++){
                list.add(a[i]);
            }
            lists.add(list);
        }
        for (int i = index; i < a.length; i++) {
            int temp = a[i];
            a[i] = a[index];
            a[index] = temp;
            permutation(a, index + 1, n);
            temp = a[i];
            a[i] = a[index];
            a[index] = temp;
        }
    }
}
