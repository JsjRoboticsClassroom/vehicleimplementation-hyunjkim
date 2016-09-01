package nyc.c4q.abassawo;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Bicycle(7.7);
        vehicle.applyBrakes(9);

        vehicle = new AstonMartin(0.0);
        vehicle.applyBrakes(10);
        vehicle.speedUp(40);



//        vehicle = new AstonMartin();
//        vehicle.applyBrakes();
//        CardDeck deck = null;
//
//        while(deck != null){
//            //do stuff
//            deck = new CardDeck();
//        }
////        do{
////            deck = new CardDeck();
////        }while(deck == null);
////
//        System.out.println(deck);
    }


}
