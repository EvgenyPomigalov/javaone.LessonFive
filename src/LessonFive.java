public class LessonFive {
    public static void main(String[] args) {
        RegularCat c1 = new RegularCat("Васька", "Серый", (byte) 3);
        RegularDog d1 = new RegularDog("Тузик", "Белый", (byte) 3);
        RegularCat c2 = new RegularCat("Рыжий", "Рыжий", (byte) 2);
        RegularDog d2 = new RegularDog("Бим", "Черный", (byte) 5);
        RegularCat c3 = new RegularCat("Мурзик", "Серый", (byte) 8);
        RegularDog d3 = new RegularDog("Рекс", "Черный", (byte) 10);
        RegularCat c4 = new RegularCat("Мурка", "В полоску", (byte) 4);
        RegularDog d4 = new RegularDog("Шарик", "В крапинку", (byte) 10);
        Animal[] zoo = {c1, d1, c2, d2, c3, d3, c4, d4};
        float[] arrJump = {0.5f, 2f, 5f, 0.2f};
        int[] arrRun = {50, 150, 200, 300, 500, 700, 800};
        int[] arrSwim = {1, 3, 4, 5, 10, 12};
        for (int i = 0; i < zoo.length; i++) {
            for (int j = 0; j < arrJump.length; j++) System.out.println(zoo[i].jump(arrJump[j]));
            for (int j = 0; j < arrRun.length; j++) System.out.println(zoo[i].run(arrRun[j]));
            for (int j = 0; j < arrSwim.length; j++) System.out.println(zoo[i].swim(arrSwim[j]));
        }
    }
}
