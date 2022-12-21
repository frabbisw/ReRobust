private void invokeRenderProgressCallback(java.lang.String info) {
    try {
        renderProgressCallback.invoke(com.shc.silenceengine.core.Game.getBatcher(), updateProgress(), info);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
