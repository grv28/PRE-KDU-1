import java.util.Scanner;
class App {
    public static void main(String [] args)  {
        Scanner ob1=new Scanner(System.in);
        String a=ob1.nextLine();
        Scanner ob2=new Scanner(System.in);
        String b=ob2.nextLine();
        System.out.println("The length of first string is:"+ a.length());
        
        System.out.println("The length of second string is:"+ b.length());
        
        System.out.println(a.length()==b.length() ?"The length of two strings is same:":"The length of two strings is not same");     
        System.out.println(a.equals(b) ?"The two strings are same:":"The two strings are not same");
    }
}