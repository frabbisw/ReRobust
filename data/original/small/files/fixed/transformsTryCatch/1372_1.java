@java.lang.Override
public void writeToParcel(android.os.Parcel out, int flags) {
    out.writeString(this.server);
    out.writeString(this.email);
    try {
        out.writeString(this.token);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    out.writeValue(this.is_shib);
}
