package ge.edu.btu;

import java.io.File;
import java.util.Objects;

public class FileCounter {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\t.kobakhidze\\Downloads\\TamarKobakhidzee\\TamarKobakhidze\\BTU_DIRECTORY");
        File[]files=file.listFiles();
        int  count=0;
//        ამოწმებს რომ ფაილების ლისტი არ იყოს null და არ გავიდეს შეცდომაზე.
        for (int i = 0; i < Objects.requireNonNull(files).length; i++) {
            if (files[i].getName().toLowerCase().startsWith("btu")){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
