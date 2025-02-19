import java.util.*;
class student implements Comparable <student> {
    private int rollNum;
    private String name;
    private int marks;

    //Setter
    public void SetROllNumber(int rollNum){
        this.rollNum=rollNum;
    }
    
    public void SetName(String name){
        this.name=name;
    }
    
    public void SetMarks(int marks){
        this.marks=marks;
    }

    //getter
    public int getRollNumber(){
        return rollNum;

    }
    public String getName(){
        return name;

    }
    public int getMarks(){
        return marks;

    }

    //constructor
    public student(int rollNum,String name,int marks){
        this.rollNum=rollNum;
        this.name=name;
        this.marks=marks;
    }

    public String toString(){
        return "Student [Name : "+name+" , Roll Number : "+rollNum+" , Marks : "+marks+" ]\n";
    }

    public int compareTo(student s){
        if(this.getName()<s.getName()){
            return +1;
        }
        else if(this.getName()>s.getName()){
            return -1;
        }
        else{
            return 0;
        }
    }
    
    
}


class StudentData2 {
    public static void main(String args[]){
        TreeSet <student> S = new TreeSet <student> ();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter how many students you want to add >>> ");
        int size = Integer.parseInt(sc.nextLine());
        for(int i=0; i<size; i++){
            System.out.print("Student Name >>>");
            String name = sc.nextLine();
            
            System.out.print("Student Roll Number >>>");
            int rollNum = Integer.parseInt(sc.nextLine());
            
            System.out.print("Student Marks >>>");
            int marks = Integer.parseInt(sc.nextLine());
            
            student obj = new student(rollNum,name,marks);
            S.add(obj);
        }
        System.out.println(S);
    }
}