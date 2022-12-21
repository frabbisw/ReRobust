@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(com.zhan.budget.Adapter.CategorySection.TAG, ((getLayoutPosition()) + "on click : "));
    if ((mListener) != null) {
        mListener.onClick(getAdapterPosition());
    }
}
