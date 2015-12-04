package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<T> implements Stack<T> {

	private final static int STACK_SIZE = 10;
	
	private T[] stack;
	
	private int numberOfElements;
	
	public ArrayStack() {
		this.stack = (T[]) new Object[STACK_SIZE];
		this.numberOfElements = 0;
	}

	@Override
	public void push(T element) {
		this.stack[this.numberOfElements] = element;
		this.numberOfElements++;
	}

	@Override
	public T pop() {
		T element = this.stack[this.numberOfElements - 1];
		this.stack[this.numberOfElements - 1] = null;
		this.numberOfElements--;
		return element;
	}

	@Override
	public T peek() {
		return this.stack[this.numberOfElements - 1];
	}

	@Override
	public int size() {
		return this.numberOfElements;
	}

}
