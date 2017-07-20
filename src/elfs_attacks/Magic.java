package elfs_attacks;
import War.*;
/**
 * Created by Администратор on 19.07.2017.
 */
public class Magic implements IWeapon {
    @Override
    public int Hit() {
        return 10;
    }

    @Override
    public String getTypeWeapon() {
        return "Magic";
    }
}
