package undeads_attaks;

import War.IWeapon;

/**
 * Created by Администратор on 19.07.2017.
 */
public class AttackHunter implements IWeapon {
    @Override
    public int Hit() {
        return 2;
    }

    @Override
    public String getTypeWeapon() {
        return "Attack";
    }
}
