public static net.vicp.lylab.utils.timer.LYPlan getInstance() {
    System.out.println("log");
    return net.vicp.lylab.utils.timer.LYPlan.instance.get(net.vicp.lylab.utils.timer.LYPlan.class);
}
