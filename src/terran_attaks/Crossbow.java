package terran_attaks;

import War.IWeapon;

/**
 * Created by Администратор on 19.07.2017.
 */
public class Crossbow implements IWeapon {
    @Override
    public int Hit() {
        return 5;
    }

    @Override
    public String getTypeWeapon() {
        return "Crossbow";
    }
}
