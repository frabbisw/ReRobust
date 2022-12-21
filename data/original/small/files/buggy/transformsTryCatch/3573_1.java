@java.lang.Override
public void clicked(int position) {
    try {
        if (mSeekBar.isCircle()) {
            mSeekBar.deleteArc(position);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
