package War;

/**
 * Created by Администратор on 19.07.2017.
 */
public class WarriorFactory {
    public static Warrior createWarior(int num){//in future remake switch to (String nameTypeWarior)
        Warrior warrior;
        switch (num){
            case 1: //1-3 Elfs
                warrior =new elfs.Mage();
                break;
            case 2:
                warrior =new elfs.Archer();
                break;
            case 3:
                warrior =new elfs.Elf();
                break;
            case 4://4-6 Orks
                warrior =new orcs.Shaman();
                break;
            case 5:
                warrior =new orcs.Archer();
                break;
            case 6:
                warrior =new orcs.Goblin();
                break;
            case 7://7-9 Terrans
                warrior =new terrans.Mage();
                break;
            case 8:
                warrior =new terrans.Crossbowman();
                break;
            case 9:
                warrior =new terrans.Soldier();
                break;
            case 10:// 10-12 Undeads
                warrior =new undeads.Hunter();
                break;
            case 11:
                warrior =new undeads.Necromancer();
                break;
            case 12:
                warrior =new undeads.Zombie();
                break;
            default:
                warrior =null;
        }
        return warrior;
    }

}
