private void teaspoon() {
    java.lang.System.out.println("Enter the number of teaspoons:");
    java.lang.String teaspoon = getInput();
    int Teaspoon = java.lang.Integer.parseInt(teaspoon);
    try {
        citbyui.cit260.theHunt2.view.PuzzleTeaspoon.calcHalfGallon();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    double quantity;
    java.lang.String units;
}
