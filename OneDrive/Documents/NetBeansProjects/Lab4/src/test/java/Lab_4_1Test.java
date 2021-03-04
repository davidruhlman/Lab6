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
public class Lab_4_1Test {
    
    public Lab_4_1Test() {
    }


    @Test
    public void testCostCalc() {
        System.out.println("costCalc");
        int Age = 20;
        int expResult = 400;
        int result = Lab_4_1.costCalc(Age);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCostCalcZero() {
        System.out.println("costCalc");
        int Age = 0;
        int expResult = 300;
        int result = Lab_4_1.costCalc(Age);
        assertEquals(expResult, result);
    }
    
}
