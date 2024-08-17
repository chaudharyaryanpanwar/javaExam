import java.io.File;
import java.io.FileWriter;
import java.io.IOException; 
public class FilesWrite {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("filename.txt") ;
      myWriter.write("file in java might be tricky , but it is fun") ;
      myWriter.close();
      System.out.println("Successfully write to file");
    } catch (IOException e){
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}