public void addLettersToRack(java.util.List generatedRack) {
    try {
        playersRack.addAll(generatedRack);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
