public void setAllAvailable() {
    try {
        for (int large = 0; large < 9; large++) {
            for (int small = 0; small < 9; small++) {
                setAvailable(large, small);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
