package com.example;
import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test; 
public class GradeCalculatorTest {

	
		// TODO Auto-generated method stub
		@Test
		void Gradetotal() {
			assertEquals(225, GradeCalculator.total(75, 68, 82)); 
		}
	    
		@Test
		void Average()
		{
			assertEquals(75.0,GradeCalculator.average(75,68,82));
		}
		
		@Test
		void ispass()
		{
			assertTrue(GradeCalculator.ispass(75.0));
		}
		
		@Test
		void isfail() {
			assertFalse(GradeCalculator.ispass(35.0));
		}
		

}
