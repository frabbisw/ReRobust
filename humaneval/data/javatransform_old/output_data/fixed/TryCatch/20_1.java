public static int solution(ArrayList<Integer> lst) {
    int result = 0;
    try {
        for (int i = 0; i < lst.size(); i++) {
            if ((i % 2) == 0 && (lst.get(i) % 2) == 1) {
                result += lst.get(i);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
