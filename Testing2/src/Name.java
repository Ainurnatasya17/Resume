import java.util.*;

public class Name {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		printName();
		printAge();
		printGender();
		printMarital();
		printCitizenship();
		printAddress();
		printHP();
		printCGPA();
		printGrade();
		printGpa();
		printWork();
		printLanguage1();
		printLanguage2();
		printSkills1();
		printSkills2();
		printSkills3();
		printAwards();
		
			
	}
	    public static void printName() {
        Scanner in = new Scanner (System.in);
		
		System.out.print("Enter Your Name:");
		String name = in.next();
		System.out.println("name " + name);
	}
	
	    public static void printAge() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter Your Age: ");
		int age= in.nextInt();
		System.out.println("Age " + age);
     }
	   
	    public static void printGender() {
	    Scanner in = new Scanner (System.in);	
	    
	    System.out.print("Enter Your Gender: ");
	    String gender = in.next();
	    System.out.println("Enter Your Gender: " + gender);
	 }
	    
	    public static void printMarital() {
	    Scanner in = new Scanner (System.in);	
		    
        System.out.print("Enter Your Marital Status: ");
        String Marital = in.next();
	    System.out.println("Enter Your Marital Status " + Marital);
	 }
	    
	    public static void printCitizenship() {
		Scanner in = new Scanner (System.in);	
		    
		System.out.print("Enter Your Citizen: ");
		String Citizen = in.next();
	    System.out.println("Enter Your Citizen " + Citizen);
	 }
	    
	    public static void printAddress() {
	    Scanner in = new Scanner (System.in);
		    
        System.out.print("Enter Your Address: ");
	    String Home = in.next();
	    System.out.println("Enter Your Address " + Home);
	 }
	    
	    public static void printHP() {
	    Scanner in = new Scanner (System.in);	
		    
	    System.out.print("Enter Your Phone: ");
	    String HP = in.next();
	    System.out.println("Enter Your Phone: " + HP );
	 }
	   
	    public static void printCGPA() {
	    Scanner in = new Scanner (System.in);
	    
	    System.out.println ("Enter Your CGPA:");
		double cgpa= in.nextDouble();
		System.out.println("CGPA " + cgpa);
     }
	   
	    public static void printGrade() {
	    Scanner in = new Scanner (System.in);	
	    
	    System.out.println("Enter Grade STIA1113: ");
		String str = in.next();
		char grade = str.charAt(0);
		System.out.println("Grade " + grade);
     }
	    
	    public static void printGpa() {
	    Scanner in = new Scanner (System.in);	
	    
	    System.out.print("Enter GPA Semester 1: ");
		double num1 = in.nextDouble();
		System.out.print("Enter GPA Semester 2: ");
		double num2 = in.nextDouble();
		
		double sum = num1+num2;
		double totalgpa = sum/2;
		System.out.println("CGPA for current semester is " + totalgpa);
     }
	    
	    public static void printWork() {
	  	Scanner in = new Scanner (System.in);		
	  	
	  	System.out.print("Enter Your Work Experience : ");
	  	String Work = in.next();
	    System.out.println("Enter Your Work Experience " + Work);
     }
	     
	    public static void printLanguage1() {
	   	Scanner in = new Scanner (System.in);	
	    	
	   	System.out.print("Enter Your Language1: ");
	   	String Language1 = in.next();
	   	System.out.println("Enter Your Language: " + Language1);
	 }
	     
	    public static void printLanguage2() {
	   	Scanner in = new Scanner (System.in);	
	   	
	   	System.out.print("Enter Your Language2: ");
	   	String Language2 = in.next();
	   	System.out.println("Enter Your Language2: " + Language2);
     }
	   
	    public static void printSkills1() {
	   	Scanner in = new Scanner (System.in);	
	   	
	   	System.out.print("Enter Your Skills1: ");
	   	String Skills1 = in.next();
	   	System.out.println("Enter Your Skills1: " + Skills1);
     }
	    
	    public static void printSkills2() {
	   	Scanner in = new Scanner (System.in);	
	   	
	   	System.out.print("Enter Your Skills2: ");
	   	String Skills2 = in.next();
	   	System.out.println("Enter Your Skills2 " + Skills2);
	 }
	   	
	    public static void printSkills3() {
	    Scanner in = new Scanner (System.in);
	    
	    System.out.print("Enter Your Skills3: ");
	    String Skills3 = in.next();
	   	System.out.println("Enter Your Skills " + Skills3);
     }
	    
	    public static void printAwards() {
	    Scanner in = new Scanner (System.in);	
	    
	    System.out.print("Enter Your Awards and Certificates: ");
	    String Awards = in.next();
	    System.out.println("Enter Your Award and Certificate: " + Awards);
	 }
	    
}
	    

	    
	    

	    
	    
	    
	    
	    
	    
	    
		
		
		
	
		
		

		
		
		
		
		
	
	
		
		
		
	
	
	
	
	
	
	
		
		
	
		
		
		
		
		
		
		
		



