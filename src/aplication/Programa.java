package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Bill;




public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		Bill bar = new Bill();
		
		System.out.print("Sexo : ");
		bar.gender =sc.next().charAt(0);
		System.out.print("Quantidade de cervejas : ");
		bar.beer=sc.nextInt();
		System.out.print("Quantidade de refrigerantes : ");
		bar.softDrink=sc.nextInt();
		System.out.print("Quantidades de espetinhos : ");
		bar.barbecue=sc.nextInt();
		
		
		
		
		
		bar.feeding();
		bar.cover();
		bar.ticket();
	    bar.total();
		
		
		
		System.out.println();
		System.out.printf("RELATORIO %n");
		System.out.printf("Consumo  = $ %.2f%n " , bar.feeding());
		if( bar.feeding() > 30 ) {
			System.out.println("Isento de Couvert");
		}
		else {
			System.out.printf("Couver  = $ %.2f%n " , bar.cover());
		}
		System.out.printf("Ingresso  = $ %.2f%n " , bar.ticket());
		
		System.out.println();
		System.out.printf("Valor a pagar = $ %.2f " , bar.total());
		
		
		
		
		
		sc.close();

	}

}
