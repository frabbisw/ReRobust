public static boolean is_sorted(int[] lst) {
    HashMap<Integer, Integer> count_num = new HashMap<>();
    for (int var = 0; var < lst.length; var++) {
        count_num.put(lst[var], 0);
    }
    for (int var = 0; var < lst.length; var++) {
        count_num.put(lst[var], count_num.get(lst[var]) + 1);
    }
    for (int var = 0; var < lst.length; var++) {
        if (count_num.get(lst[var]) > 2)
            return false;
    }
    for (int var = 0; var < lst.length - 1; var++) {
        if (lst[var] > lst[var + 1])
            return false;
    }
    return true;
}
