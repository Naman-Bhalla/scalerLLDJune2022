package designpatterns.behavioural.strategy.after2;


import java.util.HashMap;
import java.util.Map;

public class PathCalculationStrategyRegistry {
    private Map<TransportMode, PathCalculationStrategy> strategies = new HashMap<>();

    public void register(TransportMode mode, PathCalculationStrategy strategy) {
        strategies.put(mode, strategy);
    }

    public PathCalculationStrategy get(TransportMode mode) {
        return strategies.get(mode);
    }
}
