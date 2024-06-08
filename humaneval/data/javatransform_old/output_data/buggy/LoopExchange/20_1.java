public static int solution(ArrayList<Integer> lst) {
    int result = 0;
    {
        int i = 0;
        while (i < lst.size()) {
            if ((i % 2) == 1 && (lst.get(i) % 2) == 0) {
                result += lst.get(i);
            }
            i++;
        }
    }
    return result;
}
