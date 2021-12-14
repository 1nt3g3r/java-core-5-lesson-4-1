public class WeaponTests {
    public static void main(String[] args) {
        Player player = new Player(100);

        Weapon[] weapons = {
                new MegaRocketLauncher(),
                new Shotgun()
        };

        for (Weapon weapon : weapons) {
            player.useWeapon(weapon);
        }
    }
}
