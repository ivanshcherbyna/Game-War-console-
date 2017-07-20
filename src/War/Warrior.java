package War;

/**
 * Created by Администратор on 19.07.2017.
 */
public abstract class Warrior {
    protected String name;
    protected  String wariorType;
    protected IWeapon weapon;
    protected  IArm arm;
    protected int health;

    public abstract int Attack();
    public abstract int GetHit(int attack);

    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public IWeapon getWeapon(){return weapon;}
    public void setWeapon (IWeapon weapon){this.weapon=weapon;}
    public IArm getArm(){return arm;}
    public void setArm(IArm arm){this.arm=arm;}
    public int getHealth(){return health;}
    public void setHealth(int health){this.health=health;}
    public String getWarriorClass(){return wariorType;}
}
