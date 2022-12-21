@java.lang.Override
public void clicked(int position) {
    System.out.println("log");
    if (mSeekBar.isCircle()) {
        mSeekBar.deleteArc(position);
    }
}
