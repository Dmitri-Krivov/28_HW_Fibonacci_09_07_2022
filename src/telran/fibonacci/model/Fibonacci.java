package telran.fibonacci.model;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer> {
	private int quantity;

	public Fibonacci(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			private int summ;
			private int nextNum = 1;
			private int num = 0;
			private int curPos;

			@Override
			public boolean hasNext() {
				return curPos < quantity;
			}

			@Override
			public Integer next() {
				summ = nextNum + num;
				num = nextNum;
				nextNum = summ;
				curPos++;
				return num;
			}

		};
	}
}
