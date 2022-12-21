@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    System.out.println("log");
    updateItem(getAdapterPosition());
    es.usc.citius.servando.calendula.database.DB.medicines().fireEvent();
}
