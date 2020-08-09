public class Plate {

    private int food; // еда
    private int eheJratvi = 20; // добавить еще еды значение
    private int proverbEdy = 0;

    public int getFood() { // добавь еды
        return food; // верни еду
    }

    public Plate(int food) { // еда
        this.food = food; //передаем еду
    }

    public boolean minusFood(int cumma) { // убавить еды !! //// !!!!!!!!!!!!
        if (food - cumma >= 0) {
            food -= cumma;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                ", eheJratvi=" + eheJratvi +
                ", proverbEdy=" + proverbEdy +
                '}';
    }

    public void plusFood() { // добавить еды
        this.food += eheJratvi;
        System.out.println("в кормушку добавили еды " + eheJratvi + " т.к. другому коту не хватает еды");
    }

    public boolean proverkaFood(int e) { // проверка еды
        if (food - e >= 0) {
            food -= e;
            return true;
        } else {
            System.out.println("нет еды в кормушке! чтобы полностью поесть");
            return false;
        }
    }

}

