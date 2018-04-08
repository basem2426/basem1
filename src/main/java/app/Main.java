package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------------- بداية عملية الجمع----------------");
        System.out.println("نتيجة جمع الرقمين تساوي " + getSum());
        System.out.println("----------------نهاية عملية الجمع----------------");

        System.out.println("---------------- بداية عملية الطرح----------------");
        System.out.println("نتيجة طرح الرقمين تساوي " + getSubtract());
        System.out.println("----------------نهاية عملية الطرح----------------");

        System.out.println("---------------- بداية عملية القسمة----------------");
        System.out.println("نتيجة قسمة الرقمين تساوي " + qsma());
        System.out.println("----------------نهاية عملية القسمة----------------");

        System.out.println("---------------- بداية عملية الضرب----------------");
        System.out.println("نتيجة الضرب الرقمين تساوي " + dreb ());
        System.out.println("----------------نهاية عملية الضرب----------------");

    }

    public static double getSum(){
        Scanner input = new Scanner(System.in);

        System.out.println("ادخل الرقم الأ,ل:");
        double num1 = input.nextDouble();

        System.out.println("ادخل الرقم الثاني:");
        double num2 = input.nextDouble();

        return num1 + num2;
    }

    public static double getSubtract(){
        Scanner input = new Scanner(System.in);

        System.out.println("ادخل الرقم الأ,ل:");
        double num1 = input.nextDouble();

        System.out.println("ادخل الرقم الثاني:");
        double num2 = input.nextDouble();

        return num1 - num2;
    }

    public static double qsma () {
        Scanner input = new Scanner(System.in);

        System.out.println("ادخل الرقم الأ,ل:");
        double num1 = input.nextDouble();

        System.out.println("ادخل الرقم الثاني:");
        double num2 = input.nextDouble();

        return num1 / num2;
    }

        public static double dreb (){
            Scanner input = new Scanner(System.in);

            System.out.println("ادخل الرقم الأ,ل:");
            double num1 = input.nextDouble();

            System.out.println("ادخل الرقم الثاني:");
            double num2 = input.nextDouble();

            return num1 * num2;
    }
}
