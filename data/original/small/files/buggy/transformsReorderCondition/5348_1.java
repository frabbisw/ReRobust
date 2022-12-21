@java.lang.Override
public int compareTo(Model.Player another) {
    if ((another.points) > (this.points)) {
        return -1;
    } else {
        return 1;
    }
}
