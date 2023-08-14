package HW2;

public class DiamondGenerator extends ItemFabric{
    @Override
    public iGameItem createItem() {
        System.out.println("В этом сундуке:");
        return new DiamondReward();
        
    }
}

