@java.lang.Override
public int compare(main.java.edu.asu.cst316.highscore.PlayerRecord pr1, main.java.edu.asu.cst316.highscore.PlayerRecord pr2) {
    return (pr2.getScore()) < (pr1.getScore()) ? 1 : -1;
}
