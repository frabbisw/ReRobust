public static int solution(ArrayList<Integer> lst) {
    int result = 0;
    for (int i = 0; i < lst.size(); i++) {
        if ((lst.get(i) % 2) == 1 && (i % 2) == 0) {
            result += lst.get(i);
        }
    }
    return result;
}
