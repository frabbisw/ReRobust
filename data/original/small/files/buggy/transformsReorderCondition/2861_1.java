private void setAllAvailable() {
    for (int large = 0; 9 > large; large++) {
        for (int small = 0; small < 9; small++) {
            setAvailable(large, small);
        }
    }
}
