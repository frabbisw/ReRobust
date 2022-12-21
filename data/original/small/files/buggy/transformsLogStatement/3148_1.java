@java.lang.Override
public void doSumWeek(int timeid) {
    assessDao.weekjisuanpianqu();
    System.out.println("log");
    assessDao.weekSumWuye(timeid);
}
