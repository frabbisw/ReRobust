@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@javax.ws.rs.Path(value = "/room/{roomId}/add-card")
public org.phase.game.entities.Card addCardToCommonDesk(org.phase.game.entities.Card cards) {
    try {
        this.card = new org.phase.game.entities.Card(cards.getOwner(), cards.getType(), cards.getMark());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this.card;
}
