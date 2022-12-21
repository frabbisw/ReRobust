private void updatePuntRetStats(int yds, boolean fumb, boolean td) {
    puntrettds += yds;
    if (fumb)
        (fumbles)++;
    if ((!fumb) && td)
        (puntrettds)++;
    (puntreturns)++;
}
