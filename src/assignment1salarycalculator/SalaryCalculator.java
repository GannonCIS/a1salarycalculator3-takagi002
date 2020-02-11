/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

import java.text.DecimalFormat;

/**
 *
 * @author julia
 */
public class SalaryCalculator {
    DecimalFormat df = new DecimalFormat("#.##");
    
    public void SalaryCalculator(){}
    
    public void calcHourlyWage(double salary){
        double hourlyWage = salary/2080;
        String hW = df.format(hourlyWage);
        System.out.println("Hourly wage: $" + hW);
              
    }
    
    public void calcSalary(double hourlyWage){
        double salary = hourlyWage*2080;
        String s = df.format(salary);
        System.out.println("Salary: $" + s);
    }
    
    public void calcTaxes(int tempPerc, double salary){
        double percIncome = (100 - tempPerc)*.01*salary;
        double perc = tempPerc*.01;
        double taxes = salary*perc;
        String pI = df.format(percIncome);
        String t = df.format(taxes);
        System.out.println("How much you're paying in taxes: $" + t);
        System.out.println("How much you make after tax $:" + pI);
    }
    
    public double monthlyAfterTax(int salary, double perc){
        
    }
}
