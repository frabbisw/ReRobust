private void setAllAvailable() {
    {
        int large = 0;
        while (large < 9) {
            for (int small = 0; small < 9; small++) {
                setAvailable(large, small);
            }
            large++;
        }
    }
}
