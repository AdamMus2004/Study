public class Regex {
    public static void main(String[] args) {
        String regex = "\\d+";

        System.out.println("12345".matches(regex));
        System.out.println("12345a".matches(regex));
        System.out.println("////////////////////////////////////////");
        regex = "[A-Z][a-zAA-Z]{2,}";

        System.out.println("Adam".matches(regex));
        System.out.println("adam".matches(regex));
        System.out.println("Ad".matches(regex));

        System.out.println("////////////////////////////////////////");
        regex = "\\d{2}-\\d{3}";

        System.out.println("30-300".matches(regex));
        System.out.println("3-30".matches(regex));
        System.out.println("30300".matches(regex));

        System.out.println("////////////////////////////////////////");
        regex = "\\d{11}";

        System.out.println("12345678901".matches(regex));
        System.out.println("1234567890a".matches(regex));
        System.out.println("12345".matches(regex));

        System.out.println("////////////////////////////////////////");
        regex = "\\w+@\\w+\\.pl";

        System.out.println("adam@wp.pl".matches(regex));
        System.out.println("adam@wp".matches(regex));
        System.out.println("@wp.pl".matches(regex));

        System.out.println("////////////////////////////////////////");
        regex = "[\\w\\s]+\\.";

        System.out.println("To jest zdanie.".matches(regex));
        System.out.println("To jest zdanie".matches(regex));
        System.out.println("@wp    . pl.".matches(regex));

        System.out.println("////////////////////////////////////////");
        regex = "[0-9]{1,}\\.([1-9][0-9]|[0][1-9]){1,}";

        System.out.println("322.14.".matches(regex));
        System.out.println("0.50".matches(regex));
        System.out.println("1.00".matches(regex));
        System.out.println("0.70".matches(regex));
        System.out.println("3,14".matches(regex));
        System.out.println("314".matches(regex));
    }
}

