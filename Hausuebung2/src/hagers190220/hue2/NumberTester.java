package hagers190220.hue2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

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




        try {
            Scanner f = new Scanner(new File(file));

            int zeilen = Integer.parseInt(f.nextLine());

            String line = "";
            for (int i = 0; i < zeilen; i++) {

                line = f.nextLine();
                String teile[] = line.split(" ");

                int zahl1 = Integer.parseInt(teile[0]);
                int zahl2 = Integer.parseInt(teile[1]);

                switch(zahl1){
                    case 1: if(oddTest.testNumber(zahl2)){
                        System.out.println("EVEN");
                    }else{
                        System.out.println("NOT EVEN");
                    }
                        break;
                    case 2: if(primeTester.testNumber(zahl2)){
                        System.out.println("PRIME");
                    }else{
                        System.out.println("NO PRIME");
                    }
                        break;
                    case 3: if(palindromeTester.testNumber(zahl2)){
                        System.out.println("PALINDROME");
                    }else{
                        System.out.println("NO PALINDROME");
                    }
                        break;
                }

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
