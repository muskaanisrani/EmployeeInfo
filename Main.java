import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Calendar;
public class Main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		Employee test[]=new Employee[9];
		Staff staff1=new Staff();
		staff1.setfirstname("Paita");
		staff1.setlastname("Allen");
		staff1.setIDnumber("123");
		staff1.setsex('M');
		Calendar calendar = Calendar.getInstance();
		calendar.set(1959, 2, 23);
		staff1.setdateofbirth(calendar);
		staff1.setHourlyrate(50);
		test[0] = staff1;
		
		Staff staff2 = new Staff();
		staff2.setfirstname("Steven");
		staff2.setlastname("Zapata");
		staff2.setIDnumber("456");
		staff2.setsex('F');
		calendar = Calendar.getInstance();
		calendar.set(1964, 7, 12);
		staff2.setdateofbirth(calendar);
		staff2.setHourlyrate(35);
		test[1] = staff2;
		
		Staff staff3 = new Staff();
		staff3.setfirstname("Enrique");
		staff3.setlastname("Rios");
		staff3.setIDnumber("789");
		staff3.setsex('M');
		calendar = Calendar.getInstance();
		calendar.set(1970, 6, 2);
		staff3.setdateofbirth(calendar);
		staff3.setHourlyrate(40);
		test[2] = staff3;
		
		Faculty faculty1 = new Faculty();
		faculty1.setfirstname("Anne");
		faculty1.setlastname("Johnson");
		faculty1.setIDnumber("243");
		faculty1.setsex('F');
		calendar = Calendar.getInstance();
		calendar.set(1962, 4, 27);
		faculty1.setdateofbirth(calendar);
		faculty1.setLevel("FU");		
		Education education = new Education();
		education.setDegree("PhD");
		education.setMajor("Engineering");
		education.setResearch(3);
		faculty1.setEducation(education);
		test[3] = faculty1;
		
		Faculty faculty2 = new Faculty();
		faculty2.setfirstname("William");
		faculty2.setlastname("Bouris");
		faculty2.setIDnumber("791");
		faculty2.setsex('F');
		calendar = Calendar.getInstance();
		calendar.set(1975, 3, 14);
		faculty2.setdateofbirth(calendar);
		faculty2.setLevel("AO");
		Education education2 = new Education();
		education2.setDegree("PhD");
		education2.setMajor("English");
		education2.setResearch(1);
		faculty2.setEducation(education2);
		test[4] = faculty2;
		
		Faculty faculty3 = new Faculty();
		faculty3.setfirstname("Christopher");
		faculty3.setlastname("Andrade");
		faculty3.setIDnumber("623");
		faculty3.setsex('F');
		calendar = Calendar.getInstance();
		calendar.set(1980, 5, 22);
		faculty3.setdateofbirth(calendar);
		faculty3.setLevel("AS");
		Education education3 = new Education();
		education3.setDegree("MS");
		education3.setMajor("Physical Education");
		education3.setResearch(0);
		faculty3.setEducation(education3);
		test[5] = faculty3;
		
		Parttime partime1 = new Parttime();
		partime1.setfirstname("Augusto");
		partime1.setlastname("Guzman");
		partime1.setIDnumber("455");
		partime1.setsex('F');
		calendar = Calendar.getInstance();
		calendar.set(1977, 8, 10);
		partime1.setdateofbirth(calendar);
		partime1.setHourlyrate(35);
		partime1.sethoursperweek(30);
		test[6] = partime1;	
		
		Parttime partime2 = new Parttime();
		partime2.setfirstname("Martin");
		partime2.setlastname("Depirro");
		partime2.setIDnumber("678");
		partime2.setsex('F');
		calendar = Calendar.getInstance();
		calendar.set(1987, 9, 15);
		partime2.setdateofbirth(calendar);
		partime2.setHourlyrate(30);
		partime2.sethoursperweek(15);
		test[7] = partime2;
		
		Parttime partime3 = new Parttime();
		partime3.setfirstname("Marque");
		partime3.setlastname("Aldaco");
		partime3.setIDnumber("945");
		partime3.setsex('M');
		calendar = Calendar.getInstance();
		calendar.set(1988, 11, 24);
		partime3.setdateofbirth(calendar);
		partime3.setHourlyrate(20);
		partime3.sethoursperweek(35);
		test[8] = partime3;
		
		int totalsalary=0;
		for (int i=0;i<test.length;i++) {
			if (test[i] instanceof Parttime) {
				totalsalary+=test[i].monthlyearning();
			}
		}
		int totalsalary2=0;
		for (int i=0;i<test.length;i++) {
				totalsalary2+=test[i].monthlyearning();			
		}
		
		for (int i=0;i<test.length;i++) {
			System.out.println(test[i]);
						
		}
		
		
		System.out.println("Total monthly salary for all part-time staff "+totalsalary);
		System.out.println("total monthly salary for all employees "+totalsalary2);
				
		Arrays.sort(test, new SortbyID());
		System.out.print("sorted by ID");
		for (int i=0;i<test.length;i++) {
			System.out.println(test[i]);
						
		}
		
		Arrays.sort(test);
		System.out.println();
		System.out.print("\n Sorted by last name");
		for (int i=0;i<test.length;i++) {
			System.out.println(test[i]);		
	}
				
		try {
			Faculty newclone= (Faculty)faculty3.clone();
			System.out.println("Clone");
			System.out.print(newclone);
			if (newclone.equals(faculty3)) {
				System.out.println("both the objects are the same");
			} else {
				System.out.println("they are not same");
			}
			//newclone.setlastname("new lastname for cloned object");
			//System.out.println(newclone.getlastname());
			Education test2  = new Education();
			test2.setDegree("BS");
			test2.setMajor("comp sci");
			test2.setResearch(5);
			newclone.setEducation(test2);
			System.out.println(newclone.getEducation());
			System.out.println(faculty3.getEducation());
		} catch (CloneNotSupportedException e) {

		}
		

		
		
		
		
	}
}
