import java.util.*;

class City {
public static void main(String args[]){
    TreeSet <String> t = new TreeSet <String> ();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter No. of cities >>> ");
    int num = Integer.parseInt(sc.nextLine());

    for(int i=0; i<num; i++){
        System.out.print("Enter City no."+(i+1)+" >>> ");
        t.add(sc.nextLine());
    }
    System.out.println(t);
}
}