public static boolean is_sorted(int[] lst) {
    HashMap<Integer, Integer> count_num = new HashMap<>();
    for (int i = 0; i < lst.length; i++) {
        count_num.put(lst[i], 0);
    }
    for (int i = 0; i < lst.length; i++) {
        count_num.put(lst[i], count_num.get(lst[i]) + 1);
    }
    for (int i = 0; i < lst.length; i++) {
        if (count_num.get(lst[i]) > 2)
            return false;
    }
    {
        int i = 0;
        while (i < lst.length - 1) {
            if (lst[i] > lst[i + 1])
                return false;
            i++;
        }
    }
    return true;
}
