package jordan;

interface Extensible{
	
	
}

interface programmable{
	
	void load();
}

interface Scriptable extends Extensible, programmable{
	
	
}

public class test implements Scriptable {
	public void methodBaru() {
		
	}
	
	public void load(){
		System.out.println("load");
	}



public static void main(String[]args){
	System.out.println("test");
	}
}