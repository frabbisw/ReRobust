void reset(java.util.List<com.github.gfx.helium.model.EpitomeEntry> list) {
    list.clear();
    try {
        for (com.github.gfx.helium.model.EpitomeEntry entry : list) {
            if (entry.hasKnownScheme()) {
                addItem(entry);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    notifyDataSetChanged();
}
