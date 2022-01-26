
package tesssset;

import java.util.Scanner;

public class DateValidation {

    public static void main(String[] args) {
         // Test if the date is valid 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the date please, \n Hint: date formate must be as following dd/mm/yy any other format not accepted");
        String date = s.nextLine();
        String dd = date.substring(0, 2);
        int d = Integer.parseInt(dd);
        String mm = date.substring(3, 5);
        int m = Integer.parseInt(mm);
        String yy = date.substring(6);
        int y = Integer.parseInt(yy);
        char c1 = date.charAt(2);
        char c2 = date.charAt(5);
        if (date.length() == 10) {
            if (c1 == '/' && c2 == '/') // to check whether a date contains slash(/)0r not
            {
                if (d >= 1 || m >= 1 || y > 1000) {// if user input = 00/00/00
                    if (d > 31 && m > 12) {//تم ربط شرط اليوم مع الشهر حتى لا تتكرر جملة الطباعة مرتان عند عدم تحقق شرط اليوم داخل البلوك من (35_64)     
                     System.out.println("invalid day");
                    }
                    if (m > 12) {
                        System.out.println("invalid month");
                    }
                    if (y > 2030) {
                        System.out.println("invalid year\"maximum year allowed to be entered is 2030 \"");
                    }

                    if (m == 2) {
                        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
                            if (d > 29) {
                                System.out.println("invalid day");
                            } else {
                                System.out.println("valid date");
                            }

                        } else {
                            if (d > 28) {
                                System.out.println("invalid day");
                            } else {
                                System.out.println("valid date");
                            }
                        }

                    } else if (m == 4 || m == 6 || m == 9 || m == 11) {
                        if (d > 30) {
                            System.out.println("invalid day");
                        } else {
                            System.out.println("valid date");
                        }

                    } else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 10 || m == 12) {
                        if (d > 31) {
                            System.out.println("invalid day");
                        } else {
                            System.out.println("valid date");
                        }
                    }

                }
             else {
                System.out.println("invalid input \"the number of date must be greater than one \" ");
            }
        } else {
            System.out.println("invalid slashes");
        }

    }else{System.out.println("invalid date");}
    }
}
