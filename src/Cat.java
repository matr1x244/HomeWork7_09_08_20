public class Cat {

    private String name;
    private int appetit;
    private boolean satiety;//сытость

    public String getName() { // имя
        return name;
    }

    public int getAppetit() { // апетит
        return appetit;
    }

    public Cat(String name, int appetit) { // конструктор
        this.name = name;
        this.appetit = appetit;
        this.satiety = true; // !!!!!!!!!!!!!!!!!!!!
    }

    public void eat(Plate plate) { // еда в кормушке !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        plate.minusFood(appetit);
        }

    }


