package designpatterns.behavioural.strategy.after1;

public class PathCalculationStrategyFactory {

    public PathCalculationStrategy getPathCalculationStrategyForMode(TransportMode mode) {
        if (mode == TransportMode.WALK) {
            return new WalkPathCalculationStrategy();
        } else if (mode == TransportMode.CAR) {
            return new CarPathCalculationStrategy();
        } else if (mode == TransportMode.BIKE) {
            return new BikePathCalculationStrategy();
        }

        return null;
    }
}
