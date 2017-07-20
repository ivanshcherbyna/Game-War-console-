package War;
import ViewWar.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello War Game!");
        War newWar = new War();
        View view= new View();

        newWar.startNewWar();

        int i=0;
        try {
            while (!newWar.isWarFinished()) {
                i++;
                view.getShortArmyColumnStat(newWar.getArmyOfGood(), newWar.getArmyOfDark());

                newWar.NextTurn();
                view.showTurnResult(i, newWar.getHistory());

            }
            view.showWarReport(newWar.getArmyOfGood(), newWar.getArmyOfDark());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
