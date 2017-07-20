package orcs_attaks;

import War.IWeapon;

/**
 * Created by Администратор on 19.07.2017.
 */
public class Blade implements IWeapon {
    @Override
    public int Hit() {
        return 2;
    }

    @Override
    public String getTypeWeapon() {
        return "Blade";
    }
}
