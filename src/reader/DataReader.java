package reader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 */


        String textFile = "//home//a//CoreNDSExamMarch2016//out//production//ExamMarch2016//data//self-driving-car";
		FileReader fr=null;
        BufferedReader br=null;

        try{

            fr=new FileReader(textFile);

        }
        catch(FileNotFoundException e){
            System.out.println("Hey !file is not found, verify the path ");
            e.printStackTrace();
        }
        //________________________________________________________

        br=new BufferedReader(fr);
        String text="";
        try{
            while((text=br.readLine())!=null){
                System.out.println(text);
            }
        }
        catch (IOException e){
            e.printStackTrace();

        }

        //-----------------------
        finally{

            try{
                if(fr!=null){
                    fr.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }
            try{
                if  (br!=null){
                    br.close();
                }

            }
            catch(IOException e){
                e.printStackTrace();
            }
        }//end of finnaly








	
	}

}
