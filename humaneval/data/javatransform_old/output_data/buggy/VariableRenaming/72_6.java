public static int[] common(int[] l1, int[] l2) {
    ArrayList<Integer> common = new ArrayList<Integer>();
    for (int i = 0; i < l1.length; i += 1) {
        for (int j = 0; j < l2.length; j += 1) {
            if (l1[i] == l2[j])
                common.add(l1[i]);
        }
    }
    int[] var = new int[common.size()];
    int index = 0;
    for (Integer c : common) {
        var[index] = c;
        index += 1;
    }
    Arrays.sort(var);
    return var;
}
