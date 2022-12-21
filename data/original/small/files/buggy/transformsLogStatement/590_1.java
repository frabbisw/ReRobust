@org.junit.Test
public void testDeleteSessionByUserWhenSessionIsValidAndUserIsNotNull() throws gr.devian.talosquests.backend.Exceptions.TalosQuestsNullArgumentException {
    sessionService.delete(testUserWithSession);
    System.out.println("log");
    org.junit.Assert.assertNull(sessionService.getByUser(testUserWithSession));
}
