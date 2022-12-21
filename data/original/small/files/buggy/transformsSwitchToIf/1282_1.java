@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        return new capstoneproject.androidnanodegree.com.cochelper.fragments.VideoFragment();
    } else if (position == 1) {
        return new capstoneproject.androidnanodegree.com.cochelper.fragments.FileFragment();
    } else {
        return null;
    }
}
