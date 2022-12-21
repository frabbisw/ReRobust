@android.support.annotation.Nullable
public java.lang.String getSupervisor(int i) {
    try {
        for (com.nmakademija.nmaakademija.entity.Section section : sections) if ((section.getId()) == i)
            return section.getSupervisor();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
