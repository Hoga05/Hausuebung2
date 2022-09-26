package hagers190220.hue2;

import java.util.Scanner;

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


        RationalCalculator r = new RationalCalculator();
        VectorCalculator c = new VectorCalculator();

        int option = 0;
        while(option != 3) {
            System.out.println("Choose Calculator:");
            System.out.println("1 .... Rational Calculator");
            System.out.println("2 .... Vector Calculator");
            System.out.println("3 .... Exit Programm");

            Scanner s = new Scanner(System.in);
            option = Integer.parseInt(s.nextLine());
            int xa = 0;
            int xb = 0;
            int ya = 0;
            int yb = 0;

            int a = 0;
            int b= 0;

            int rechenoperation = 5;

            switch (option) {
                case 1:
                    while(rechenoperation == 5) {
                        try {
                            System.out.println("Enter number x a >");
                            xa = Integer.parseInt(s.nextLine());
                            System.out.println("Enter number y a >");
                            ya = Integer.parseInt(s.nextLine());
                            System.out.println("Enter number x b >");
                            xb = Integer.parseInt(s.nextLine());
                            System.out.println("Enter number y b >");
                            yb = Integer.parseInt(s.nextLine());


                            System.out.println("1 - add");
                            System.out.println("2 - subt");
                            System.out.println("3 - mult");
                            System.out.println("4 - div");
                            System.out.println("5 - Zahlen erneut eingeben");

                            rechenoperation = Integer.parseInt(s.nextLine());

                            System.out.println("--------------------");
                        }catch (NumberFormatException n){
                            System.out.println("only numbers!");
                            continue;
                        }
                    }
                    System.out.println("Solution:");
                     a = 0;
                     b = 0;
                    switch (rechenoperation){
                        case 1: Number n1 = r.add(new Number(xa,ya), new Number(xb,yb));
                            System.out.println("a = "+n1.getA());
                            System.out.println("b = "+n1.getB());
                            break;
                        case 2:Number n2 = r.subt(new Number(xa,ya), new Number(xb,yb));
                            System.out.println("a = "+n2.getA());
                            System.out.println("b = "+n2.getB());
                            break;
                        case 3:Number n3 = r.mult(new Number(xa,ya), new Number(xb,yb));
                            System.out.println("a = "+n3.getA());
                            System.out.println("b = "+n3.getB());
                            break;
                        case 4:Number n4 = r.divi(new Number(xa,ya), new Number(xb,yb));
                            System.out.println("a = "+n4.getA());
                            System.out.println("b = "+n4.getB());
                            break;
                        case 5: //TODO: hier
                            break;
                    }
                    System.out.println("--------------------");
                    break;
                case 2: while(rechenoperation == 5) {
                    try {
                        System.out.println("Enter number x a >");
                        xa = Integer.parseInt(s.nextLine());
                        System.out.println("Enter number y a >");
                        ya = Integer.parseInt(s.nextLine());
                        System.out.println("Enter number x b >");
                        xb = Integer.parseInt(s.nextLine());
                        System.out.println("Enter number y b >");
                        yb = Integer.parseInt(s.nextLine());

                        System.out.println("1 - add");
                        System.out.println("2 - subt");
                        System.out.println("3 - mult");
                        System.out.println("4 - div");
                        System.out.println("5 - Zahlen erneut eingeben");

                        rechenoperation = Integer.parseInt(s.nextLine());

                        System.out.println("--------------------");
                    }catch (NumberFormatException n){
                        System.out.println("only numbers!");
                        continue;
                    }
                }
                    System.out.println("Solution:");
                     a = 0;
                     b = 0;
                    switch (rechenoperation){
                        case 1: Number n1 = c.add(new Number(xa,ya), new Number(xb,yb));
                            System.out.println("a = "+n1.getA());
                            System.out.println("b = "+n1.getB());
                            break;
                        case 2:Number n2 = c.subt(new Number(xa,ya), new Number(xb,yb));
                            System.out.println("a = "+n2.getA());
                            System.out.println("b = "+n2.getB());
                            break;
                        case 3:Number n3 = c.mult(new Number(xa,ya), new Number(xb,yb));
                            System.out.println("a = "+n3.getA());
                            System.out.println("b = "+n3.getB());
                            break;
                        case 4:Number n4 = c.divi(new Number(xa,ya), new Number(xb,yb));
                            System.out.println("a = "+n4.getA());
                            System.out.println("b = "+n4.getB());
                            break;
                        case 5: //TODO: hier
                            break;
                    }
                    System.out.println("--------------------");
                    break;

            }

        }

    }
}
