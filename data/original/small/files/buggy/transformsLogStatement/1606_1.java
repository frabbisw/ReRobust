@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public void cancelBookTour(int idBT, int idTour) {
    System.out.println("log");
    this.bookTourDao.cancelBookTour(idBT, idTour);
}
