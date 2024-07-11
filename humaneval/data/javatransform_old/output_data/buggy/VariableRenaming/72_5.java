public static int[] common(int[] l1, int[] l2) {
    ArrayList<Integer> common = new ArrayList<Integer>();
    for (int i = 0; i < l1.length; i += 1) {
        for (int var = 0; var < l2.length; var += 1) {
            if (l1[i] == l2[var])
                common.add(l1[i]);
        }
    }
    int[] result = new int[common.size()];
    int index = 0;
    for (Integer c : common) {
        result[index] = c;
        index += 1;
    }
    Arrays.sort(result);
    return result;
}
