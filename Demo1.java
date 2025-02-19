import java.util.*;
class Mysort implements Comparator <Integer>{

	public int compare(Integer i1, Integer i2){
	   /*
	   @first way to write this format
	   
	   //Descending order of number
	    if(i1<i2){
	      return +1;
	    }
	    else if(i1>i2){
	      return -1;
	    }
	   else {
	      return 0;
	    }
	    
	    
	    //Ascending order of number
	    if(i1<i2){
	      return -1;
	    }
	    else if(i1>i2){
	      return +1;
	    }
	   else {
	      return 0;
	    }
	    */
	
	
	//  @Second way ========
	
	//return -i1.compareTo(i2);		//Descending order
	return +i1.compareTo(i2);		//Ascending order
	
	}
}
class Demo1 {
public static void main(String []args){
Set <Integer> s = new TreeSet <Integer> (new Mysort());
s.add(10);
s.add(14);
s.add(16);
s.add(7);

System.out.println(s);
}

}
