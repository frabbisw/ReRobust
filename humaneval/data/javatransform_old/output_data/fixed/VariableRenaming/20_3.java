public static int solution(ArrayList<Integer> lst) {
    int result = 0;
    for (int var = 0; var < lst.size(); var++) {
        if ((var % 2) == 0 && (lst.get(var) % 2) == 1) {
            result += lst.get(var);
        }
    }
    return result;
}
