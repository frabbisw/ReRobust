public static boolean move_one_ball(ArrayList<Integer> arr) {
    if (arr.size() == 0)
        return true;
    ArrayList<Integer> var = new ArrayList<>(arr);
    Collections.sort(var);
    int min_value = var.get(0);
    int min_index = 0;
    for (int i = 0; i < arr.size(); i++) {
        if (arr.get(i) == min_value)
            min_index = i;
    }
    ArrayList<Integer> arr_after_move = new ArrayList<>();
    for (int i = min_index; i < arr.size(); i++) {
        arr_after_move.add(arr.get(i));
    }
    for (int i = 0; i < min_index; i++) {
        arr_after_move.add(arr.get(i));
    }
    for (int i = 0; i < arr.size(); i++) {
        if (arr_after_move.get(i) != var.get(i)) {
            return false;
        }
    }
    return true;
}
