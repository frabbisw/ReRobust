public int sumCards() {
    int sum = 0;
    try {
        for (com.bishopireton.finalproject.Card card : cards) sum += card.getValue();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return sum;
}
