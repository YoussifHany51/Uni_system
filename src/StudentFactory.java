 
public class StudentFactory {
	
	//public static final int Regular=1;
	//public static final int Irregular=0;
	
	
	public static Student createStudent(int studentID) {
		switch (studentID) {
		case 1:
			return new RegularStudent();
		case 0:
			return new IrregularStudent();
			default:
				return null;
		}
	}

}
