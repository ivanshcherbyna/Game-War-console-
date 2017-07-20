package ViewWar;
import War.*;
/**
 * Created by Администратор on 21.07.2017.
 */
public class View {
    public void getShortWarriorState(Warrior warrior) {
        System.out.print(warrior.getName() + "(" + warrior.getWarriorClass() + "/" + warrior.getWeapon().getTypeWeapon() + "(" + warrior.getWeapon().Hit() + ")):\t" + warrior.getHealth());
    }

    public void getShortFormatedWarriorState(Warrior warrior) {
        String state = warrior.getName() + "(" + warrior.getWarriorClass() + "/" + warrior.getWeapon().getTypeWeapon() + "(" + warrior.getWeapon().Hit() + ")):\t" + warrior.getHealth();
        System.out.printf("%-50s%n", state);
    }

    public void getShortArmyStat(Army army) {
        System.out.println("Army: " + army.getName());
        System.out.println();

        Warrior warrior;

        for (int j = 0; j < army.getWarriors().size(); j++) {
            warrior = army.getWarriors().get(j);
            getShortWarriorState(warrior);
            System.out.println();
        }
    }

    public void getShortArmyColumnStat(Army armyOfGood, Army armyOfDark) {
        System.out.println();
        System.out.printf("Army: %-43s Army: %-40s%n", armyOfGood.getName(), armyOfDark.getName());
        System.out.println();

        Warrior warrior;

        String string_I;
        String string_II;

        int j;

        if (armyOfGood.getWarriors().size() >= armyOfDark.getWarriors().size()) {
            j = armyOfGood.getWarriors().size();
        } else {
            j = armyOfDark.getWarriors().size();
        }

        for (int i = 0; i < j; i++) {
            if (armyOfGood.getWarriors().size() > i) {
                warrior = armyOfGood.getWarriors().get(i);
                string_I = warrior.getName() + "(" + warrior.getWarriorClass() + "/" + warrior.getWeapon().getTypeWeapon() + "(" + warrior.getWeapon().Hit() + ")):";
                string_I = String.format("%-40s%s", string_I, warrior.getHealth());

            } else {
                string_I = " ";
            }


            if (armyOfDark.getWarriors().size() > i) {
                warrior = armyOfDark.getWarriors().get(i);
                string_II = warrior.getName() + "(" + warrior.getWarriorClass() + "/" + warrior.getWeapon().getTypeWeapon() + "(" + warrior.getWeapon().Hit() + ")):";
                string_II = String.format("%-40s%s", string_II, warrior.getHealth());
            } else {
                string_II = " ";
            }

            System.out.printf("%-50s%s%n", string_I, string_II);

        }
    }
    public void showBattleResult(History history)
    {
        System.out.println();
        //System.out.println(newWar.getArmyISoldiers().size()+" VS "+newWar.getArmyIISoldiers().size());
        System.out.println(history.getFirstWarrior().getName() +" VS "+ history.getSecondWarrior().getName());

        getShortWarriorState(history.getFirstWarrior());
        System.out.println();
        getShortWarriorState(history.getSecondWarrior());
        System.out.println();

        if (history.isWasWeaponChanged())
        {
            System.out.println(history.getFirstWarrior().getName()+" has changed his " + history.getFirstWeapon().getTypeWeapon()+" on " + history.getSecondWeapon().getTypeWeapon());
            System.out.println();
        }

        System.out.println("*************************************");
        System.out.println();
    }

    public void showWarReport(Army army_I, Army army_II)
    {
        System.out.println("Battle report: ***************************************");
        System.out.println();
        getShortArmyStat(army_I);
        System.out.println();
        getShortArmyStat(army_II);
    }

    public void showTurnResult(int turnNumber, History history)
    {
        System.out.println("******************************************************************************");
        System.out.println("Turn number " + turnNumber);
        System.out.println("******************************************************************************");
        System.out.println(history.getFirstWarrior().getName() +" attacks "+ history.getSecondWarrior().getName() + " and hits him on " + history.getDamage() + " points.");

        if (history.getSecondWarrior().getHealth()<=0)
        {
            System.out.println(history.getSecondWarrior().getName()+" was killed");
        }

        if (history.isWasWeaponChanged())
        {
            System.out.println(history.getFirstWarrior().getName()+" has changed his " + history.getFirstWeapon().getTypeWeapon()+" on " + history.getSecondWeapon().getTypeWeapon());
        }
        System.out.println("******************************************************************************");
        System.out.println();
    }
}


