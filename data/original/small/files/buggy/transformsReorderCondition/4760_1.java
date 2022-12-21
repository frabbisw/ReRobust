@android.support.annotation.Nullable
public java.lang.String getSupervisor(int i) {
    for (com.nmakademija.nmaakademija.entity.Section section : sections) if (i == (section.getId()))
        return section.getSupervisor();
    return null;
}
