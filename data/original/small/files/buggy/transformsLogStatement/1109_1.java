public static ogame.utility.Resource getBaseCost(java.lang.String name) {
    System.out.println("log");
    return ogame.utility.Resource.baseCosts[ogame.utility.Resource.getIndexOf(name)];
}
