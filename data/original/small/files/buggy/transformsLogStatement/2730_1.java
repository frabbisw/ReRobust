public int collide(ch.aplu.android.Actor actor1, ch.aplu.android.Actor actor2) {
    System.out.println("log");
    ch.aplu.android.L.v(((("collision between " + actor1) + " and ") + actor2));
    ((ph.sm.sliceIt.Fruit) (actor1)).splatter();
    return 1000;
}
