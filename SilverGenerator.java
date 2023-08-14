package HW2;

public class SilverGenerator extends ItemFabric{
    @Override
    public iGameItem createItem() {
        System.out.println("Вам сундук с:");
        return new SilverReward();
    }
}
