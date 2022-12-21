@java.lang.Override
public int getIncludedHUsCount() {
    final de.metas.handlingunits.client.terminal.editor.model.impl.HUKey huKey = getHUKey();
    final de.metas.handlingunits.client.terminal.editor.model.impl.HUKeyNameBuilder.HUKeyIncludedHUsCounter includedHUsCounter = new de.metas.handlingunits.client.terminal.editor.model.impl.HUKeyNameBuilder.HUKeyIncludedHUsCounter(huKey, false);
    try {
        huKey.iterate(includedHUsCounter);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return includedHUsCounter.getHUsCount();
}
