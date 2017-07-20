package terran_attaks;

import War.IWeapon;

/**
 * Created by Администратор on 19.07.2017.
 */
public class Magic implements IWeapon {
    @Override
    public int Hit() {
        return 4;
    }

    @Override
    public String getTypeWeapon() {
        return "Magic";
    }
}
