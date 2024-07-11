public static int solution(ArrayList<Integer> var) {
    int result = 0;
    for (int i = 0; i < var.size(); i++) {
        if ((i % 2) == 1 && (var.get(i) % 2) == 0) {
            result += var.get(i);
        }
    }
    return result;
}
