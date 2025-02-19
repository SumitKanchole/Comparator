import java.util.*;
class Mysort implements Comparator <String> {
	
	public int compare(String s1,String s2){
	   return -s1.compareTo(s2);
	}
}

class Demo2 {
public static void main(String args[]) {
// if we use only default constructor than data will be sorted in natural[ascending order]
//  Set <String> s = new TreeSet <String>();

// if we call para constructor than data will be sorted in customize sorting [ascending/Descending order]
Set <String> s = new TreeSet <String>(new Mysort());
s.add("rashmika");
s.add("deepika");
s.add("katappa");
s.add("abc");
System.out.println(s);
}

}
