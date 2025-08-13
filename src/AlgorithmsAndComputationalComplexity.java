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

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length()>s2.length()) return false;
        int[] s1Arr = new int[26];
        int[] windowArr = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Arr[s1.charAt(i)-'a']++;
            windowArr[s2.charAt(i)-'a']++;
        }

        if (Arrays.equals(s1Arr,windowArr)) return true;

        for (int i = s1.length(); i<s2.length(); i++) {
            windowArr[s2.charAt(i)-'a']++;
            windowArr[s2.charAt(i-s1.length())-'a']--;

            if (Arrays.equals(s1Arr,windowArr)) return true;
        }
        return false;
    }

//    public static String minimumWindowSubstring(String s, String t) {
//        if (t.length() > s.length()) return new String("");
//        int[] need = new int[26];
//        int[] s1Arr = new int[26];
//
//        for (int i = 0; i < s.length(); i++) {
//            s1Arr[s.charAt(i)-'a']++;
//
//        }
//
//        return need.toString();
//    }

    public static boolean isAnagram(String s1, String s2) {
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if (s1.equals(s2)) return true;
        if (s1.length()!=s2.length()) return false;
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Arr[s1.charAt(i)-'a']++;
            s2Arr[s2.charAt(i)-'a']++;
        }
        if (Arrays.equals(s1Arr,s2Arr)) return true;
        else return false;
    }
    public static boolean isAnagram2(String s1, String s2) {
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        Map<Character,Integer> map = new TreeMap<>();

        if (s1.length()!=s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i),0)+1);
            map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i),0)-1);
        }
        for (int count  : map.values()) {
            if (count!=0) return false;
        }
        return true;
    }

    public static int factorial(int n) {
        if (n==0) return 1;
        return n*factorial(n-1);
    }

    public static int fibonacci(int n) {
        if (n==0) return 0;
        if (n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static boolean binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid]==target) return true;
            else if (nums[mid] < target) low = mid+1;
            else  high=mid-1;
        }
        return false;
    }

    public static String reverseString(String s) {

        return s;
    }

    public static int GCD(int a, int b) {
        if (Math.min(a,b)==0) return Math.max(a,b);
        return GCD(b,a%b);
    }



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

        System.out.println(checkInclusion("ab", "eidbaooo")); // ✅ true → "ba" jest w "eidbaooo"
        System.out.println(checkInclusion("ab", "eidboaoo")); // ❌ false → żadna permutacja "ab" się nie pojawia
        System.out.println(checkInclusion("adc", "dcda"));    // ✅ true → "dca" zawiera permutację "adc"
        System.out.println(checkInclusion("a", "a"));         // ✅ true → jeden znak się zgadza
        System.out.println(checkInclusion("a", "b"));         // ❌ false → inne znaki
        System.out.println(checkInclusion("abc", "ccccbbbbaaaa")); // ❌ false
        System.out.println(checkInclusion("abc", "bbbca"));         // ✅ true → "bca"

        System.out.println("isAnagram:");
        System.out.print(isAnagram("listen", "silent"));    // true
        System.out.print(isAnagram2("listen", "silent")+"|");    // true
        System.out.print(isAnagram("triangle", "integral"));// true
        System.out.print(isAnagram2("triangle", "integral")+"|");// true
        System.out.print(isAnagram("apple", "papel"));      // true
        System.out.print(isAnagram2("apple", "papel")+"|");      // true
        System.out.print(isAnagram("rat", "car"));          // false
        System.out.print(isAnagram2("rat", "car")+"|");          // false
        System.out.print(isAnagram("aabb", "bbaa"));        // true
        System.out.print(isAnagram2("aabb", "bbaa")+"|");        // true
        System.out.print(isAnagram("abc", "abcc"));         // false
        System.out.print(isAnagram2("abc", "abcc")+"|");         // false
        System.out.println("Factorial:");
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(0));

        System.out.println("Fibonaci:");
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(8));

        System.out.println("binarySearch:");

        int[] numsbs = {1, 3, 5, 7, 9, 11, 15};

        System.out.println(binarySearch(numsbs, 5));   // true
        System.out.println(binarySearch(numsbs, 1));   // true
        System.out.println(binarySearch(numsbs, 15));  // true
        System.out.println(binarySearch(numsbs, 0));   // false
        System.out.println(binarySearch(numsbs, 10));  // false
        System.out.println(binarySearch(numsbs, 16));  // false

        System.out.println("GCD:");
        System.out.println(GCD(54, 24));    // 6
        System.out.println(GCD(100, 6));    // 2
        System.out.println(GCD(17, 13));    // 1 (liczby pierwsze)
        System.out.println(GCD(0, 5));      // 5
        System.out.println(GCD(5, 0));      // 5
        System.out.println(GCD(0, 0));      // 0 (umownie)
        System.out.println(GCD(48, 180));   // 12
    }
}
