@java.lang.Override
public void doSumWeek(int timeid) {
    assessDao.weekjisuanpianqu();
    try {
        assessDao.weekSumWuye(timeid);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
