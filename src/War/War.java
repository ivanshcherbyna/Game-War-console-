package War;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Администратор on 19.07.2017.
 */
public class War {
    private Army armyOfGood;
    private Army armyOfDark;
    private Warrior warriorOfGood;
    private Warrior warriorOfDark;
    private boolean isBattleFinished;
    private boolean isWarFinished;
    private History history;
    private boolean isAllowedToChangeWeapon;

    War() {
        startNewWar();
    }
    public ArrayList<Warrior> getGoodArmySoldiers(){ return armyOfGood.getWarriors();}
    public ArrayList<Warrior> getDarkArmySoldiers(){return  armyOfDark.getWarriors();}
    public Army getArmyOfGood(){return armyOfGood;}
    public Army getArmyOfDark(){return armyOfDark;}
    public Warrior getWarriorOfGood(){return warriorOfGood;}
    public Warrior getWarriorOfDark(){return warriorOfDark;}
    public History getHistory(){return history;}
    public boolean isWarFinished(){return isWarFinished;}

    public void startNewWar() {
        history = new History();
        isBattleFinished = true;
        isWarFinished = false;
        isAllowedToChangeWeapon = true;
        Random rnd = new Random();
        
        armyOfGood=createArmy("Good",rnd.nextInt(7)+3);
        armyOfDark=createArmy("Dark",rnd.nextInt(7)+3);
        
                
    }

    private Army createArmy(String armyName, int wariorsNumber) {
        Army army = new Army(armyName);
        Random rnd = new Random();
        for (int i=0;i<wariorsNumber;i++){
            army.getWarriors().add(WarriorFactory.createWarior(rnd.nextInt(3)+1));
            army.getWarriors().get(i).setName(army.getName()+"_"+(i+1));// доработать после доработки СФИТЧа
            army.getWarriors().get(i).setHealth(100);
            army.getWarriors().get(i).setWeapon(WeaponFactory.CreateWeapon(rnd.nextInt(3)+1));// доработать после доработки СФИТЧа
            army.getWarriors().get(i).setArm(ArmFactory.CreateArm(rnd.nextInt(3)+1)); //может убрать Arm & Vests
        }
        return army;
    }
    public void NextTurn(){
        if(!isWarFinished)
        {
            if(isBattleFinished){
                isBattleFinished=false;
                Random rnd= new Random();
                if(rnd.nextInt(2)==0){
                    history.setFirstWarrior(armyOfGood.getWarriors().get(rnd.nextInt(armyOfGood.getWarriors().size())));
                    history.setFirstWarrior(armyOfDark.getWarriors().get(rnd.nextInt(armyOfDark.getWarriors().size())));
                }
                else {
                    history.setFirstWarrior(armyOfDark.getWarriors().get(rnd.nextInt(armyOfDark.getWarriors().size())));
                    history.setFirstWarrior(armyOfGood.getWarriors().get(rnd.nextInt(armyOfGood.getWarriors().size())));
                }
            }
            else {
                Warrior warrior;
                warrior=history.getFirstWarrior();
                history.setFirstWarrior(history.getSecondWarrior());
                history.setSecondWarrior(warrior);

                isBattleFinished=true;
            }
            history.setFirstWeapon(history.getFirstWarrior().getWeapon());
            history.setSecondWeapon(history.getSecondWarrior().getWeapon()); //!!!Exception in thread "main" java.lang.NullPointerException

            history.setDamage(history.getFirstWarrior().GetHit(history.getFirstWarrior().Attack()));


            if (history.getSecondWarrior().getHealth()<=0)
            {
                history.getSecondWarrior().setHealth(0);
                isBattleFinished=true;

                if(isAllowedToChangeWeapon && history.getFirstWeapon().Hit()<history.getSecondWeapon().Hit())
                {
                    history.getFirstWarrior().setWeapon(history.getSecondWeapon());
                    history.setWasWeaponChanged(true);
                }
                else
                {
                    history.setWasWeaponChanged(false);
                }

                if (armyOfGood.getWarriors().contains(history.getSecondWarrior()))
                {armyOfGood.getWarriors().remove(history.getSecondWarrior());}
                else
                if (armyOfDark.getWarriors().contains(history.getSecondWarrior()))
                {armyOfDark.getWarriors().remove(history.getSecondWarrior());}

            }
            else
            {
                history.setWasWeaponChanged(false);
            }

            if (armyOfGood.getWarriors().size()<=0 || armyOfDark.getWarriors().size()<=0)
            {
                isWarFinished=true;
            }
        }
    }
}