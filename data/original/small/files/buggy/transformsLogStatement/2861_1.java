private void setAllAvailable() {
    System.out.println("log");
    for (int large = 0; large < 9; large++) {
        for (int small = 0; small < 9; small++) {
            setAvailable(large, small);
        }
    }
}
