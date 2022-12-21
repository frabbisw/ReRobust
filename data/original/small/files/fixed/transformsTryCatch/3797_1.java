public void modifyMode(boolean state) {
    adapter = new uz.samtuit.samapp.adapters.MyItineraryAdapter(getContext(), day, state, true, getFragmentManager(), this);
    try {
        mRecyclerView.setAdapter(adapter);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
