package orcs_attaks;

import War.IWeapon;

/**
 * Created by Администратор on 19.07.2017.
 */
public class Magic implements IWeapon {
    @Override
    public int Hit() {
        return 0;// подумать переделать снятие улучшения иначе
    }

    @Override
    public String getTypeWeapon() {
        return "Removal improvements";
    }
}
