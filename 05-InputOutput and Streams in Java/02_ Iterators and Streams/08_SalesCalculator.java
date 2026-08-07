import java.util.List;

/*
 * Stream pipeline: map() increases each sale amount by 10% (tax),
 * then reduce() folds all the resulting values into a single total.
 * reduce(identity, accumulator) starts from an initial value (0.0)
 * and combines it with each stream element in turn using the given
 * (sum, value) -> sum + value function.
 */
public class 08_SalesCalculator {
    public static void main(String[] args) {
        List<Double> sales = List.of(200.0, 450.0, 700.0, 150.0, 300.0);

        double totalSalesAfterTax = sales.stream()
            // Apply 10% tax increase to each transaction
            .map(amount -> amount * 1.1)
            // Sum up all the updated sales values.
            .reduce(0.0, (sum, value) -> sum + value);

        System.out.println("Total Sales After Tax: $" + totalSalesAfterTax);
    }
}