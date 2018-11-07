
public class State {
    protected char Money='A';
    protected char Box='C';
    protected boolean OnBox=false;
    protected boolean HB=false;
    
    public State(char money, char box, boolean onBox, boolean hB) {
	super();
	Money = money;
	Box = box;
	OnBox = onBox;
	HB = hB;
    }
    
    public State copy() {
	return new State(Money, Box, OnBox, HB);
    }
    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + Box;
	result = prime * result + (HB ? 1231 : 1237);
	result = prime * result + Money;
	result = prime * result + (OnBox ? 1231 : 1237);
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	State other = (State) obj;
	if (Box != other.Box)
	    return false;
	if (HB != other.HB)
	    return false;
	if (Money != other.Money)
	    return false;
	if (OnBox != other.OnBox)
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "State [Money=" + Money + ", Box=" + Box + ", OnBox=" + OnBox + ", HB=" + HB + "]";
    }
 
    
}