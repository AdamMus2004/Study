public class Test {
    public static void main(String[] args) {
        String s1 = "abcc";
        String s2 = "abc";

        System.out.println(s1.contains(s2));

        int a = 100;
        int b = 6;
        int nwd=0;
        for (int i = 1; i < Math.min(a,b); i++) {
            if (b%i==0 || a%i==0) {

            }
        }
        System.out.println(nwd);
    }
}

