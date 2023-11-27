import java.util.Scanner;
class App {
    public static void main(String [] args)  {
        Scanner obj1=new Scanner(System.in);
        String a=obj1.nextLine();
        Scanner obj2=new Scanner(System.in);
        String b=obj2.nextLine();
        System.out.println("The length of first string is:"+ a.length());
        
        System.out.println("The length of second string is:"+ b.length());
        
        System.out.println(a.length()==b.length() ?"The length of two strings is same:":"The length of two strings is not same");     
        System.out.println(a.equals(b) ?"The two strings are same:":"The two strings are not same");
    }
}