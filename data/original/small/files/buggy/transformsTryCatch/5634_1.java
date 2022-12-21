@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    try {
        super.onCreate(savedInstanceState);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    se.chalmers.projektgrupplp4.studentlivinggbg.AccommodationRecyclerViewAdapter recyclerViewAdapter = new se.chalmers.projektgrupplp4.studentlivinggbg.AccommodationRecyclerViewAdapter(se.chalmers.projektgrupplp4.studentlivinggbg.model.accommodation.Accommodation.getFavorites(), getApplicationContext());
    new se.chalmers.projektgrupplp4.studentlivinggbg.view.FavoritesView(this, recyclerViewAdapter);
    new se.chalmers.projektgrupplp4.studentlivinggbg.controller.FavoritesController(this, recyclerViewAdapter);
}
