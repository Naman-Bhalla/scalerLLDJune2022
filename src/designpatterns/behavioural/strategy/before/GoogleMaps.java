package designpatterns.behavioural.strategy.before;

public class GoogleMaps {

    public void findPath(String from,
                         String to,
                         TransportMode mode) {
        if (mode == TransportMode.WALK) {
            System.out.println("Finding path for walking");
        } else if (mode == TransportMode.CAR) {
            System.out.println("Finding path for car");
        } else if (mode == TransportMode.BIKE) {
            System.out.println("Finding path for boke");
        }
    }
}
