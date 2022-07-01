package designpatterns.behavioural.strategy.after1;

public class GoogleMaps {
    private PathCalculationStrategyFactory pathCalculationStrategyFactory = new PathCalculationStrategyFactory();

    public void findPath(String from,
                         String to,
                         TransportMode mode) {
        PathCalculationStrategy pathCalculationStrategy
                = pathCalculationStrategyFactory.getPathCalculationStrategyForMode(mode);

        pathCalculationStrategy.calculatePath(from, to);
    }
}
