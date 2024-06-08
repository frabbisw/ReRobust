public static boolean move_one_ball(ArrayList<Integer> var) {
    if (var.size() == 0)
        return true;
    ArrayList<Integer> sorted_arr = new ArrayList<>(var);
    Collections.sort(sorted_arr);
    int min_value = sorted_arr.get(sorted_arr.size() - 1);
    int min_index = 0;
    for (int i = 0; i < var.size(); i++) {
        if (var.get(i) == min_value)
            min_index = i;
    }
    ArrayList<Integer> arr_after_move = new ArrayList<>();
    for (int i = min_index; i < var.size(); i++) {
        arr_after_move.add(var.get(i));
    }
    for (int i = 0; i < min_index; i++) {
        arr_after_move.add(var.get(i));
    }
    for (int i = 0; i < var.size(); i++) {
        if (arr_after_move.get(i) != sorted_arr.get(i)) {
            return false;
        }
    }
    return true;
}
