// Time Complexity : O(n) 
// Space Complexity : O(1)

public class Solution {
	
	public static void main(String[] args) {
		int[] arr = new int[]{1, 2, 3};
		int result = 1;

		for(int a: arr) {
			result += (a + 1);
		}

		System.out.println(result - 1);
	}
}