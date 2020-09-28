package application;

import entities.CircularLinkedList;

public class Program {
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
		list.addFim("TV", 500.00);
		list.addFim("Carro", 30000.00);
		list.addFim("Casa", 200000.00);
		
		
		list.buscaNo("Casa");
		
		list.printList();
		
	}
}
