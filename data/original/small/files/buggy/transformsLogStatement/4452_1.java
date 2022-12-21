@java.lang.Override
protected void onActivityResult(int aRequestCode, int aResultCode, android.content.Intent data) {
    System.out.println("log");
    am.te.myapplication.Model.Listing newListing = am.te.myapplication.Model.Listing.getListingFromIntent(data);
    products.add(newListing);
    arrayAdapter.notifyDataSetChanged();
}
