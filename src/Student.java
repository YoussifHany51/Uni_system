public class Student implements Observer{

	private String name;
    private GpaCalculator gpa;
    
	
	public String getStudent() {
		return name;
	}
	public void setStudent(String name) {
		this.name=name;
	}
	
	public double getGPA() {
		return gpa.getTotalGpa();
	}
	
	
	
	public void signStudent() {
		System.out.println(name+" is signed");
	}
	

	public void checkCourses(double num) {
		if(num<2)
		     System.out.println(" Can register 4 courses at maximum");
		else if(num>=2&&num<=3)
			 System.out.println(" Can register 6 courses at maximum");
		else if(num>3)
			 System.out.println(" Can register 7 courses at maximum");
		else
			 System.out.println(" Invalid input");	
	}
	
	@Override
	public void update(String message) {
		System.out.println( name + " has new notification : " + message);
		
	}
}
