

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main_class {

	public static void main(String[] args) {
		customers lizzo = new customers(1, "LizZo", 2);
		customers umberto = new customers(2, "Umberto", 2);
		customers emanuele = new customers(3, "Emanuele", 1);
		customers anonimo = new customers(4, "Chi sei?", 1);
		customers misterioso = new customers(5, "Uomo misterioso", 2);
		
		product book_1 = new product(1, "The Expanse 9", "Books", 120.00);
		product book_2 = new product(2, "The Expanse 7", "Books", 114.00);
		product book_3 = new product(3, "The Lord of the rings", "Books", 98.00);
		product book_4 = new product(4, "Su un altro pianeta", "Books", 178.00);
		product book_5 = new product(5, "Inseguendo un raggio di luce", "Books", 79.00);
		product book_6 = new product(6, "La teoria del tutto", "Books", 60.00);
		
		product monitor_1 = new product(7, "Samsung 4K UHD", "Monitors", 499.00);
		product ps5_1 = new product(8, "PS5", "Console", 539.00);
		
		product toy_1 = new product(9, "Barbie", "Baby", 8.39);
		product toy_2 = new product(10, "Action Man", "Baby", 8.99);
		product toy_3 = new product(11, "Bear Peluche", "Baby", 6.99);
		
		product boys_1 = new product(12, "Motorcycle Helmet", "Boys", 59.69);
		product boys_2 = new product(13, "Football ball", "Boys", 13.19);
		
		
		List<product> lizzoOrder = new ArrayList<product>();
		lizzoOrder.add(book_1); lizzoOrder.add(ps5_1); lizzoOrder.add(boys_2);

		List<product> umbertoOrder = new ArrayList<product>();
		umbertoOrder.add(monitor_1);

		List<product> emanueleOrder = new ArrayList<product>();
		emanueleOrder.add(monitor_1); emanueleOrder.add(boys_1);
		
		List<product> misteriosoOrder = new ArrayList<product>();
		misteriosoOrder.add(toy_2); misteriosoOrder.add(boys_2); misteriosoOrder.add(book_4);
		
		List<product> anonimoOrder = new ArrayList<product>();
		anonimoOrder.add(toy_3); anonimoOrder.add(book_2); anonimoOrder.add(book_5); anonimoOrder.add(book_6);
		
		List<product> list = new ArrayList<product>();
		list.add(book_1); list.add(book_2); list.add(book_3); 
		list.add(book_4); list.add(book_5); list.add(book_6); 
		list.add(monitor_1); list.add(ps5_1);
		list.add(toy_1); list.add(toy_2); list.add(toy_3);
		list.add(boys_1); list.add(boys_2);
		
		
		
		// Esercizio uno
		System.out.println("***** INIZIO EX 1 *****");
		Stream<product> st_1 = list.stream();
		st_1.filter(el -> el.getCategory().equals("Books") && el.getPrice() > 100 ).forEach(el -> System.out.println(el.toString()));
		
		System.out.println();
		
		// Esercizio due
		System.out.println("***** INIZIO EX 2 *****");
		list.stream().filter(el -> el.getCategory().equals("Baby")).forEach(el -> System.out.println(el.toString()));
		
		System.out.println();
		
		// Esercizio tre
		System.out.println("***** INIZIO EX 3 *****");
		Stream<product> st_2 = list.stream();
		st_2.filter(el -> el.getCategory().equals("Boys")).map(el ->  {
			double sconto = (el.getPrice() * 10) / 100;
			el.setPrice(el.getPrice() - sconto);
			return el;
		}).forEach(el -> System.out.println(el));
		
		System.out.println();
		
		//Esercizio quattro
		System.out.println("***** INIZIO EX 4 *****");
		order order_1 = new order(1, "Delivered", LocalDate.of(2021, 2, 6), LocalDate.of(2021, 2, 11), lizzoOrder, lizzo);
		order order_2 = new order(2, "Delivered", LocalDate.of(2021, 2, 14), LocalDate.of(2021, 2, 21), umbertoOrder, umberto);
		order order_3 = new order(3, "Delivered", LocalDate.of(2022, 4, 24), LocalDate.of(2022, 4, 28), emanueleOrder, emanuele);
		order order_4 = new order(4, "Delivered", LocalDate.of(2023, 5, 7), LocalDate.of(2023, 5, 10), misteriosoOrder, misterioso);
		
		List<order> listOrders = new ArrayList<order>();
		listOrders.add(order_1); listOrders.add(order_2); listOrders.add(order_3); listOrders.add(order_4);
		
		Stream<order> orders = listOrders.stream();
		orders.filter(el -> el.getCustomer().getTier() == 2 && el.getOrderDate().isAfter(LocalDate.of(2021, 2, 1)) 
			&& el.getOrderDate().isBefore(LocalDate.of(2021, 4, 1)))
				.forEach(el -> el.getProducts()
						.forEach(p -> System.out.println(p.toString())));
	}
}

	


