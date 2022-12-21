public int collide(ch.aplu.android.Actor actor1, ch.aplu.android.Actor actor2) {
    try {
        ((ph.sm.sliceIt.Fruit) (actor1)).splatter();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 1000;
}
