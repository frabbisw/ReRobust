public void modifyMode(boolean state) {
    try {
        adapter = new uz.samtuit.samapp.adapters.MyItineraryAdapter(getContext(), day, state, true, getFragmentManager());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mRecyclerView.setAdapter(adapter);
}
