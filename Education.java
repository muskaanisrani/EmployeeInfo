
public class Education {
	private String degree;
	private String major;
	private int research;
	
	public Education() {
		degree="";
		major="";
		research=0;
	}
	public Education(String d,String m,int r) {
		degree=d;
		major=m;
		research=r;
	}
	public String getDegree() {
		return degree;
	}
	public String getMajor() {
		return major;
	}
	public int getResearch() {
		return research;
	}
	
	public void setDegree(String d) {
		degree=d;
	}
	public void setMajor(String m) {
		major=m;
	}
	public void setResearch(int r) {
		research=r;
	}
	public String toString() {
		return "Degree: "+getDegree()+"\n"+"Major: "+getMajor()+"\n"+"research: "+getResearch();
	
}
	public boolean equals(Object ob) {
		Education m=(Education)ob;
		if (m.getDegree().equals(this.getDegree()) && m.getMajor().equals(this.getMajor()) && m.getResearch()==this.getResearch()) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
}
