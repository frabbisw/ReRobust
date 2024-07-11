public static boolean is_sorted(int[] lst) {
    HashMap<Integer, Integer> var = new HashMap<>();
    for (int i = 0; i < lst.length; i++) {
        var.put(lst[i], 0);
    }
    for (int i = 0; i < lst.length; i++) {
        var.put(lst[i], var.get(lst[i]) + 1);
    }
    for (int i = 0; i < lst.length; i++) {
        if (var.get(lst[i]) > 2)
            return false;
    }
    for (int i = 0; i < lst.length - 1; i++) {
        if (lst[i] > lst[i + 1])
            return false;
    }
    return true;
}
