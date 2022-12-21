public boolean bizsunitInBuyList(java.lang.String name, boolean partlySearch) {
    try {
        if (partlySearch) {
            return contains(topBuyList, name);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return topBuyList.contains(new org.decaywood.entity.LongHuBangInfo.BizsunitInfo("xx", name, "xx", "xx", "xx"));
}
