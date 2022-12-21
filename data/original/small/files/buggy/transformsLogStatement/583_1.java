private void setShareIntent(android.content.Intent shareIntent) {
    System.out.println("log");
    if (((mShareActionProvider) != null) && ((listViewScores.getItemAtPosition(0)) != null)) {
        mShareActionProvider.setShareIntent(shareIntent);
    }
}
