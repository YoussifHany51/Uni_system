import java.util.Scanner;

public class Main {
	 
	
	Singelton getControl=null;
	
	public static void main(String[] args) {
		
	Scanner scan =new Scanner(System.in);
	//Single
		
    Singelton control=Singelton.getControl();
    control.info();
    
    //Single
    
    System.out.println();
    //
    GpaCalculator test=new GpaCalculator();
    
    System.out.println(" Enter student name");
    
    String name=scan.nextLine();
    
    System.out.println(" Enter the number of last semester courses ");
    
    

    int numberOfCourses=0;
    
    numberOfCourses =scan.nextInt();
    
    System.out.println(" Enter the grades of last semester courses ");
    
    for(int i=0;i<=numberOfCourses;i++) {
    	
    String grade=scan.nextLine().toUpperCase();
   
    test.calculate(grade);
    
    }
    test.sumOfList();
    test.getTGPA(numberOfCourses);
    System.out.println(" Total GPA "+test.getTotalGpa());
    
    System.out.println();
    
    
    //Factory
    
    Student student1=StudentFactory.createStudent(test.getSpecificElement());
    
    student1.signStudent();
    
    //Factory    
   
    System.out.println();
    
    
  
    student1.setStudent(name);
    

   //Strategy   
   
    
    student1.checkCourses(test.getTotalGpa());
    
    GPA_Moderator m1=new GPA_Moderator(student1.getStudent());
    
    m1.checkLevel(test.getTotalGpa());
    
    System.out.println();
    
    m1.grade();  
    
    
    //Strategy
    
    
    
    System.out.println();
    
    //Observer
    
    Course c = new Course("");
    
    c.chooseCourse(test.getTotalGpa(),student1);
    
    //Observer
 

    
  

   
  
    
    
	}

}
