package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the status 0, 1, 2, or 3");
        int status = input.nextInt();
        if ((status >= 0) & (status <= 3)) {
            System.out.println("please enter your income");
            double income = input.nextDouble();
            double tax = 0;
            if (status == 0) {
                if (income <= 8350) {
                    tax = income * 0.10;
                } else if (income <= 33950) {
                    tax = 8350 * 0.10 + (income - 8350) * 0.15;
                } else if (income <= 82250) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
                } else if (income <= 171550) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
                } else if (income <= 372950) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                            (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                            (income - 171550) * 0.33;
                } else tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
            }

            if (status == 1) {
                if (income <= 16700) {
                    tax = income * 0.10;
                } else if (income <= 67900) {
                    tax = 16700 * 0.10 + (income - 16700) * 0.15;
                } else if (income <= 137050) {
                    tax = 16700 * 0.10 + (67901 - 16700) * 0.15 + (income - 67901) * 0.25;
                } else if (income <= 208850) {
                    tax = 16700 * 0.10 + (137051 - 16700) * 0.15 +
                            (137051 - 67901) * 0.25 + (income - 137051) * 0.28;
                } else if (income <= 372950) {
                    tax = 16700 * 0.10 + (33950 - 16700) * 0.15 +
                            (137050 - 67901) * 0.25 + (208850 - 137050) * 0.28 +
                            (income - 208851) * 0.33;
                } else tax = 16700 * 0.10 + (33950 - 16700) * 0.15 +
                        (137050 - 67901) * 0.25 + (208850 - 137050) * 0.28 +
                        (372950 - 208851) * 0.33 + (income - 372950) * 0.35;
            }

            if (status == 2) {
                if (income <= 8350) {
                    tax = income * 0.10;
                } else if (income <= 33950) {
                    tax = 8350 * 0.10 + (income - 8350) * 0.15;
                } else if (income <= 68525) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
                } else if (income <= 104425) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68526) * 0.28;
                } else if (income <= 186475) {
                    tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                            (68525 - 33950) * 0.25 + (104425 - 68526) * 0.28 +
                            (income - 104426) * 0.33;
                } else tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (68525 - 33950) * 0.25 + (104425 - 68526) * 0.28 +
                        (186475 - 104426) * 0.33 + (income - 186475) * 0.35;
            }
            if (status == 3) {
                if (income <= 11950) {
                    tax = income * 0.10;
                } else if (income <= 45500) {
                    tax = 11950 * 0.10 + (income - 11950) * 0.15;
                } else if (income <= 117450) {
                    tax = 11950 * 0.10 + (45500 - 11951) * 0.15 + (income - 11951) * 0.25;
                } else if (income <= 190200) {
                    tax = 11950 * 0.10 + (45500 - 11951) * 0.15 + (117450 - 45501) * 0.25 + (income - 117451) * 0.28;
                } else if (income <= 372950) {
                    tax = 11950 * 0.10 + (45500 - 11951) * 0.15 +
                            (117450 - 45501) * 0.25 + (190200 - 117451) * 0.28 +
                            (income - 190200) * 0.33;
                } else tax = 8350 * 0.10 + (45500 - 11951) * 0.15 +
                        (117450 - 45501) * 0.25 + (190200 - 117451) * 0.28 +
                        (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
            }
            System.out.println(" your tax for year is " + tax);
        } else if (status > 3)
            System.out.print("wrong status");
    }
}
