public static int solution(ArrayList<Integer> lst) {
    System.out.println("log");
    int result = 0;
    for (int i = 0; i < lst.size(); i++) {
        if ((i % 2) == 1 && (lst.get(i) % 2) == 0) {
            result += lst.get(i);
        }
    }
    return result;
}
