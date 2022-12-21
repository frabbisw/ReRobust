public amagi82.modularcharactersheetcreator.entities.characters.Splat getSplat(int position) {
    amagi82.modularcharactersheetcreator.entities.characters.Splat splat = axisViewModel.getList().get(position).getSplat();
    try {
        updateIfNotEndpoint(splat);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return splat;
}
