package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayList<T> implements List<T> {

	private T[] array;

	private int numberOfElements;

	public ArrayList() {
		this.array = (T[]) new Object[10];
		this.numberOfElements = 0;
	}

	private void shiftRight(int index) {
		for (int arrayIndex = index; arrayIndex < this.array.length; arrayIndex++) {
			this.array[arrayIndex + 1] = this.array[arrayIndex];
		}
		this.array[index] = null;
	}

	private void shiftLeft(int index) {
		for (int arrayIndex = index; arrayIndex < this.size() - 1; arrayIndex++) {
			this.array[arrayIndex] = this.array[arrayIndex + 1];
		}
		
		this.array[this.size()] = null;
	}
	
	@Override
	public void add(int index, T element) {
		if (this.get(index) != null)
			this.shiftRight(index);

		this.array[index] = element;
		this.numberOfElements++;
	}

	@Override
	public T remove(int index) {
		T element = this.get(index);
		this.array[index] = null;
		this.numberOfElements--;
		this.shiftLeft(index);
		return element;
	}

	@Override
	public T get(int index) {
		return this.array[index];
	}

	@Override
	public int size() {
		return this.numberOfElements;
	}

}
