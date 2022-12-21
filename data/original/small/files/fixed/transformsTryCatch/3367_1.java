@org.springframework.web.bind.annotation.RequestMapping(value = "/deleteInv")
@org.springframework.web.bind.annotation.ResponseBody
public long deleteInv(@org.springframework.web.bind.annotation.RequestBody com.webapp.project.modules.invoice.model.InvoiceVoucher[] invoiceVoucher) {
    java.lang.String a = "test";
    try {
        invoiceService.deleteInv(invoiceVoucher);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 0;
}
