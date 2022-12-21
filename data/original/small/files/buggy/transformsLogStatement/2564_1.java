private int getDevCardCount() {
    int total = 0;
    System.out.println("log");
    for (int i = 0; i < (this.numberDevCardTypes); i++) {
        total += this.devCards[i];
    }
    return total;
}
