import java.util.Scanner;
public class MainClass{ 
public static void main(String args[]){
 Scanner _key = new Scanner(System.in);
double  a;
double  b;
String  t1;
t1 = "ab";
a= _key.nextDouble();
b= _key.nextDouble();
a = 1+2*3/b;
System.out.println(a);
if (a>b) {
	System.out.println(a);
}
else {
	System.out.println(b);
}

while (a>b) {

 a = a+b;
 t1 = "abcd";
}

System.out.println(a);
System.out.println(t1);
}
}
