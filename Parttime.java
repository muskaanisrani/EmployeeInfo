import java.util.Calendar;


public class Parttime extends Staff{
	private int hoursperweek;
	
	public Parttime() {
		super();
		hoursperweek=0;
	}
	public Parttime(int a,int h,String l,String f,String ID,char s, Calendar ob) {
		super(h,l,f,ID,s,ob);
		hoursperweek=a;
	}
	public int gethoursperweek() {
		return hoursperweek;
	}
	public void sethoursperweek(int a) {
		hoursperweek=a;
	}
	public double monthlyearning(){
		return (super.getHourlyrate()*gethoursperweek()*4);
	}
	public String toString(){
		return super.toString()+"\nhours worked per week: "+hoursperweek;
	}
	
}
