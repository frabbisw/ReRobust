protected final void addEntryBefore(final org.bonitasoft.web.toolkit.client.ui.component.form.entry.FormEntry entry, final org.bonitasoft.web.toolkit.client.ui.JsId jsid) {
    try {
        getLastContainer().prepend(entry);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.entriesIndex.put(entry.getJsId().toString(), entry);
}
