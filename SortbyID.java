import java.util.*; 
import java.lang.*; 
import java.io.*;
public class SortbyID implements Comparator<Employee>{

	
	public int compare(Employee a,Employee b) 
    { 
        return a.getIDnumber().compareTo(b.getIDnumber()); 
    }
	
	
	
}
