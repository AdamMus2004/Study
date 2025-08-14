public class Substring {
    public static void main(String[] args) {
        String s1 = "Hello, Anna!";
        System.out.println(s1.substring(7,11));
        String s2 = "Programming";
        System.out.println(s2.substring(s2.length()-3));
        String s3 = "Kangaroo";
        int mid = s3.length()/2;
        System.out.println(s3.substring(mid-1,mid+2));
        String s4 = "<<Hello>>";
        System.out.println(s4.substring(2,s4.length()-2));
        String s5 = "1234 5678 9012 3456";
        String s6 = "**** **** ****";
        System.out.println(s6+s5.substring(14));
    }
}
