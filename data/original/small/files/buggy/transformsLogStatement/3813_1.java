public int sumCards() {
    int sum = 0;
    System.out.println("log");
    for (com.bishopireton.finalproject.Card card : cards) sum += card.getRank();
    return sum;
}
