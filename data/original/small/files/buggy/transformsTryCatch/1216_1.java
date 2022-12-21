public static void setType(int t) {
    com.utyf.pmetro.map.Delay.type = t;
    try {
        com.utyf.pmetro.map.TRP.resetRoute();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
