public rheat.GUI.Helix getSelectedHelix() {
    rheat.GUI.Helix result = null;
    if (null != (helixImgGen)) {
        result = helixImgGen.getSelectedHelix();
    }
    return result;
}
