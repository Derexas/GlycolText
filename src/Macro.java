import java.util.ArrayList;

public class Macro {
	private ArrayList<Command> m;
	private boolean actif;
	public Macro(){
		actif = false;
		m = new ArrayList<Command>();
	}
	
	public void activate(){
		actif = true;
	}
	
	public void desactivate(){
		actif = false;
	}
	
	public void add(Command c){
		m.add(c);
	}
	
}
