import java.util.*;

public class AlgorithmsAndComputationalComplexity {
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


    public static int[] twoSum(int[] nums,int target) {
        //wartość-index
        HashMap<Integer/*inxed*/,Integer/*wartość*/> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target-nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }

    public static int firstDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return -1;
    }

    public static int maxSubArray(int[] nums) {
        int currentSum =nums[0];
        int maxSum =nums[0];

        for (int i = 0; i < nums.length; i++) {
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            maxSum = Math.max(maxSum,currentSum);


        }
        return maxSum;
    }

    public static int lengthOfLongestSubstring(String word) {
        char[] wordArr = word.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int max = 0;

        for (int end = start; end < wordArr.length;) {
            if (!set.contains(wordArr[end])) {
                set.add(wordArr[end]);
                end++;
                if (max<set.size()) {
                    max = set.size();
                }
            }
            else {

                set.remove(wordArr[start]);
                start++;
            }
        }
        return max;
    }

//    public static boolean checkInclusion(String s1, String s2) {
//        int start = 0;
//        HashSet<Character> s1HashSet = new HashSet<>();
//
//        for (int i = start; i < s2.length(); i++) {
//
//        }
//    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int sum = sumArray(nums);
        System.out.println(sum);

        int[] nums2 = {10, 7, 9, 1};
        boolean found = contains(nums2, 9);
        System.out.println(found);

        int[] nums3 = {1, 2, 3};
        pairs(nums3);

        System.out.println(isAscendingArr(nums));
        System.out.println(isAscendingArr(nums2));
        System.out.println(isEven(nums));

        System.out.println("TwoSum:");
        int[] nums4 = {10, 12, 11, 8};
        int target = 9;

        int[] result = twoSum(nums4, target);
        for (int i : result) {
            System.out.println(i);
        }
        System.out.println("firstDuplicate:");
        System.out.println(firstDuplicate(new int[]{2, 1, 3, 5, 3, 2}));
        System.out.println(firstDuplicate(new int[]{1, 2, 3, 4, 5}));
        System.out.println(firstDuplicate(new int[]{5, 5, 5, 5}));

        System.out.println("maxSubArray:");
        int[] nums5 = {-2, -3, -4};
        System.out.println(maxSubArray(nums5));
        int[] nums6 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums6));
        System.out.println("lengthOfLongestSubstring:");
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // 3
        System.out.println(lengthOfLongestSubstring(""));         // 0
        System.out.println(lengthOfLongestSubstring("au"));       // 2
        System.out.println(lengthOfLongestSubstring("dvdf"));     // 3
        System.out.println(lengthOfLongestSubstring("abba"));     // 2

//        System.out.println(checkInclusion("ab", "eidbaooo")); // ✅ true → "ba" jest w "eidbaooo"
//        System.out.println(checkInclusion("ab", "eidboaoo")); // ❌ false → żadna permutacja "ab" się nie pojawia
//        System.out.println(checkInclusion("adc", "dcda"));    // ✅ true → "dca" zawiera permutację "adc"
//        System.out.println(checkInclusion("a", "a"));         // ✅ true → jeden znak się zgadza
//        System.out.println(checkInclusion("a", "b"));         // ❌ false → inne znaki
//        System.out.println(checkInclusion("abc", "ccccbbbbaaaa")); // ❌ false
//        System.out.println(checkInclusion("abc", "bbbca"));         // ✅ true → "bca"



        TreeMap<Character,Integer> treeMap1 = new TreeMap<>();
        TreeMap<Character,Integer> treeMap2 = new TreeMap<>();
        String s1 = "mus";
        String s2 = "sum";
        for (Character c : s1.toCharArray()) {
            treeMap1.put(c, treeMap1.getOrDefault(c,0)+1);
        }

        for (Character c : s2.toCharArray()) {
            treeMap2.put(c, treeMap2.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> entry : treeMap1.entrySet()) {
            if (entry.getKey().equals(treeMap2));
        }

        for (Map.Entry<Character,Integer> entry : treeMap2.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }


    }


}
