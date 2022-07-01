package designpatterns.behavioural.strategy.after2;

public class BikePathCalculationStrategy implements PathCalculationStrategy {
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Finding path for boke");
    }
}
