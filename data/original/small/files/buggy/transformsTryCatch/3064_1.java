public void onWardrobeItemClicked(int type, de.ur.mi.fashionapp.wardrobe.model.WardrobeItem item) {
    try {
        startActivity(de.ur.mi.fashionapp.util.LinkService.getDetailIntent(this, type, item, wardrobeID, null));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
