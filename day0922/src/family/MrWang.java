package family;

public class MrWang extends Dressmom{
private String bighead;
private String shortleg;
public MrWang() {
	super();
	// TODO Auto-generated constructor stub
}
public MrWang(String bighead, String shortleg) {
	super();
	this.bighead = bighead;
	this.shortleg = shortleg;
}
public String getBighead() {
	return bighead;
}
public void setBighead(String bighead) {
	this.bighead = bighead;
}
public String getShortleg() {
	return shortleg;
}
public void setShortleg(String shortleg) {
	this.shortleg = shortleg;
}

public void Methon(){
	System.out.println("老王开车去东北");
}

}
