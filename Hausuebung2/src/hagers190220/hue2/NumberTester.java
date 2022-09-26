package hagers190220.hue2;

public class NumberTester {
    String file;
    NumberTest oddTest;
    NumberTest primeTester;
    NumberTest palindromeTester;

    public NumberTester(String file) {
        this.file = file;
    }

    public void setOddEvenTester(NumberTest oddTest){
        this.oddTest = oddTest;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }

    public void testFile(){

    }
}
