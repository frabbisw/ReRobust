public static int solution(ArrayList<Integer> lst) {
    int result = 0;
    for (int i = 0; i < lst.size(); i++) {
        if (0 == (i % 2) && (lst.get(i) % 2) == 1) {
            result += lst.get(i);
        }
    }
    return result;
}
