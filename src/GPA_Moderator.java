
public class GPA_Moderator {

	private String name;
	private GPA gp;
	
	public GPA_Moderator(String name) {
		this.name=name;
		
	}
	
	public void grade() {
		System.out.println(" "+name +" :"+ gp.description());
	}
	
	public GPA checkLevel(double num) {
		if(num<2)
		   gp=new LowGPA();
		else if(num>=2&&num<=3)
			gp= new MidGPA();
		else if(num>3)
			gp=new HighGPA();
//		else
//			System.out.println(" Invalid input");
		return gp;
	}
	
}
