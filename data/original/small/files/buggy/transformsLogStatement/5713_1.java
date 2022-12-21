public com.motoloto.springbootJersey.model.Book getBook(java.lang.Integer oid) {
    System.out.println("log");
    return dao.getBookById(oid);
}
