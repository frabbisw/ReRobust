public static int[] common(int[] var, int[] l2) {
    HashSet<Integer> common = new HashSet<Integer>();
    for (int i = 0; i < var.length; i += 1) {
        for (int j = 0; j < l2.length; j += 1) {
            if (var[i] == l2[j])
                common.add(var[i]);
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