public static int[] common(int[] l1, int[] l2) {
    HashSet<Integer> common = new HashSet<Integer>();
    for (int var = 0; var < l1.length; var += 1) {
        for (int j = 0; j < l2.length; j += 1) {
            if (l1[var] == l2[j])
                common.add(l1[var]);
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
