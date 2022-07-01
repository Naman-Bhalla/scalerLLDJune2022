package designpatterns.behavioural.strategy.after2;

public class Main {

    public static void main(String[] args) {
        PathCalculationStrategyRegistry pathCalculationStrategyRegistry = new PathCalculationStrategyRegistry();
        pathCalculationStrategyRegistry.register(
                TransportMode.CAR, new CarPathCalculationStrategy()
        );
        pathCalculationStrategyRegistry.register(
                TransportMode.BIKE, new BikePathCalculationStrategy()
        );
        pathCalculationStrategyRegistry.register(
                TransportMode.WALK, new WalkPathCalculationStrategy()
        );

        GoogleMaps googleMaps = new GoogleMaps(pathCalculationStrategyRegistry);

        // // /findPath?from={}&to={}&mode=CAR
        googleMaps.findPath("Delhi", "Lucknow", TransportMode.CAR);
    }
}
