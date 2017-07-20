package terrans;

import War.Warrior;

/**
 * Created by Администратор on 19.07.2017.
 */
public class Mage extends Warrior {
    public Mage()
    {super();
        wariorType="Necromancer";
    }
    @Override
    public int Attack() {
        return getWeapon().Hit();
    }

    @Override
    public int GetHit(int attack) {
        int damage;
        if (attack<=getArm().Defence())
        {
            damage=0;
        }
        else
        {
            damage=attack-getArm().Defence();
        }

        setHealth(getHealth()- damage);
        return damage;

    }
}
