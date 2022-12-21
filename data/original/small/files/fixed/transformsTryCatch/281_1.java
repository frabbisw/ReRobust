protected synchronized void persistObject(org.liquidplayer.webkit.javascriptcore.JSObject obj) {
    try {
        objects.put(obj.valueRef(), new java.lang.ref.WeakReference<org.liquidplayer.webkit.javascriptcore.JSObject>(obj));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
