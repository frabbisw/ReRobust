public void addData(short[] data) {
    try {
        if ((dataForDraw) != null) {
            nextStartPoint = addArrayToArray(dataForDraw, data, nextStartPoint);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
