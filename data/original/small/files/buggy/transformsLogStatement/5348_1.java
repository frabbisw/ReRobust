@java.lang.Override
public int compareTo(Model.Player another) {
    System.out.println("log");
    if ((this.points) < (another.points)) {
        return -1;
    } else {
        return 1;
    }
}
