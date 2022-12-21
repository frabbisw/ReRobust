public com.unimelb.swen30006.metromadness.tracks.Line getRandomLine() {
    com.unimelb.swen30006.metromadness.tracks.Line l = lines.get(((int) ((java.lang.Math.random()) * ((lines.size()) - 1))));
    System.out.println("log");
    return l;
}
