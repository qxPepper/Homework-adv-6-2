import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int pricePerSquareMeter = 1_000;

        List<LandSale> landSales = new ArrayList<>();
        landSales.add(new LandSale(50, 20, 1_500_000));
        landSales.add(new LandSale(100, 20, 2_000_000));
        landSales.add(new LandSale(75, 20, 1_200_000));

        //
        Function<List<LandSale>, List<LandSale>> myFunction = source -> source.stream()
                .filter(x -> (x.getCost() / x.getLength()) / x.getWidth() >= pricePerSquareMeter)
                .collect(Collectors.toList());

        myFunction.apply(landSales)
                .forEach(System.out::println);

        System.out.println();

        // Но, понравилось больше так!
        landSales.stream()
                .filter(x -> (x.getCost() / x.getLength()) / x.getWidth() >= pricePerSquareMeter)
                .forEach(System.out::println);
    }
}
