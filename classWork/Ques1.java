import java.util.* ;
/* Write in Java to create a Student class params rollNo , name , totalMarks , city  
and find the student with highest marks and lives in city merrut */

// NAME : ARYAN PANWAR
// CLASS : 4A
// ROLL NO. : 54

public class Ques1 {
  public static class Student {
    int rollNo ; 
    String name ; 
    int totalMarks ; 
    String city ;

    public Student(int rollNo , String name , int totalMarks , String city){
      setName(name) ;
      setCity(city) ; 
      setTotalMarks(totalMarks) ;
      setRollNo(rollNo) ;
    }

    void setName(String name){
      this.name = name; 
    }
    void setCity(String city){
      this.city = city ;
    }
    void setRollNo(int rollNo){
      this.rollNo = rollNo ;
    }
    void setTotalMarks(int totalMarks){
      this.totalMarks = totalMarks ;
    }

    public void display(){
      System.out.print("name : "+this.name+" \ntotalMarks : "+this.totalMarks + "\n rollNo : " + this.rollNo) ;
    }
  }
  public static void main (String [] args){
    ArrayList <Student> students = new ArrayList<Student>() ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of students");
    int n = sc.nextInt();
    for (int i = 0 ; i < n ; i++){
      System.out.println("Enter the roll no of the student");
      int rollNo = sc.nextInt();
      System.out.println("Enter the name of the student");
      String name = sc.next();
      System.out.println("Enter the total marks of the student");
      int totalMarks = sc.nextInt();
      System.out.println("Enter the city of the student");
      String city = sc.next();
      Student s = new Student(rollNo , name , totalMarks , city);
      students.add(s);
    }
    System.out.println("Enter the city of the student to be searched") ; 
    String city = sc.next() ; 

    Student selectedStudent = new Student(0 , "Nan" , 0 , city);
    for (Student st : students){
      if (st.city.equals(city)){
        if (st.totalMarks > selectedStudent.totalMarks){
          selectedStudent = st ;
        }
      }
    }

    selectedStudent.display() ;
  }
}