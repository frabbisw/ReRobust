private void setShareIntent(android.content.Intent shareIntent) {
    if (((listViewScores.getItemAtPosition(0)) != null) && ((mShareActionProvider) != null)) {
        mShareActionProvider.setShareIntent(shareIntent);
    }
}
