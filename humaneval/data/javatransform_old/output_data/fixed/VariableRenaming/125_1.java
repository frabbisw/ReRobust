public static boolean is_sorted(int[] var) {
    HashMap<Integer, Integer> count_num = new HashMap<>();
    for (int i = 0; i < var.length; i++) {
        count_num.put(var[i], 0);
    }
    for (int i = 0; i < var.length; i++) {
        count_num.put(var[i], count_num.get(var[i]) + 1);
    }
    for (int i = 0; i < var.length; i++) {
        if (count_num.get(var[i]) > 2)
            return false;
    }
    for (int i = 0; i < var.length - 1; i++) {
        if (var[i] > var[i + 1])
            return false;
    }
    return true;
}
