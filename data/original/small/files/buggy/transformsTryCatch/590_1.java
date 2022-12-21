@org.junit.Test
public void testDeleteSessionByUserWhenSessionIsValidAndUserIsNotNull() throws gr.devian.talosquests.backend.Exceptions.TalosQuestsNullArgumentException {
    sessionService.delete(testUserWithSession);
    try {
        org.junit.Assert.assertNull(sessionService.getByUser(testUserWithSession));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
