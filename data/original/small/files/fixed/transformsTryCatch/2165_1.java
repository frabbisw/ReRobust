public void addProblematicKanjis(java.util.Set<java.lang.Integer> problematicKanjiList) {
    problematicKanjis = problematicKanjiList;
    try {
        parent.updateProblematicKanjisAmount();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
