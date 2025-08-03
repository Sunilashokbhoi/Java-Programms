package com.lab.setter_getter;

public class Bonus {
    // Private attribute
    private double bonusAmount;

    // Getter method
    public double getBonusAmount() {
        return bonusAmount;
    }

    // Static method to calculate bonus
    public static Bonus calculateBonus(Employee employee) {
        Bonus bonus = new Bonus();
        double basicSalary = employee.getBasicSalary();
        int performanceRating = employee.getPerformanceRating();

        // Logic for bonus calculation based on performance rating
        switch (performanceRating) {
            case 1:
                bonus.bonusAmount = basicSalary * 0.05;
                break;
            case 2:
                bonus.bonusAmount = basicSalary * 0.10;
                break;
            case 3:
                bonus.bonusAmount = basicSalary * 0.15;
                break;
            case 4:
                bonus.bonusAmount = basicSalary * 0.20;
                break;
            case 5:
                bonus.bonusAmount = basicSalary * 0.25;
                break;
            default:
                bonus.bonusAmount = 0.0; // Invalid rating case
                System.out.println("Invalid performance rating!");
        }
        return bonus;
    }
}
