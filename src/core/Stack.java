package core;

import java.util.ArrayList;

public class Stack implements IStack {
	private ArrayList<Integer> stack;

	public Stack() {
		stack = new ArrayList<>();
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public int getSize() {
		return stack.size();
	}

	@Override
	public void push(Integer item) {
		stack.add(item);
	}

	@Override
	public Integer pop() {
		if (isEmpty()) {
			return null; // or throw an exception
		}
		return stack.remove(stack.size() - 1);
	}

	@Override
	public Integer peek() {
		if (isEmpty()) {
			return null; // or throw an exception
		}
		return stack.get(stack.size() - 1);
	}
}