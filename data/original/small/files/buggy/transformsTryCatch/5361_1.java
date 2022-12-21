@java.lang.Override
protected void beginAgentsHandler(java.lang.String actID) {
    try {
        openBlocks.push(kariminf.faris.process.ston.StonGenerator.Block.AGENT);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    conj = new java.util.ArrayList<>();
}
