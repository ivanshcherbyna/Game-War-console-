package War;

import java.util.ArrayList;

/**
 * Created by Администратор on 19.07.2017.
 */
public class Army {
    private String name;
    private ArrayList<Warrior> warriors;
    private String commandGroup;

    Army(String _name){
        setName(_name);
        setWarriors(new ArrayList<Warrior>());
    }
    public String getName(){return name;}
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Warrior> getWarriors(){return warriors;}
    public void setWarriors(ArrayList<Warrior> warriors) {
        this.warriors = warriors;
    }

    public String getCommandGroup(){return commandGroup;}
    public void setCommandGroup(String commandGroup){this.commandGroup=commandGroup;}
}
