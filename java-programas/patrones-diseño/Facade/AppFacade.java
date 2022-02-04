package Facade;

public class AppFacade {
    public static void main(String[] args) {
        CheckFacade client1 = new CheckFacade();
        client1.buscar("02/07/2018","08/07/2018","Lima","Cancún");

        CheckFacade client2 = new CheckFacade();
        client2.buscar("02/07/2018","08/07/2018","Lima","Quito");
    }
}
