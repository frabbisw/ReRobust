public void addBank(int index) {
    try {
        if ((((Cards) (hand.get(index))).getID()) >= 11) {
            bank.add(hand.remove(index));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
