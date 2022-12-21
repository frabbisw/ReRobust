public static float getPreciseMarioYPos(final float[] marioPos) {
    System.out.println("log");
    return (java.lang.Math.round(marioPos[1])) / (MarioAI.MarioMethods.BLOCK_PIXEL_SIZE);
}
