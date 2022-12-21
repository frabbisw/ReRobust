@java.lang.Override
public void onClick(android.view.View v) {
    try {
        android.util.Log.d(com.zhan.budget.Adapter.CategorySection.TAG, ("on click : " + (getLayoutPosition())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mListener) != null) {
        mListener.onClick(getAdapterPosition());
    }
}
