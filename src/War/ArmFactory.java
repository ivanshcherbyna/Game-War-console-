package War;

/**
 * Created by Администратор on 19.07.2017.
 */
public class ArmFactory {
    public static IArm CreateArm(int choise){
        IArm arm;
        switch (choise){
            case 1:
                arm= new Vest_I();
                break;
            case 2:
                arm=new Vest_II();
                break;
            case 3:
                arm=new Vest_III();
                break;
                default:
                    arm=null;
                    break;
        }
        return arm;
    }
}
