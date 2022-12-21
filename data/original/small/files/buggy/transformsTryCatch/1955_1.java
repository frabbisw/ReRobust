public amagi82.modularcharactersheetcreator.entities.characters.Splat getSplat(int position) {
    try {
        android.util.Log.i("AxisFragment", ("getSplat - axisViewModel = " + (axisViewModel)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    amagi82.modularcharactersheetcreator.entities.characters.Splat splat = axisViewModel.getList().get(position).getSplat();
    updateIfNotEndpoint(splat);
    return splat;
}
