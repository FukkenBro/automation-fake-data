package generators;

import api.Generator;
import models.Currency;

import java.util.Random;

public class CurrencyGenerator<T> implements Generator {

    public Currency generate() {
        return new Currency(randomEnum(models.Currencies.class));
    }

    public static <T extends Enum<?>> T randomEnum(Class<T> currency) {
        Random random = new Random();
        int x = random.nextInt(currency.getEnumConstants().length);
        return currency.getEnumConstants()[x];
    }
}
