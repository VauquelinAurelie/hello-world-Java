public class Main {
    int oldPremises = 34;
    int truck = 0 ;
    int newPremises = 0;

    public static void main(String[] args) {
        Main main = new Main(); // Créer une instance de la classe Main
        main.moving(); // Appeler la méthode moving à partir de l'instance créée
    }

    public void moving() {
        while (oldPremises > 0) {
            while (truck < 9 && truck >= 0 && oldPremises > 0){
                truck = truck + 1;
                oldPremises = oldPremises - 1;
                System.out.println("ancien local " + oldPremises);
            }
            System.out.println("un voyage de " + truck + " cartons");
            while (truck > 0){
                truck = truck - 1;
                newPremises = newPremises + 1;
                System.out.println("nouveau local " + newPremises);
            }
        }
    }
}