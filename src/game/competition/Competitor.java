package game.competition;

import game.arena.IArena;
import game.entities.IMobileEntity;

/**
 * Created by AHMAD MASHAL
 */
public interface Competitor extends IMobileEntity {
    /**
     * start the race for this competitor
     */
    void initRace();
}
