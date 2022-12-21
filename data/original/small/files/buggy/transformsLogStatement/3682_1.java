public void populateAdapter(java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> pathAndDataMap) {
    System.out.println("log");
    comquintonj.github.atlantastreetartproject.MyAdapter adapter = new comquintonj.github.atlantastreetartproject.MyAdapter(this.getApplicationContext(), pathAndDataMap);
    mRecyclerView.setAdapter(adapter);
}
