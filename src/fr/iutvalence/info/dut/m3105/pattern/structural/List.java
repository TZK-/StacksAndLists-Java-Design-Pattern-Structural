package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface List<T> {

	public void add(int index, T element);
	
	public T remove(int index);
	
	public T get(int index);
	
	public int size();
	
}
