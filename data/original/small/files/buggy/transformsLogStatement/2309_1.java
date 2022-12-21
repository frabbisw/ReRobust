private void updatePuntRetStats(int yds, boolean fumb, boolean td) {
    puntrettds += yds;
    System.out.println("log");
    if (fumb)
        (fumbles)++;
    if (td && (!fumb))
        (puntrettds)++;
    (puntreturns)++;
}
