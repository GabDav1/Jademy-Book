package week3OOP3;

import java.util.Scanner;

public class BookDriver {

	public static void main(String[] args) {

		Page[] cotor = new Page[10];
		
		Page one = new Page(1,"aho aho copii si frati");
		
		cotor[0] = one;
		
		for (int i = 2; i < cotor.length; i++) {
			cotor[i] = new Page(i, "pagina cotor "+i);
		}
		
		Cover ish = new Cover("Ali Baba",2100,false);
		
		Book carta = new Book(ish,ish,cotor);
				
		carta.addContentToPage(3);
	
		carta.addContentToPage(8);
		
		System.out.println(carta);
	}

}
