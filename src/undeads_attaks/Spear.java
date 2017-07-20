package undeads_attaks;

import War.IWeapon;

/**
 * Created by Администратор on 19.07.2017.
 */
public class Spear implements IWeapon {
    @Override
    public int Hit() {
        return 18;
    }

    @Override
    public String getTypeWeapon() {
        return "Spear";
    }
}
