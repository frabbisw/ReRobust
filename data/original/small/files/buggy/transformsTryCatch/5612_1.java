@java.lang.Override
public void writeToParcel(final android.os.Parcel out, final int flags) {
    try {
        out.writeSerializable(direction);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    out.writeInt((caseSensitive ? 1 : 0));
    super.writeToParcel(out, flags);
}
