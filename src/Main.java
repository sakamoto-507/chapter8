public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero();
        h1.name = "ミナト";
        System.out.println("勇者" + h1.name + "を生み出しました！");
        /*Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
        h1.sword = s;
        System.out.println("現在の武器は" + h1.sword.name);*/

        Hero h2 = new Hero();
        h2.name = "アサカ";

        Hero h3 = new Hero();

        Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 50;

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';
//行動
        h1.slip();
        h1.attack();
        h1.slip();
        h1.slip();
        h1.sit(20);
        h1.slip();
        w.heal(h1);
        w.heal(h2);
        w.heal(h2);
        m1.run();
        h1.run();
        h2.run();
        h3.run();
        w.run();
    }
}