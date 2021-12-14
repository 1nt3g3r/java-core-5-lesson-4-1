public abstract class RocketLauncher extends Weapon {
    @Override
    public int getDamage() {
        return 100;
    }

    @Override
    public String getName() {
        return "Rocket Launcher";
    }

    public void reload() {
        System.out.println("Reloading rocket launcher...");
    }
}
