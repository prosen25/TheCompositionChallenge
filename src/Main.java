//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        SmartKitchen smartKitchen = new SmartKitchen();

        smartKitchen.getBrewMaster().setHasWorkToDo(true);
        smartKitchen.getIceBox().setHasWorkToDo(true);
        smartKitchen.getDishWasher().setHasWorkToDo(true);

        smartKitchen.getBrewMaster().brewCoffee();
        smartKitchen.getIceBox().orderFood();
        smartKitchen.getDishWasher().doDishes();

        SmartKitchen smartKitchen1 = new SmartKitchen();
        smartKitchen1.setKitchenState(true, true, false);
        smartKitchen1.doKitchenWork();
    }
}