package Leetcode;

import java.util.Stack;

public class No42 {
	public static void main(String[] args) {
		int[] height = { 4, 2, 0, 3, 2, 5 };

		System.out.println(getRain(height));

	}

	private static int getRain(int[] height) {

		int rainArea = 0;
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < height.length; i++) {
			while (!stack.isEmpty() && height[i] > height[stack.peek()]) {

				int bottomIndex = stack.pop();
				if (stack.isEmpty()) {
					break;
				}
				int leftIndex = stack.peek();
				int rightIndex = i;

				int rainHeight = Math.min(height[leftIndex], height[rightIndex]) - height[bottomIndex];
				int rainLength = i - leftIndex - 1;
				rainArea += rainHeight * rainLength;

			}

			// 单调递减序列压栈
			stack.push(i);
		}

		return rainArea;
	}
}