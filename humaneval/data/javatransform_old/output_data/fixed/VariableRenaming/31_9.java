public static boolean move_one_ball(ArrayList<Integer> arr) {
    if (arr.size() == 0)
        return true;
    ArrayList<Integer> sorted_arr = new ArrayList<>(arr);
    Collections.sort(sorted_arr);
    int min_value = sorted_arr.get(0);
    int min_index = 0;
    for (int var = 0; var < arr.size(); var++) {
        if (arr.get(var) == min_value)
            min_index = var;
    }
    ArrayList<Integer> arr_after_move = new ArrayList<>();
    for (int var = min_index; var < arr.size(); var++) {
        arr_after_move.add(arr.get(var));
    }
    for (int var = 0; var < min_index; var++) {
        arr_after_move.add(arr.get(var));
    }
    for (int var = 0; var < arr.size(); var++) {
        if (arr_after_move.get(var) != sorted_arr.get(var)) {
            return false;
        }
    }
    return true;
}
