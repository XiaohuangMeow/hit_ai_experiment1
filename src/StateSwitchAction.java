
public class StateSwitchAction {
    private State From;
    private State To;
    private String action;
    
    
    
    
    public StateSwitchAction(State from, State to, String action) {
	super();
	this.From = from;
	this.To = to;
	this.action = action;
    }
    
    public State getFromState() {
	return From;
    }

    public State getToState() {
   	return To;
    }

    @Override
    public String toString() {
	return "StateSwitchAction [from=" + From + ", to=" + To + ", action=" + action + "]";
    }

   
    
    
}
