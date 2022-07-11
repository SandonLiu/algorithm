package Leetcode;

import java.util.Stack;

public class No84 {
	public static void main(String[] args) {
		int[] height = { 2, 4 };

		int[] leftIndex = getLeftBoundIndex(height);
		int[] rightIndex = getRightBoundIndex(height);

		int area = calculateArea(height, leftIndex, rightIndex);

		System.out.println(area);
	}

	private static int calculateArea(int[] height, int[] leftIndex, int[] rightIndex) {
		int area = 0;
		for (int i = 0; i < height.length; i++) {
			int width = rightIndex[i] - leftIndex[i] - 1;
			int length = height[i];
			area = Math.max(area, width * length);
		}
		return area;
	}

	private static int[] getLeftBoundIndex(int[] height) {
		// 依次记录每个i处位置的极限左边界
		Stack<Integer> stack = new Stack<Integer>();
		int[] leftIndex = new int[height.length];
		for (int i = 0; i < height.length; i++) {
			// 出栈条件
			while (!stack.isEmpty() && height[i] <= height[stack.peek()]) {
				stack.pop();
			}
			leftIndex[i] = (stack.isEmpty() ? -1 : stack.peek());
			// 入栈
			stack.push(i);
		}

		return leftIndex;
	}

	private static int[] getRightBoundIndex(int[] height) {
		// 依次记录每个i处位置的极限左边界
		Stack<Integer> stack = new Stack<Integer>();
		int[] rightIndex = new int[height.length];
		for (int i = height.length - 1; i >= 0; i--) {
			// 出栈条件
			while (!stack.isEmpty() && height[i] <= height[stack.peek()]) {
				stack.pop();
			}
			rightIndex[i] = stack.isEmpty() ? height.length : stack.peek();
			// 入栈
			stack.push(i);
		}

		return rightIndex;
	}

}
