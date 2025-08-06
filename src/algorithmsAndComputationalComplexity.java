public class algorithmsAndComputationalComplexity {
    public static int sumArray(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
             sum += nums[i];
        }
        return sum;
    }
    //O(n)

    public static boolean contains(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++) {
            if (num==nums[i]) return true;
        }
        return false;
    }
    //O(n)

    public static void pairs(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i!=j) System.out.println("("+i+","+j+")");
            }
        }
    }
    //O(n^2)
    public static boolean isAscendingArr(int[] nums) {
        int max=nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>=max) {
                max = nums[i];
            }
            else return false;
        }
        return true;
    }
    //O(n)

    public static int isEven(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int sum = sumArray(nums);
        System.out.println(sum);

        int[] nums2 = {3, 7, 9, 1};
        boolean found = contains(nums2, 9);
        System.out.println(found);

        int[] nums3 = {1, 2, 3};
        pairs(nums3);

        System.out.println(isAscendingArr(nums));
        System.out.println(isAscendingArr(nums2));

        System.out.println(isEven(nums));
    }


}
