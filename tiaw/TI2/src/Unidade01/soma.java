import java.util.Scanner;
public class Soma{
public static void main(String args[]){
int soma;
Scanner sc=new Scanner(System.in);
System.out.print("Digite um número: ");
int num_1=sc.nextInt();  
System.out.print("Digite o próximo número: ");
int num_2=sc.nextInt();  
sc.close();
soma=num_1+num_2;  
System.out.print("A soma é: "+soma);
}
}