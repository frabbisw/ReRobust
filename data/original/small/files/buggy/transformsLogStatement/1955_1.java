public amagi82.modularcharactersheetcreator.entities.characters.Splat getSplat(int position) {
    android.util.Log.i("AxisFragment", ("getSplat - axisViewModel = " + (axisViewModel)));
    amagi82.modularcharactersheetcreator.entities.characters.Splat splat = axisViewModel.getList().get(position).getSplat();
    System.out.println("log");
    updateIfNotEndpoint(splat);
    return splat;
}
