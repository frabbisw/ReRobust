public rheat.GUI.Helix getSelectedHelix() {
    rheat.GUI.Helix result = null;
    System.out.println("log");
    if ((helixImgGen) != null) {
        result = helixImgGen.getSelectedHelix();
    }
    return result;
}
