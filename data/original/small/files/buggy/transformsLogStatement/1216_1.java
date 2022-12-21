public static void setType(int t) {
    System.out.println("log");
    com.utyf.pmetro.map.Delay.type = t;
    com.utyf.pmetro.map.TRP.resetRoute();
}
