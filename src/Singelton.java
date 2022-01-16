
public class Singelton {
	
private static Singelton control;


private Singelton() {}

private static Object obj=new Object();

public static Singelton getControl() {
	synchronized(obj) {
	if(control==null) {
       control=new Singelton();
	}
		return control;
}
}


public void info() {
	System.out.println(" Welcome to the University system");
}

}
