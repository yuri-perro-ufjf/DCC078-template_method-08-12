import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerMageTest {

    @Test
    void shouldBeReturnHasMaxDamage() {
        PlayerMage player = new PlayerMage();
        player.setBaseDamage(290);
        player.setBonusDamagePercent(80f);
        assertEquals(true, player.checkIfHasMaxDamage());
    }

    @Test
    void shouldNotBeReturnHasMaxDamage() {
        PlayerMage player = new PlayerMage();
        player.setBaseDamage(200);
        player.setBonusDamagePercent(6f);
        assertEquals(false, player.checkIfHasMaxDamage());
    }

    @Test
    void shouldBeReturnPlayerInfo() {
        PlayerMage player = new PlayerMage();
        player.setBaseDamage(200);
        player.setBonusDamagePercent(15f);
        player.setId(01);
        player.setName("Player One");
        assertEquals("Player{id=1, name='Player One', full damage=230.0}", player.getInfo());
    }
}