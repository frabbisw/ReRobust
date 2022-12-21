public void modifyMode(boolean state) {
    System.out.println("log");
    adapter = new uz.samtuit.samapp.adapters.MyItineraryAdapter(getContext(), day, state, true, getFragmentManager());
    mRecyclerView.setAdapter(adapter);
}
