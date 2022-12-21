public rheat.GUI.Helix getSelectedHelix() {
    rheat.GUI.Helix result = null;
    try {
        if ((helixImgGen) != null) {
            result = helixImgGen.getSelectedHelix();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
