@java.lang.Override
public long mediaGetCurrentMs() {
    try {
        if ((tvInputPlayer) != null)
            return (tvInputPlayer.getCurrentPosition()) + (mediaGetStartMs());
        else
            return 0;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
