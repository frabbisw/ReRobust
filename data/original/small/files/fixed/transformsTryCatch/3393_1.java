@java.lang.Override
public float reportRayFixture(com.badlogic.gdx.physics.box2d.Fixture fixture, com.badlogic.gdx.math.Vector2 point, com.badlogic.gdx.math.Vector2 normal, float fraction) {
    cFix = fixture;
    collision.set(point);
    try {
        this.normal.set(normal).add(point);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 0;
}
