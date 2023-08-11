package day5;

import java.util.Scanner;
class SalaryExpr { 
    private int bonus;

    SalaryExpr() { 
        this.bonus = 0;
    }

    SalaryExpr(int bonus) { 
        this.bonus = bonus;
    }

    int getSalary(int grade) { 
        int salary = 0;
        switch (grade) {
            case 1:
                salary = this.bonus + 100;
                break;
            case 2:
                salary = this.bonus + 90;
                break;
            case 3:
                salary = this.bonus + 80;
                break;
            case 4:
                salary = this.bonus + 70;
                break;
        }
        return salary;
    }
}

public class SalaryExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the month number: "); 
        int month = scanner.nextInt(); 
        boolean isBonusMonth = (month % 2 == 0);

        System.out.print("Enter the grade (1-4): ");
        int grade = scanner.nextInt();

        scanner.close();

        SalaryExpr salaryExpr;
        int bonus = 0;

        if (isBonusMonth) {
            salaryExpr = new SalaryExpr(100);
            bonus = 100;
        } else {
            salaryExpr = new SalaryExpr();
        }

        int salary = salaryExpr.getSalary(grade);
        System.out.println(month + "월 " + grade + "등급의 월급은 " + (salary + bonus) + "입니다.");
    }
}
