import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Map;

public class Exercise2 {
 public static void main(String[] args) {
    ArrayList<String> arr=new ArrayList<>();
    Scanner obj=new Scanner(System.in);
    for(int i=0;i<10;i++){
        String temp=obj.nextLine();
        arr.add(temp);
    }
    HashSet<String> set=new HashSet<>();
    for(String it:arr){
        set.add(it);
    }
    Map<String,Integer> mp=new HashMap<>();
    for(String s:arr){ 
            int count=mp.getOrDefault(s,0);
            mp.put(s,count+1);
    }
    obj.close();
    System.out.println("List contains:" );
    for(String s:arr){
        System.out.println(s);
    }
    System.out.println("Set contains:" );
    for(String s:set){
        System.out.println(s);
    }
    System.out.println("Frequency of words:" );
    for(Map.Entry<String,Integer> temp:mp.entrySet()){
        System.out.println(temp.getKey()+":"+temp.getValue());
    }
 }   
}
