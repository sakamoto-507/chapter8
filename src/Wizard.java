public class Wizard {
    String name;
    int hp;
    Hero h = new Hero();
    public void heal(Hero h) {
        h.hp += 10;
        System.out.println(h.name + "のHPを10回復した！");
    }
    public void run() {
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
}
