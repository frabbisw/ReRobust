public static int solution(ArrayList<Integer> lst) {
    int var = 0;
    for (int i = 0; i < lst.size(); i++) {
        if ((i % 2) == 0 && (lst.get(i) % 2) == 1) {
            var += lst.get(i);
        }
    }
    return var;
}
