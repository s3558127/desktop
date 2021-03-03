import java.util.*;
public class helloworld {
public static void main(String[] args) {
System.out.println("Hello World!");
Scanner sc = new Scanner(System.in);
System.out.println("What's the weather?");
String weather = sc.nextLine();
System.out.println("Oh! Nice " + weather + " day!");
}
}