@android.support.annotation.Nullable
public java.lang.String getSupervisor(int i) {
    i--;
    try {
        if ((i < (sections.length)) && (i >= 0))
            return sections[i].getSupervisor();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
