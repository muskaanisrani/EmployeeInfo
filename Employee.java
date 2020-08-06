import java.util.Calendar;
public abstract class Employee implements Comparable<Employee> {
	private String lastname;
	private String firstname;
	private String IDnumber;
	private char sex;
	private Calendar dateofbirth;
	public Employee() {
		lastname="";
		firstname="";
		IDnumber="";
		sex='F';
		dateofbirth=Calendar.getInstance();
	}
	public Employee(String l,String f,String ID,char s, Calendar ob) {
		lastname=l;
		firstname=f;
		IDnumber=ID;
		sex=s;
		ob=dateofbirth;
	}
	public abstract double monthlyearning();
	
	public String getIDnumber() {
		return IDnumber;
	}
	public String getlastname() {
		return lastname;
	}
	public String getfirstname() {
		return firstname;
	}
	public char getsex() {
		return sex;
	}
	public Calendar getdateofbirth() {
		return dateofbirth;
	}
	public void setIDnumber(String ID) {
		IDnumber=ID;
	}
	public void setlastname(String last) {
		lastname=last;
	}
	public void setfirstname(String first) {
		firstname=first;
	}
	public void setsex(char s) {
		sex=s;
	}
	public void setdateofbirth(Calendar o) {
		dateofbirth=o;
	}
	public int compareTo(Employee a) {
		return a.lastname.compareTo(this.lastname);	
		
	}
	public boolean equals(Object ob) {
		Employee m =(Employee)ob;
		if (m.getlastname().equals(this.getlastname()) && m.getfirstname().equals(this.getfirstname()) 
				&& m.getsex()==this.getsex()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString () {
		Calendar ob=getdateofbirth();
		String date=ob.get(Calendar.DAY_OF_MONTH)+"/"+ob.get(Calendar.MONTH)+"/"+(ob.get(Calendar.YEAR)%100);
		return "\nLast name: "+getlastname()+"\nfirst name: "+getfirstname()+"\nID employee number: "+getIDnumber()+"\n"+"sex:"+getsex()+"\n"+"Birth date: "
				+date;
	}
}
