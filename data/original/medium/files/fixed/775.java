public void respondAccepted_whenCreateARefund ( int amount , java.lang.String gatewayAccountId , java.lang.String chargeId , java.lang.String refundId , java.lang.String status , java.lang.String createdDate ) { whenCreateRefund ( amount , gatewayAccountId , chargeId ) . respond ( org.mockserver.model.HttpResponse . response () . withStatusCode ( uk.gov.pay.api.utils.ACCEPTED_202 ) . withHeader ( uk.gov.pay.api.utils.CONTENT_TYPE , javax.ws.rs.core.MediaType.APPLICATION_JSON ) . withBody ( buildGetRefundResponse ( refundId , amount , status , createdDate ) ) ) ; } 
