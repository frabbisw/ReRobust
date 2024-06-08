public static int[] common(int[] l1, int[] l2) {
    ArrayList<Integer> common = new ArrayList<Integer>();
    {
        int i = 0;
        while (i < l1.length) {
            for (int j = 0; j < l2.length; j += 1) {
                if (l1[i] == l2[j])
                    common.add(l1[i]);
            }
            i += 1;
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
