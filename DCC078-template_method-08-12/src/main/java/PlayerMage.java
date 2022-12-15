public class PlayerMage extends Player{
    private Integer MAX_DAMAGE_MAGE = 400;

    @Override
    public Boolean checkIfHasMaxDamage() {
        if(this.getFullDamage() >= MAX_DAMAGE_MAGE){
            return true;
        } else {
            return false;
        }
    }
}
