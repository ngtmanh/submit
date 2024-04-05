import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //doc tu file
        public static void main(String[] args) {
            try {
                File file = new File("example.txt");
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

   //viet vao file
   public static void main(String[] args) {
       try {
           File file = new File("output.txt");
           FileWriter fw = new FileWriter(file);
           BufferedWriter bw = new BufferedWriter(fw);
           bw.write("Hello, world!");
           bw.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
   // xoa file
   public static void main(String[] args) {
       File file = new File("example.txt");
       if (file.delete()) {
           System.out.println("File deleted successfully.");
       } else {
           System.out.println("Failed to delete the file.");
       }
   }
   //tao file
   public static void main(String[] args) {
       String folderPath = "C:\\ATUANANH\\New folder\\test";
       File folder = new File(folderPath);
       folder.mkdirs();

       File file = new File(folder, "newfolder.txt");
       try {
           if (file.createNewFile()) {
               System.out.println("File đã được tạo thành công.");
           } else {
               System.out.println("File đã tồn tại.");
           }
       } catch (IOException e) {
           System.out.println("Đã xảy ra lỗi khi tạo file.");
           e.printStackTrace();
       }
   }
}