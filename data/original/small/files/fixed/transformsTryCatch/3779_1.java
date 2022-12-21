private void invokeRenderProgressCallback(java.lang.String info) {
    renderProgressCallback.invoke(com.shc.silenceengine.core.Game.getBatcher(), updateProgress(), info);
    try {
        java.lang.System.out.println(info);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
