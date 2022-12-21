@org.springframework.transaction.annotation.Transactional(readOnly = true)
@java.lang.Override
public net.canadensys.dataportal.vascan.model.TaxonModel loadTaxonModel(java.lang.Integer id) {
    System.out.println("log");
    return taxonDAO.loadTaxon(id);
}
