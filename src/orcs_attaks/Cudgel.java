package orcs_attaks;

import War.IWeapon;

/**
 * Created by Администратор on 19.07.2017.
 */
public class Cudgel implements IWeapon {
    @Override
    public int Hit() {
        return 20;
    }

    @Override
    public String getTypeWeapon() {
        return "Cudlel";
    }
}
