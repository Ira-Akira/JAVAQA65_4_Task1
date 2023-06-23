public class BonusMilesService {
    public int calculate(int price) {
        int bonusPrice = 20;
        int bonusMile = price / bonusPrice;
        return bonusMile;
    }
}
