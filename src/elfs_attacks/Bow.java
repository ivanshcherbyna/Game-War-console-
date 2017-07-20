package elfs_attacks;

import War.IWeapon;

/**
 * Created by Администратор on 19.07.2017.
 */
public class Bow implements IWeapon {
    @Override
    public int Hit() {
        return 7;
    }

    @Override
    public String getTypeWeapon() {
        return "Bow";
    }
}
