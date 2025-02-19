import java.util.*;
class Student {
public static void main(String args[]) {
   TreeSet<Integer> t = new TreeSet <Integer>();
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter the Quantity of Student >>> ");
   int quantity = sc.nextInt();
   
   for(int i=0; i<quantity; i++) {
      System.out.print("Enter Roll number of "+(i+1)+" Student >>> ");
      t.add(sc.nextInt());
   }
   System.out.println(t);

}
}
