package com.dodi.cinema;

public class Ticket {
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + seat;
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Ticket other = (Ticket) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (seat != other.seat)
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
private String name;
private String time;
private int seat;
public Ticket() {
	super();
	// TODO Auto-generated constructor stub
}
public Ticket(String name, String time, int seat) {
	super();
	this.name = name;
	this.time = time;
	this.seat = seat;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public int getSeat() {
	return seat;
}
public void setSeat(int seat) {
	this.seat = seat;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	int row = seat/10+1;
	int column = seat%10;
	String str = ""+row+"-"+""+column;
	return time+" "+name+" "+str+"×ù";
}

}
