package test;

public class ABC<T extends Number, E> {
	private T key;
	private E value;
	
	
	public ABC() {
	}
	
	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public ABC(T key, E value) {
		super();
		this.key = key;
		this.value = value;
	}

	public ABC printGen(){
		return this;
	}
	
	@SuppressWarnings("unused")
	private static class Test{
		public static void main(String[] args) {
			ABC<Integer, String> abc = new ABC<Integer, String>(5, "Cai noi gi the");
			System.out.println(abc.getKey());
			System.out.println(abc.getValue());
		}
	}
}
