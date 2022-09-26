package hagers190220.hue2;

public class Main {
    public static void main(String[] args) {
        HalloJavamitForEach test1 = new HalloJavamitForEach("hallo","welt","test");

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
            return false;

        });
        numberTester.setPalindromeTester((n) -> {
            String length = String.valueOf(n);
            int counter = 0;
            int l = length.length();
            for (int i = 0; i < length.length(); i++) {
                if(length.charAt(0) == (length.charAt(l-1))){
                    l--;
                    counter++;
                }
            }
            return counter == length.length();
        });

        numberTester.testFile();
    }
}
