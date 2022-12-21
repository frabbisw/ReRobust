void reset(java.util.List<com.github.gfx.helium.model.EpitomeEntry> list) {
    try {
        clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    for (com.github.gfx.helium.model.EpitomeEntry entry : list) {
        if (entry.hasKnownScheme()) {
            addItem(entry);
        }
    }
    notifyDataSetChanged();
}
