@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void cancelBookTour(int idBT, int idTour) {
    try {
        this.bookTourDao.cancelBookTour(idBT, idTour);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
