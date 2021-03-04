/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author David Ruhlman
 */
public class Lab_4_2Test {
    
    public Lab_4_2Test() {
    }

    @Test
    public void testTotalCostZero() {
        System.out.println("totalCost");
        int checkAmount = 0;
        double expResult = 10.0;
        double result = Lab_4_2.totalCost(checkAmount);
        assertEquals(expResult, result, 0.0);

    }
    
        @Test
    public void testTotalCostTen() {
        System.out.println("totalCost");
        int checkAmount = 10;
        double expResult = 11;
        double result = Lab_4_2.totalCost(checkAmount);
        assertEquals(expResult, result, 0.0);

    }
    
        @Test
    public void testTotalCostSixty() {
        System.out.println("totalCost");
        int checkAmount = 60;
        double expResult = 12.4;
        double result = Lab_4_2.totalCost(checkAmount);
        assertEquals(expResult, result, 0.0);

    }
    
    
}
