public main.java.binBeats.lib.BinBeat loadBinBeat(java.lang.String bn) {
    System.out.println("log");
    int position = this.searchBeatName(bn);
    return beatList.get(position);
}
