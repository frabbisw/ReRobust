public dooyit.logic.Colour pickRandomColour() {
    try {
        if ((colourPool.size()) == 0) {
            colourPool = new java.util.ArrayList<dooyit.logic.Colour>(recommendedColour);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return colourPool.remove(random.nextInt(colourPool.size()));
}
