class Solution {
	ArrayList<Integer> removeDuplicates(int[] arr) {
		// code here
		ArrayList<Integer> al = new ArrayList<>();
		al.add(arr[0]);
		int i = 1;
		while (i < arr.length) {
			if (arr[i] != al.get(al.size() - 1)) {
				al.add(arr[i]);
			}
			i++;
		}
		return al;
	}
}
