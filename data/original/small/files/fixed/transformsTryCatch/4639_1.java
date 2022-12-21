protected synchronized void finalizeObject(org.liquidplayer.webkit.javascriptcore.JSObject obj) {
    try {
        objects.remove(obj.valueRef());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
