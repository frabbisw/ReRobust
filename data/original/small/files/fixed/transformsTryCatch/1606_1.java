@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void cancelBookTour(int idBT) {
    try {
        this.bookTourDao.cancelBookTour(idBT);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
