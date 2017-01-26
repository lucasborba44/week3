/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author Lucas
 */
public abstract class Employee {
    private String fName;   
    private String lName; 
    private int socialInsuranceNumber;
    private LocalDate birthdate;  
    
    
    
    
    /**
     *
     * @param fNameValue
     * @param lNameValue
     * @param dob
     */
    public Employee(String fNameValue, String lNameValue, int sin, LocalDate dob){  
        fName = fNameValue;
        lName = lNameValue;
        setBirthday(dob);  
        socialInsuranceNumber = sin;
    }

    
    /**
     * This method will validate that the Employee is 15-90 years old
     * 
     */
            //does not return
    public void setBirthday(LocalDate dob)
    {
        LocalDate today = LocalDate.now();
        int age = Period.between(dob, today).getYears();
        
        if(age >= 15 && age <= 90)
            birthdate = dob;
        else
            throw new IllegalArgumentException("Employees must be 15-90 years old");
    }

    /**
     * @return the fName
     */
    public String getfName() {
        return fName;
    }

    /**
     * @return the lName
     */
    public String getlName() {
        return lName;
    }

    /**
     * @return the socialInsuranceNumber
     */
    public int getSocialInsuranceNumber() {
        return socialInsuranceNumber;
    }

    /**
     * @return the birthdate
     */
    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    /**
     * This method will return the employee's first and last name
     */
    
    @Override
    /**
     * @return the first and last name of the employee as string
     */
    public String toString()
    {
        return fName + ""+ lName;
    }
    
        
    public abstract PayCheque getPayCheque();
    
        
    
    
     
     
}
