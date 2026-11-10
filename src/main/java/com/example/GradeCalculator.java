package com.example;

public class GradeCalculator {

	
	
	
		// TODO Auto-generated method stub
        public static int total(int m1,int m2,int m3)
        {
        	return m1+m2+m3;
        }
        
        public static double average(int m1,int m2,int m3)
        {
        	return total(m1,m2,m3)/3;
        }
        
        public static boolean ispass(double average)
        {
        	return average>35;
        }
        
        public static void main(String[] args) {
        	int m1=75,m2=68,m3=82;
        	int total=total(m1,m2,m3);
        	double avg=average(m1,m2,m3);
        	System.out.println("total="+total+"\naverage="+avg+"\nresult="+(ispass(avg)?"pass":"fail"));
        	
    		
    	}
        
        
	

}
