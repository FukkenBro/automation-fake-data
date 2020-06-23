package generators;

import api.Generator;
import models.CardHolder;
import models.CreditCard;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class CreditCardGenerator implements Generator {
    public CreditCard generate() throws ParseException {
        Random rng = new Random();
        CardHolder ch = randomEnum(CardHolder.class);
        int[] cardNumber = new int[16];
        for (int i = 0; i < cardNumber.length; i++) {
            if (i < 4) {
                cardNumber[i] = ch.getCode()[i];
            } else {
                cardNumber[i] = rng.nextInt(9);
            }
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/YY");
        LocalDateTime expDate = LocalDateTime.now().plusMonths(rng.nextInt());
        String s = expDate.format(formatter);

        int[] date = new int[4];
        for (int i = 0; i < date.length; i++) {
            if (i < 2) {
                date[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            } else {
                date[i] = Integer.parseInt(String.valueOf(s.charAt(i + 1)));
            }
        }
        int[] cvv = new int[3];
        for (int i = 0; i < 3; i++) {
            cvv[i] = rng.nextInt(9);
        }
        CreditCard card = new CreditCard(ch, cardNumber, date, cvv);
        return card;
    }

    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static <T extends Enum<?>> T randomEnum(Class<T> currency) {
        Random random = new Random();
        int x = random.nextInt(currency.getEnumConstants().length);
        return currency.getEnumConstants()[x];
    }
}
