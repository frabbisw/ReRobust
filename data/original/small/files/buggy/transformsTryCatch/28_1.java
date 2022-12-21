@java.lang.Override
public void onClick(android.view.View v) {
    try {
        android.util.Log.v("dimamir999", "handle click on add photo button");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    presenter.addNewPhoto(((android.graphics.drawable.BitmapDrawable) (photoView.getDrawable())).getBitmap());
}
