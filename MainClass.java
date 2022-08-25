import java.util.Scanner;
public class MainClass{ 
public static void main(String args[]){
 Scanner _key = new Scanner(System.in);
double  expoente;
double  resultado;
double  num;
double  i;
String  t1;
i = 2;
num= _key.nextDouble();
expoente= _key.nextDouble();
resultado = num;
if (expoente==1) {
	resultado = num;
}
if (expoente==0) {
	resultado = 1;	i = i+1;
}
while (i<=expoente) {

 resultado = resultado*num;
 i = i+1;
}

System.out.println(resultado);
}
}
