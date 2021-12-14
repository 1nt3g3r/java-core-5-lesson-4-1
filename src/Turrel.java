public class Turrel {
    public void attach(RocketLauncher rocketLauncher) {
        rocketLauncher.reload();
        System.out.println("Rocket launcher attached, damage now: " + rocketLauncher.getDamage());
    }

    public static void main(String[] args) {
        Turrel turrel = new Turrel();

        RocketLauncher launcher = new MegaRocketLauncher();

        turrel.attach(launcher);
    }
}
