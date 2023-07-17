package atividade_6;

import java.util.ArrayList;

public class Pilha <T>{
	private T[] elementos;
	private int topo;
	
	
	public Pilha (int capacidade) {
		this.elementos = (T[])new Object[capacidade];
		this.topo = -1;
	}
	
	public void push(T elemento){
		if(!isFull()) {
			this.topo++;
			elementos[this.topo]=elemento;
			
		}else {
			throw new IllegalStateException("a pilha está cheia");
		}
	}
	
	public T pop() {
		if(!isEmpty()) {
			T elemento = this.elementos[topo];
			this.elementos[topo] = null;
			this.topo--;
			return elemento;
			
		}else {
			throw new IllegalStateException("a pilha está vazia");
		}
	}
	public T peek() {
		if(!isEmpty()) {
			T elemento = this.elementos[topo];
			return elemento;
		}else {
			throw new IllegalStateException("a pilha está vazia");
		}
	}
	
	public int size() {
		return this.topo+1;
	}
	
	
	public boolean isEmpty() {
		if(this.topo == -1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(elementos.length == this.topo) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Pilha<Integer> numeros = new Pilha<Integer>(10);
		//System.out.println(numeros.pop());
		numeros.push(10);
		numeros.push(5);
		System.out.println( numeros.pop());
		numeros.push(3);
		System.out.println( numeros.peek());
		
	}
	
}
