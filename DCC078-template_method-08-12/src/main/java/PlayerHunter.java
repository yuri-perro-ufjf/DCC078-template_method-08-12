public class PlayerHunter extends Player{
    private Integer MAX_DAMAGE_HUNTER = 200;

    @Override
    public Boolean checkIfHasMaxDamage() {
        if(this.getFullDamage() >= MAX_DAMAGE_HUNTER){
            return true;
        } else {
            return false;
        }
    }
}
