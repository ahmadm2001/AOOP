package game.entities.sportsman;

import game.enums.Discipline;
import game.enums.Gender;

/**
 * Created by AHMAD MASHAL
 */
public class Snowboarder extends WinterSportsman{
    /**
     * Ctor
     * @param name
     * @param age
     * @param gender
     * @param acceleration
     * @param maxSpeed
     * @param discipline
     */
    public Snowboarder(String name, double age, Gender gender, double acceleration, double maxSpeed, Discipline discipline) {
        super(name, age, gender, acceleration, maxSpeed, discipline);
    }
}
