public void addData(short[] data) {
    try {
        nextStartPoint = addArrayToArray(dataForDraw, data, nextStartPoint);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
