package sam;

public class Sing {
	static Sing e=new Sing();
	private Sing(){
	}
	public static Sing empID() {
		//System.out.println("emp id is 123456");
		return e;
	}
	public void empName() {
		System.out.println("Emp name is hello");
	}
	public static void main(String[] args) {
		Sing e1=new Sing();
		
				
	}
	}


