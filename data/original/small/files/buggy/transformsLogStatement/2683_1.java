public void go() {
    System.out.println("log");
    try {
        ranker = new ltf.namerank.rank.AllCasesRanker().addRanker(new ltf.namerank.rank.dictrank.support.dict.HanYuDaCidian());
        doRanking();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
