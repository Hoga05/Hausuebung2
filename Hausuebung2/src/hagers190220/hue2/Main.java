package hagers190220.hue2;

public class Main {
    public static void main(String[] args) {
        HalloJavamitForEach test1 = new HalloJavamitForEach("hallo","welt","test");

        NumberTester numberTester = new NumberTester("file.txt");

        numberTester.oddTest = (n) -> {
            return n % 2 == 0;
        };
        numberTester.primeTester = (n) -> {

        };
        numberTester.palindromeTester = (n) -> {
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
        };

        numberTester.testFile();
    }
}
