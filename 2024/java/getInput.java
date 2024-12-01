import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class getInput {
    public static String[] fromFile(String filePath){
        String[] input = new String[1000];
        int i = 0;
        try{
            File myObj = new File(filePath);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNext()){
                input[i] =  myReader.nextLine();
                i++;
            }
            myReader.close();
        } 

        catch (FileNotFoundException e){
        System.out.println("An error occurred.");
        e.printStackTrace();
        }   
    return input;
    }
}
