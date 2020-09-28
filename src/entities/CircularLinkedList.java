package entities;

public class CircularLinkedList {

	private Node first;
	
	//método que adiciona elementos no fim da lista
	public void addFim(String element, double value) {
		Node newNode = new Node();
		newNode.setElement(element);
		newNode.setValue(value);
		
		if(first==null) {			
			first = newNode;
			first.setNext(first);

		}else {
			Node currentNode = first;
			
			while(currentNode.getNext() != first) {
				currentNode = currentNode.getNext();
			}
			
			currentNode.setNext(newNode);
			newNode.setNext(first);
		}
		
	}
	
	//método que remove nós no fim da lista
	public void removeFim() {
		Node currentNode = first;
		
		if(currentNode.getNext() == first) {
			first = null;
		}
		else {
			Node lastNode = currentNode;
			do {
				lastNode = lastNode.getNext();
			}
			while(lastNode.getNext() != first);
		
			do {
				currentNode = currentNode.getNext();
			}
			while(currentNode.getNext() != lastNode);
		
			currentNode.setNext(first);
			lastNode = null;
		}
		
	}
	
	
	//Método que busca nó pelo elemento e retorna seu nome e valor
	public void buscaNo(String element) {
		Node currentNode = first;
		
		while(element != currentNode.getElement()) {
			currentNode = currentNode.getNext();
		}
		System.out.println("Elemento buscado: "
							+currentNode.getElement()
							+" | Valor: R$ "+currentNode.getValue());
		
	}
		
	
	public void printList() {
		Node currentNode = first;
		
		
		if(currentNode == null) {
		System.out.println("A lista está vazia!!");
		
		}else {
		
		if(currentNode.getNext() == first) {
			System.out.print("["+currentNode.getElement()+"]->");
		}else {
		do{
		System.out.print("["+currentNode.getElement()+"]->");
		currentNode = currentNode.getNext();
		}while(currentNode.getNext() != first);
		System.out.print("["+currentNode.getElement()+"]->");
	}
	}
	}
	
}
