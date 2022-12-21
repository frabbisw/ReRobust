public void addBank(int index) {
    try {
        bank.add(hand.remove(index));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
