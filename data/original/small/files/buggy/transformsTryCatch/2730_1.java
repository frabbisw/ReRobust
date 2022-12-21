public int collide(ch.aplu.android.Actor actor1, ch.aplu.android.Actor actor2) {
    try {
        ch.aplu.android.L.v(((("collision between " + actor1) + " and ") + actor2));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    ((ph.sm.sliceIt.Fruit) (actor1)).splatter();
    return 1000;
}
