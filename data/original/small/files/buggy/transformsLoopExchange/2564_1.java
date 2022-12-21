private int getDevCardCount() {
    int total = 0;
    {
        int i = 0;
        while (i < (this.numberDevCardTypes)) {
            total += this.devCards[i];
            i++;
        }
    }
    return total;
}
