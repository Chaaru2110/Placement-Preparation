import java.util.Scanner;
import java.net.InetAddress;
class IPValidator{
public static Boolean isValidIP(String ip){
try{
InetAddress inet=InetAddress.getByName(ip);
return
inet.getHostAddress().equals(ip);
}
catch(Exception e){
return false;
}
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter an IP address:");
String ip=sc.nextLine();
if (isValidIP(ip)){
System.out.println("valid IP Address");}
else{
System.out.println("Invalid IP Address");
}
sc.close();
}}
