private int getDevCardCount() {
    int total = 0;
    for (int i = 0; (this.numberDevCardTypes) > i; i++) {
        total += this.devCards[i];
    }
    return total;
}
