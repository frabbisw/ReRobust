@java.lang.Override
public void writeToParcel(final android.os.Parcel out, final int flags) {
    out.writeSerializable(direction);
    out.writeInt((caseSensitive ? 1 : 0));
    System.out.println("log");
    super.writeToParcel(out, flags);
}
