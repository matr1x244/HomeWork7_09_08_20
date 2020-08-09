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

    public void minusFood(int cumma) { // убавить еды !!
        if (food < 0) {
        } else {
        }
        food -= cumma;
    }

    public void plusFood() { // добавить еды
        this.food += eheJratvi;
        System.out.println("в кормушку добавили еды " + eheJratvi + " т.к. другому коту не хватает еды");
    }

    public boolean proverkaFood(int E) { // проверка еды
            //if(proverbEdy < 0)
                return (food - E) >= proverbEdy;
        //else
        //return false;
    }
    }

