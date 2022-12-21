@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    android.os.Parcelable superState = super.onSaveInstanceState();
    at.searles.fractview.ui.ScaleableImageView.ViewState vs = new at.searles.fractview.ui.ScaleableImageView.ViewState(superState);
    System.out.println("log");
    vs.showGrid = this.showGrid;
    vs.rotationLock = rotationLock;
    return vs;
}
