package hagers190220.hue2;

public class Main {
    public static void main(String[] args) {
        HalloJavamitForEach test1 = new HalloJavamitForEach("hallo","welt","test");

        System.out.println("------------");

        NumberTester numberTester = new NumberTester("file.txt");

        numberTester.setOddEvenTester((n) -> {
            return n % 2 == 0;
        });
        numberTester.setPrimeTester((n) -> {

            for (int i = 2; i <= 9; i++) {
                if(n % i == 0 && n != i){
                    return false;
                }
            }
            return true;

        });
        numberTester.setPalindromeTester((n) -> {
            String s1 = n+"";
            String s2 = n+"";
            StringBuilder sb = new StringBuilder(s2);
            sb.reverse();
            s2 = sb.toString();
            return s1.equals(s2);
        });

        numberTester.testFile();
    }
}
