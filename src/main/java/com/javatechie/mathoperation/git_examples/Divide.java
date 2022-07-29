public class Divide {

	private int value1;
	private int value2;

	public Divide(int value1, int value2) {
		this.value1 = value1;
		this.value2 = value2;

	}

	public int quotient() {
		return value2 % value1;
	}
}
