public class PlayerTest {
    public static void main(String[] args) {
        Player hero = new Player(100);
        Player opponent = new Player(50);

        System.out.println("hero.hp = " + hero.getHp());

        System.out.println("hero = " + hero);
        System.out.println("opponent = " + opponent);

        hero.damage(20);

        System.out.println("hero = " + hero);
        System.out.println("opponent = " + opponent);

        hero.damage(100500);

        System.out.println("hero = " + hero);
        System.out.println("opponent = " + opponent);
    }
}
