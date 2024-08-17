import java.io.File ; 

public class FileDelete{
  public static void main(String[] args) {
    File myObj = new File("filename.txt") ; 
    if (myObj.delete()){
      System.out.println("File deleted successfully " + myObj.getName()) ;
    } else {
      System.out.println("Failed to delete the file");
    }
  }
}