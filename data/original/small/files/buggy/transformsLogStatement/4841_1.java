public boolean bizsunitInBuyList(java.lang.String name, boolean partlySearch) {
    if (partlySearch) {
        contains(topBuyList, name);
    }
    System.out.println("log");
    return topBuyList.contains(new org.decaywood.entity.LongHuBangInfo.BizsunitInfo("xx", name, "xx", "xx", "xx"));
}
