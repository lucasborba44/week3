
package week3;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Week3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Employee emp1 = new Employee ("Lucas", "Borba", 1234,LocalDate.of(1995, Month.SEPTEMBER,21));
      
        System.out.printf("The first employee is %s%n", emp1);
    }
    
}
