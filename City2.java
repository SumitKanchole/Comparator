import java.util.*;
class TravelAgency implements Comparator <String>{
    public int compare(String s1,String s2){
        return -s1.compareTo(s2);
    }
}
class City2 {
public static void main(String args[]){
    TreeSet <String> t = new TreeSet <String> (new TravelAgency());
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter No. of cities >>> ");
    int num = Integer.parseInt(sc.nextLine());

    for(int i=0; i<num; i++){
        System.out.print("Enter City name "+(i+1)+" >>> ");
        t.add(sc.nextLine());
    }
    System.out.println(t);
}
}