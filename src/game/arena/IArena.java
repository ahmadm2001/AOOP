package game.arena;

import game.entities.IMobileEntity;

/**
 * Created by AHMAD MASHAL
 */
public interface IArena {

    double getFriction();

    boolean isFinished(IMobileEntity mobileEntity);
}
