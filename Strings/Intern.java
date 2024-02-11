public class Intern{  
public static void main(String args[]){  
String s1=new String("hiii");  
String s2="hiii";  
String s3=s1.intern();
System.out.println(s1==s2);  
System.out.println(s2==s3);
}
}