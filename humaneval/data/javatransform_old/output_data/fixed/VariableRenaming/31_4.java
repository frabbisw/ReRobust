public static boolean move_one_ball(ArrayList<Integer> arr) {
    if (arr.size() == 0)
        return true;
    ArrayList<Integer> sorted_arr = new ArrayList<>(arr);
    Collections.sort(sorted_arr);
    int min_value = sorted_arr.get(0);
    int var = 0;
    for (int i = 0; i < arr.size(); i++) {
        if (arr.get(i) == min_value)
            var = i;
    }
    ArrayList<Integer> arr_after_move = new ArrayList<>();
    for (int i = var; i < arr.size(); i++) {
        arr_after_move.add(arr.get(i));
    }
    for (int i = 0; i < var; i++) {
        arr_after_move.add(arr.get(i));
    }
    for (int i = 0; i < arr.size(); i++) {
        if (arr_after_move.get(i) != sorted_arr.get(i)) {
            return false;
        }
    }
    return true;
}
