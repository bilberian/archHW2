package HW2;

public class GoldGenerator extends ItemFabric{
    @Override
    public iGameItem createItem() {
        System.out.println("У вас сундук с:");
        return new GoldReward();
    }
}
