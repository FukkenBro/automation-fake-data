import generators.*;
import models.CreditCard;
import models.Currency;

import java.awt.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FakeData {

    private static ColorGenerator color = new ColorGenerator();
    private static CreditCardGenerator creditCard = new CreditCardGenerator();
    private static CurrencyGenerator currency = new CurrencyGenerator();
    private static EmailGenerator email = new EmailGenerator();


    public static void main(String[] args) throws ParseException {
        List<Color> colors = new ArrayList<Color>();
        List<String> emails = new ArrayList<String>();
        List<Currency> currencies = new ArrayList<Currency>();
        List<CreditCard> cards = new ArrayList<CreditCard>();
        for (int i = 0; i < 100; i++) {
            colors.add(color.generate());
            emails.add(email.generate());
            currencies.add(currency.generate());
            cards.add(creditCard.generate());
        }
        System.out.println(colors);
        System.out.println(emails);
        System.out.println(currencies);
        System.out.println(cards);
    }
}
