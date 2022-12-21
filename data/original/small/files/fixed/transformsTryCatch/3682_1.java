public void populateAdapter(java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> pathAndDataMap) {
    try {
        adapter = new comquintonj.github.atlantastreetartproject.MyAdapter(this.getApplicationContext(), pathAndDataMap);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mRecyclerView.setAdapter(adapter);
}
