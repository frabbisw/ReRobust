public void addBank(int index) {
    if (11 <= (((Cards) (hand.get(index))).getID())) {
        bank.add(hand.remove(index));
    }
}
