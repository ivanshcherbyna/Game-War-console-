package War;

/**
 * Created by Администратор on 19.07.2017.
 */
public class WeaponFactory {
    static public IWeapon CreateWeapon(int choise){
        IWeapon weapon;
        switch (choise){
            case 1://1-4 elfs
                weapon=new elfs_attacks.Bow();
                break;
            case 2:
                weapon=new elfs_attacks.Attack();
                break;
            case 3:
                weapon=new elfs_attacks.Magic();
                break;
            case 4:
                weapon=new elfs_attacks.Sword();
                break;
            case 5://5-8 orcs
                weapon=new orcs_attaks.Blade();
                break;
            case 6:
                weapon=new orcs_attaks.Bow();
                break;
            case 7:
                weapon=new orcs_attaks.Cudgel();
                break;
            case 8:
                weapon=new orcs_attaks.Magic();
                break;
            case 9: //9-12 terrans
                weapon=new terran_attaks.Attack();
                 break;
            case 10:
                weapon=new terran_attaks.Crossbow();
                break;
            case 11:
                weapon=new terran_attaks.Magic();
                break;
            case 12:
                weapon=new terran_attaks.Sword();
                break;
            case 13:// 13-17 undeads
                weapon=new undeads_attaks.AttackHunter();
                 break;
            case 14:
                weapon=new undeads_attaks.AttackNecromancer();
                break;
            case 15:
                weapon=new undeads_attaks.Bow();
                break;
            case 16:
                weapon=new undeads_attaks.SendDisease();
                break;
            case 17:
                weapon=new undeads_attaks.Spear();
                break;
            default:
                weapon=null;

        }
        return weapon;
    }
}
