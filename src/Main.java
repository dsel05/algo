    /*
     * Complete the function below.
     */
    /*static String[] findZeroSum(int[] arr) {
            // Write your code here.
            // Idea: 1) Sort array first 2) loop thru array and call twoSum for each element.
            Arrays.sort(arr);
            List<String> result = new ArrayList<>();

            for (int i = 0; i < arr.length; i++ ) {
            int findSum = -arr[i];
            int[] otherTwo = twoSum(arr, findSum, i);
            if (otherTwo != null) {
            result.add(arr[i] + ","  + otherTwo[0] + "," + otherTwo[1]);
            }
            }
            return result.toArray(new String[result.size()]);

            }

    // finds two sum assuming the arr is sorted.
    static int[] twoSum(int[] arr, int sum, int skipIndex) {
            int l = 0, r = arr.length-1;
            while(l < r) {
            if (l == skipIndex) {
            l++;
            continue;
            }
            if (r == skipIndex) {
            r--; continue;
            }
            int curSum = arr[l] + arr[r];
            if (curSum < sum) {
            l++;
            } else if (curSum > sum) {
            r--;
            } else {
            return new int[] {arr[l], arr[r]};
            }
            }
            return null;
            }*/

