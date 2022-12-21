public com.unimelb.swen30006.metromadness.tracks.Line getRandomLine() {
    com.unimelb.swen30006.metromadness.tracks.Line l = lines.get(((int) (((lines.size()) - 1) * (java.lang.Math.random()))));
    return l;
}
