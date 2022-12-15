import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerHunterTest {

    @Test
    void shouldBeReturnHasMaxDamage() {
            PlayerHunter player = new PlayerHunter();
            player.setBaseDamage(150);
            player.setBonusDamagePercent(60f);
            assertEquals(true, player.checkIfHasMaxDamage());
    }

    @Test
    void shouldNotBeReturnHasMaxDamage() {
        PlayerHunter player = new PlayerHunter();
        player.setBaseDamage(150);
        player.setBonusDamagePercent(6f);
        assertEquals(false, player.checkIfHasMaxDamage());
    }

    @Test
    void shouldBeReturnPlayerInfo() {
        PlayerHunter player = new PlayerHunter();
        player.setBaseDamage(150);
        player.setBonusDamagePercent(15f);
        player.setId(01);
        player.setName("Player One");
        assertEquals("Player{id=1, name='Player One', full damage=172.5}", player.getInfo());
    }
}