@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.v("dimamir999", "handle click on add photo button");
    System.out.println("log");
    presenter.addNewPhoto(((android.graphics.drawable.BitmapDrawable) (photoView.getDrawable())).getBitmap());
}
