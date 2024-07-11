public static int solution(ArrayList<Integer> lst) {
    int result = 0;
    for (int i = 0; lst.size() > i; i++) {
        if ((i % 2) == 0 && (lst.get(i) % 2) == 1) {
            result += lst.get(i);
        }
    }
    return result;
}
