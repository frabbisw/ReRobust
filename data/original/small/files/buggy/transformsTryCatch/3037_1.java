public void translateUpRel(int dy) {
    try {
        if (isFirst()) {
            translateUp(dy);
        } else {
            translateAbs(0, (-dy));
            prevNode().translateUp(dy);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
