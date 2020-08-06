import java.util.Calendar;


public class Staff extends Employee{ 
	private int hourlyrate;
	
	public Staff() {
		super();
		hourlyrate=0;
	}
	public Staff(int h,String l,String f,String ID,char s, Calendar ob) {
		super(l,f,ID,s,ob);
		hourlyrate=h;
	}
	public int getHourlyrate(){
		return hourlyrate;
	}
	public void setHourlyrate(int h) {
		hourlyrate=h;
	}
	public double monthlyearning() {
		return hourlyrate*160;
	}

	public String toString() {
		//return super.toString() +" \nmonthly salary: "+monthlyearning();
		return super.toString() +" \nhourlyrate: $"+(double)hourlyrate;
	}
}
