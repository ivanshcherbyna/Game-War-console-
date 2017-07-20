package War;

/**
 * Created by Администратор on 20.07.2017.
 */
public class History {
    private Warrior firstWarrior;
    private Warrior secondWarrior;
    private int damage;
    private boolean wasWeaponChanged;
    private IWeapon firstWeapon;
    private IWeapon secondWeapon;
    public History(){
        firstWarrior =null;
        secondWarrior=null;
        damage=0;
        wasWeaponChanged=false;
        firstWeapon=null;
        secondWeapon=null;
    }
    public Warrior getFirstWarrior(){return firstWarrior;}
    public void setFirstWarrior(Warrior firstWarrior){this.firstWarrior=firstWarrior;}

    public Warrior getSecondWarrior() {
        return secondWarrior;
    }
    public void setSecondWarrior(Warrior secondWarrior) {
        this.secondWarrior = secondWarrior;
    }

    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isWasWeaponChanged() {
        return wasWeaponChanged;
    }

    public void setWasWeaponChanged(boolean wasWeaponChanged) {
        this.wasWeaponChanged = wasWeaponChanged;
    }

    public IWeapon getFirstWeapon() {
        return firstWeapon;
    }
    public void setFirstWeapon(IWeapon firstWeapon) {
        this.firstWeapon = firstWeapon;
    }

    public IWeapon getSecondWeapon() {
        return secondWeapon;
    }
    public void setSecondWeapon(IWeapon secondWeapon) {
        this.secondWeapon = secondWeapon;
    }
}
