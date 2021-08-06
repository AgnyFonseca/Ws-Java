package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		//EXEMPLO 1
		/*Comparator<Product> comp = new Comparator<Product>() {
			//CLASSE ANONIMA
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
			}
		};
		list.sort(comp); */
		
		//EXEMPLO 2 - LAMBDA - FUN��O ANONIMA - ARROW FUNCTION
		//NESSE EXEMPLO PODE TAMB�M DISPENSAR AS CHAVES E O RETURN, E DEIXAR TUDO EM UMA LINHA
		/*Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		list.sort(comp); */
		
		//EXEMPLO 3 - LAMBDA SEM DECLARAR O COMPARATOR 
		//FUN��O ANONIMA DE PRIMEIRA CLASSE
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}
	}
}
