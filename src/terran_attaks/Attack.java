package terran_attaks;

import War.IWeapon;

/**
 * Created by Администратор on 19.07.2017.
 */
public class Attack implements IWeapon {
    @Override
    public int Hit() {
        return 3;
    }

    @Override
    public String getTypeWeapon() {
        return "AttackNecromancer";
    }
}
