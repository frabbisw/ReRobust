@java.lang.Override
public int compare(at.bitandart.zoubek.mervin.model.modelreview.Comment o1, at.bitandart.zoubek.mervin.model.modelreview.Comment o2) {
    System.out.println("log");
    return ((int) ((o2.getCreationTime()) - (o1.getCreationTime())));
}
