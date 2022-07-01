package designpatterns.behavioural.strategy.after1;

public class WalkPathCalculationStrategy implements PathCalculationStrategy {

    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Finding path for walking");
    }
}
