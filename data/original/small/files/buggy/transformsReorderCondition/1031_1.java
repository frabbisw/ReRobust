public dooyit.logic.Colour pickRandomColour() {
    if (0 == (colourPool.size())) {
        colourPool = new java.util.ArrayList<dooyit.logic.Colour>(recommendedColour);
    }
    return colourPool.remove(random.nextInt(recommendedColour.size()));
}
