import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course implements Subject{
	
	private String name;
	private String availability;
	
	
	
	private ArrayList<Course> courses=new ArrayList<Course>();
	
	private List<Observer> observerList;
	
	public Course(String name) {
		this.name=name;
		observerList=new ArrayList<>();
	}
	


	@Override
	public void subscribe(Observer observer) {
		observerList.add(observer);
		
	}

	@Override
	public void unsubscribe(Observer observer) {
		observerList.remove(observer);
		
	}

	@Override
	public void notifyAllSubscribers() {
	  for (Observer observer : observerList) {
		  observer.update(availability);
	  }
		
	}
	
	public void setAvailability(boolean available) {
		availability =this.name + (available ? " is Available" : " is't Available" );
		notifyAllSubscribers();
	}
	
	
	
	public void chooseCourse(double num,Student s) {
		
		Course designPattern=new Course("Design Pattern course");
	    Course database=new Course("Database course");
	    Course operatingSystem=new Course("Operating system course");
	    Course selectedTopics=new Course("Selected Topics course");
	    Course testing=new Course("Software Testing course");
	    Course projectManag=new Course("Project Management course");
	    Course projectReq=new Course("Project Requirements course");
	    
	    courses.add(designPattern);
	    courses.add(database);
	    courses.add(operatingSystem);
	    courses.add(selectedTopics);
	    courses.add(testing);
	    courses.add(projectManag);
	    courses.add(projectReq);
	    
	    System.out.println(" You have the ability to register these courses");
	    
	    System.out.println();
	    
	    if(num<2) {
	    	
	    	for(int i=0;i < 4;i++) {
	    	courses.get(i).subscribe(s);
	    	courses.get(i).setAvailability(true);
	    	}
	    }
	    else if(num>=2 && num<=3) {
	    	
	    	for(int i=0;i < 6;i++) {
	    	courses.get(i).subscribe(s);
	    	courses.get(i).setAvailability(true);
	    	}
	    }
	    else if(num>3) {
	    	for(int i=0;i < 7;i++) {
	    	courses.get(i).subscribe(s);
	    	courses.get(i).setAvailability(true);
	    	}
	    }
	    
	    
	}
	

}
