package game.entities;

import utilities.Point;

/**
 * Created by AHMAD MASHAL
 */
public interface IMobileEntity {
    /**
     * move the a mobile entity (only on the x axis for this stage of the work)
     * @param friction reduce acceleration by a factor of (1-friction)
     */
    void move(double friction);

    /**
     * @return the location of the entity
     */
    Point getLocation();
}
