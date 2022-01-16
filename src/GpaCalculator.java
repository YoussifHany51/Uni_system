import java.util.ArrayList;
import java.util.List;

public class GpaCalculator {

	private double gradeGPA;

	private double totalGPA;
	
	private double temp;
	
	private List<Double> grades= new ArrayList<Double>();
	


	public void getTGPA(int n) {
	
		totalGPA=temp/n;
		
	}
	
	public double getTotalGpa() {
		return totalGPA;
	}
	
	public int getSpecificElement() {
		int res;
		if(grades.contains(0.0))
			res=0;
		else 
			res=1;
		return res;
	}



	public void calculate(String grade) {
        
		switch (grade) {
		case "A":
			gradeGPA = 4.00;
			grades.add(gradeGPA);
		//	System.out.println(gradeGPA);
			break;
		case "A-":
			gradeGPA = 3.67;
			grades.add(gradeGPA);
		
			break;
		case "B+":
			gradeGPA = 3.33;
			grades.add(gradeGPA);
			
			break;
		case "B":
			gradeGPA = 3.00;
			grades.add(gradeGPA);
			//System.out.println(gradeGPA);
			break;
		case "B-":
			gradeGPA = 2.67;
			grades.add(gradeGPA);
		
			break;
		case "C+":
			gradeGPA = 2.33;
			grades.add(gradeGPA);
		
			break;
		case "C":
			gradeGPA = 2.00;
			grades.add(gradeGPA);
		
			break;
		case "D+":
			gradeGPA = 1.33;
			grades.add(gradeGPA);
			
			break;
		case "D":
			gradeGPA = 1.00;
			grades.add(gradeGPA);
			
			break;
		case "F":
			gradeGPA = 0;
			grades.add(gradeGPA);
			
			break;


		}
     
	}

	void sumOfList() {
		
		for(int i=0;i<grades.size();i++) {
	
			temp+=grades.get(i);
		
		}
	}
}


