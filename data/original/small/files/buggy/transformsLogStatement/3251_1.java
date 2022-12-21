private io.jsonwebtoken.Claims getClaimsFromToken(java.lang.String token) {
    System.out.println("log");
    try {
        return io.jsonwebtoken.Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
}
