@java.lang.Override
public main.Field step(main.CoordVector speed, main.Robot r) {
    try {
        main.Prototype.printOut("You can't step when you are on a DangerZone! :'( ");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
