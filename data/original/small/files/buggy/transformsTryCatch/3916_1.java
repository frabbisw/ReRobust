@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    try {
        updateItem(getAdapterPosition());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    es.usc.citius.servando.calendula.database.DB.medicines().fireEvent();
}
