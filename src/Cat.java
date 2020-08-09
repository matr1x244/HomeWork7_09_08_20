public class Cat {

    private String name;
    private final int appetit;
    private boolean satiety; //сытость

    public String getName() { // имя
        return name;
    }

    public int getAppetit() { // апетит
        return appetit;
    }

    public boolean isSatiety() { //сытость возвращает
        return satiety;
    }

    public Cat(String name, int appetit) { // конструктор
        this.name = name;
        this.appetit = appetit;
    }

    public void eat(Plate plate) { // еда в кормушке !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        plate.minusFood(appetit);
        if (!satiety) {
            if (plate.minusFood(appetit)) {
                satiety = true;
            } else {
                //System.out.println(name + " не наелся!");
            }
            satiety = false;
        } else {
            System.out.println("кот сыт");
        }

        }

    }


