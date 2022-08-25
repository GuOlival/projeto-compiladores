import java.util.Scanner;
public class MainClass{ 
public static void main(String args[]){
 Scanner _key = new Scanner(System.in);
String  pesoinput;
String  normal;
String  magreza;
String  obesidadegrave;
double  peso;
double  altura;
String  sobrepeso;
double  altura2;
String  alturainput;
double  imc;
String  obesidade;
alturainput = "Entre com a altura";
pesoinput = "Entre com o peso";
magreza = "Magreza";
sobrepeso = "Sobrepeso";
obesidade = "Obesidade";
obesidadegrave = "Obesidade Grave";
normal = "Normal";
System.out.println(pesoinput);
peso= _key.nextDouble();
System.out.println(alturainput);
altura= _key.nextDouble();
altura2 = altura*altura;
imc = peso/altura2;
if (imc<18.5) {
	System.out.println(magreza);
}
if (imc>=18.5&&imc<=24.9) {
	System.out.println(normal);
}
if (imc>24.9&&imc<=29.9) {
	System.out.println(sobrepeso);
}
if (imc>29.9&&imc<=39.9) {
	System.out.println(obesidade);
}
if (imc>39.9) {
	System.out.println(obesidadegrave);
}
System.out.println(imc);
}
}
