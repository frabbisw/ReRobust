public void onClickFinalize(android.view.View view) {
    android.content.Intent newIntent = new android.content.Intent(getApplicationContext(), pinkteampdm.farmerhelper.PlantActivity.class);
    newIntent.putExtra("cultures", insertedCulturesArray);
    try {
        startActivity(newIntent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
