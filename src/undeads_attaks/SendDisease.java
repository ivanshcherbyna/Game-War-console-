package undeads_attaks;

import War.IWeapon;

/**
 * Created by Администратор on 19.07.2017.
 */
public class SendDisease implements IWeapon {
    @Override
    public int Hit() {
        return 20;// подумать как реализовать "уменьшение силы противниа на 50% на один ход
    }

    @Override
    public String getTypeWeapon() {
        return "Send disease";
    }
}
