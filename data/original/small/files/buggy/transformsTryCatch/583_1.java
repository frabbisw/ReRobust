private void setShareIntent(android.content.Intent shareIntent) {
    try {
        if (((mShareActionProvider) != null) && ((listViewScores.getItemAtPosition(0)) != null)) {
            mShareActionProvider.setShareIntent(shareIntent);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
