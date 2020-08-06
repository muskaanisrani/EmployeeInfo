import java.util.Calendar;

    enum Level {
	AS("ASSISTANTPROFESSOR"),AO("ASSOCIATEPROFESSOR"),FU("FUll");
	private String level;
	public String getLevel() {
		return this.level;
	}
	 Level(String a){
		level=a;
	}
}

public class Faculty extends Employee implements Cloneable{
	private Education edu;
	private Level lev;


	
	public Faculty(){
		super();
		edu=new Education();
		this.lev=Level.AS;
	}
	public Faculty(String l,String f,String ID,char s, Calendar ob,Education og,String temp){
		super(l,f,ID,s,ob);
		edu=og;
		lev=Level.valueOf(temp);
	}
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		//Object clone=super.clone();
		//return clone;
		}
	
	public double monthlyearning() {
		switch(lev) {
		case AS:
			return EmployeeInfo.FACULTY_MONTHLY_SALARY;
		
		
		case AO:
		return EmployeeInfo.FACULTY_MONTHLY_SALARY*1.5;
		
		
		case FU:
			return EmployeeInfo.FACULTY_MONTHLY_SALARY*2.0;
	}
		return 2.0;
	}
	public String toString() {
		return super.toString()+"\n"+"level: "+lev.toString()+"\n"+"Degree: "+edu.toString();
	
}
	public void setEducation(Education temp) {
		edu=temp;
	}
	public Education getEducation() {
		return edu;
	}
	public String getLevel() {
		return lev.toString();
	}
	public void setLevel(String temp) {
		lev=Level.valueOf(temp);
	}
	public boolean equals(Object ob) {
		Faculty m =(Faculty)ob;
		if (m.getEducation().equals(this.getEducation()) && m.getLevel().equals(this.getLevel()) &&super.equals(ob) ) {
			return true;
		} else {
			return false;
		}
	}
}
