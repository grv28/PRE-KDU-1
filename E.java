import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class E{
    public static void main(String[] args) {
          String reader="D:\\Kickdrum\\Book1.csv";
           Map<String,Integer> mp=new HashMap<>();
         try
         { 
            BufferedReader br=new BufferedReader(new FileReader(reader));
            String line;
            while((line=br.readLine()) != null)
            {   
                 String [] values=line.split(",");
                 
                 for(String value:values){
                   int count=mp.getOrDefault(value,0);
                   mp.put(value,count+1);
                 }
          }
          br.close();  
         }
         catch(IOException e){
            e.printStackTrace();
         }
         ArrayList<Map.Entry<String,Integer>> arr= new ArrayList<>(mp.entrySet());
         
         arr.sort(Map.Entry.<String,Integer>comparingByValue().reversed());
         int count=3;
         
         for(  Map.Entry<String,Integer> temp:arr){

            if(count >0){
                System.out.println(temp.getKey());
                count--;
            }
            else break;
         }
    }
}
