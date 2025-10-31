//валюта с курсом и методом конвертации
public enum Currency {
    USD("Доллар США", 1.00),
    EUR("Евро",       1.08),
    RUB("Рубль",      0.011),
    CNY("Юань",       0.14);

    private final String title;
    /** курс к USD (сколько USD за 1 единицу валюты) */
    private final double toUsd;

    Currency(String title, double toUsd) {
        this.title = title;
        this.toUsd = toUsd;
    }

    public String getTitle() {
        return title;
    }

    public double toUsd(double amount) {
        return amount * toUsd;
    }

    public double convertTo(Currency target, double amount) {
        // amount (this) -> USD -> target
        double inUsd = this.toUsd(amount);
        return inUsd / target.toUsd;
    }

    @Override
    public String toString() {
        return name() + " (" + title + ")";
    }

    //пример использования
    public static void main(String[] args) {
        double rub = 1000;
        double eur = Currency.RUB.convertTo(Currency.EUR, rub);
        System.out.printf("%.2f %s = %.2f %s%n", rub, Currency.RUB, eur, Currency.EUR);
    }
}

