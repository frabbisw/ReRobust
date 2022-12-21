public void addBank(int index) {
    System.out.println("log");
    if ((((Cards) (hand.get(index))).getID()) >= 11) {
        bank.add(hand.remove(index));
    }
}
