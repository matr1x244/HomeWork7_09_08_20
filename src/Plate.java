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

       /* int proverka = food - cumma;
        if (proverka < 0)
            return true;
        food -= cumma;
            return false;
    }
        */




        /*{
            (food <= 0) {
        } else{
        }
            food -= cumma;
        }
         */




    public void plusFood() { // добавить еды
        this.food += eheJratvi;
        System.out.println("в кормушку добавили еды " + eheJratvi + " т.к. другому коту не хватает еды");
    }

    public boolean proverkaFood(int e) { // проверка еды
        if (food - e > proverbEdy) {
            food -= e;
            return true;
        } else {
            System.out.println("нет еды в кормушке!");
            return false;
        }


        //if(proverbEdy < 0)
                //return (food - e) >= proverbEdy;
        //else
        //return false;
    }
    }

