/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1salarycalculator;

/**
 *
 * @author gubotdev
 */
public class Assignment1SalaryCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SalaryCalculator sc = new SalaryCalculator();
        
        sc.calcHourlyWage(30000);
        sc.calcSalary(14);
        sc.calcTaxes(20, 50760.76);
        sc.monthlyAfterTax(15.80, 80413.72);
    }
    
}
