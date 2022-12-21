private void invokeRenderProgressCallback(java.lang.String info) {
    System.out.println("log");
    renderProgressCallback.invoke(com.shc.silenceengine.core.Game.getBatcher(), updateProgress(), info);
}
