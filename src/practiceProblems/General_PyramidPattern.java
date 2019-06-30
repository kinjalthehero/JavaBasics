package practiceProblems;

//Simple Java Program to draw a pyramid pattern. We have used both System.out.println() and System.out.print() methods to draw stars(*) * in pyramid shape. 
// Read more: http://www.java67.com/2015/10/how-to-print-pyramid-pattern-in-java-example.html#ixzz5pNAApItt

public class General_PyramidPattern {
	    
    public static void drawPyramidPattern() { 
        
    	// every row
    	for (int i = 0; i < 5; i++) {

    		// Leave spaces
            for (int j = 0; j < 5 - i; j++)  
                System.out.print(" "); 
            
            for (int k = 0; k <= i; k++) 
                System.out.print("* "); // because we need space after every star 
            
            System.out.println(); 
        } 
    } 

    public static void drawPyramidOfNumbers() { 
        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 5 - i; j++)  
                System.out.print(" "); 
            
            for (int k = 0; k <= i; k++)  
                System.out.print(k + " "); 
             
            System.out.println(); 
        } 
    } 
    
    public static void main(String args[]) { 
        
        System.out.println("Pyramid pattern of star in Java : "); 
        drawPyramidPattern(); 
        
        System.out.println("Pyramid of numbers in Java : "); 
        drawPyramidOfNumbers(); 
    } 
}
