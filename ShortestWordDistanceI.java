// Time Complexity : O(n), where n is the number of words in the array
// Space Complexity : O(1)

class Solution {
	public int shortestDistance(String[] word1, String word2) {
		int indexWord1 = -1;
		int indexWord2 = -1;

		int shortestDistance = words.length;

		for(int i = 0; i < words.length; i++) {
			if(words[i].equals(word1)) {
				indexWord1 = i;
			} else if (words[i].equals(word2)) {
				indexWord2 = i;
			}

			if(indexWord1 != -1 && indexWord2 != -1) {
				shortestDistance = Math.min(shortestDistance,
					Math.abs(indexWord1 - indexWord2));
			}
		}

		return shortestDistance;
	}
}