import java.util.*;
class product implements Comparator <Double>{
	public int compare(Double d1,Double d2) {
		return -d1.compareTo(d2);
	}

}

class Ecommerce {
public static void main(String args[]) {
Scanner sc= new Scanner(System.in);
TreeSet <Double> d = new TreeSet <Double>(new product());

  System.out.println("Enter How many products you want to add here  >>> ");
   int choice = sc.nextInt();

for(int i=0;i<choice; i++){
  System.out.println("Enter "+(i+1)+" product price >>> ");
  d.add(sc.nextDouble());
  
}
System.out.println(d);
}

}
