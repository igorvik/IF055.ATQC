/*
* Copyright (C) 2015 TaskOOP Project by Ihor Dynka
 */

package idyntc.task_oop;

import java.math.BigDecimal;

/**
 * initialized perHourSalary employee and calculates their salary
 */
public class PerHourSalaryEmployee extends Employee {

    private double DAYS_QUANTITY = 20.8;
    private int HOURS_QUANTITY = 8;
    private double salary;


    public PerHourSalaryEmployee(int id, String name, String surname,double salary) {
        super(id, name, surname);
        this.salary = salary;
    }

    /**
         * this method calculates the salary of per hour salary employees and rounds it
         *
         * @return salary for these employees
         */
    @Override
    public double getSalary() {
        //TODO what if the method never get's called? the FixedSalaryEmployee object will be invalid
        if (salary <= 0) {
            System.out.printf("Error input for per hourly salary employees");
        }

        return BigDecimal.valueOf(DAYS_QUANTITY * HOURS_QUANTITY * salary).setScale(2, BigDecimal.ROUND_HALF_DOWN).
                doubleValue();
    }
}
