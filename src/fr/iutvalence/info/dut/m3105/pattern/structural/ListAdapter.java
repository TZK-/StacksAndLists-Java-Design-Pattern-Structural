package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ListAdapter<T> implements Stack<T> {

	private List<T> list;
	
	public ListAdapter(List<T> list) {
		this.list = list ;
	}

	@Override
	public void push(T element) {
		this.list.add(this.size(), element);
	}

	@Override
	public T pop() {
		return this.list.remove(this.size() - 1);
	}

	@Override
	public T peek() {
		return this.list.get(this.size() - 1);
	}

	@Override
	public int size() {
		return this.list.size();
	}

}
