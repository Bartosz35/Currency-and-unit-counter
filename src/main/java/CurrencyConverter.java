/**

 public class CurrencyConverter {

 CurrencyConverter currencyConverter = new BankUaCom(Currency.USD, Currency.EUR);


 currencyConverter.convertCurrency(1f);


 currencyConverter.convertCurrency(1f,Currency.EUR);


 currencyConverter.convertCurrency(1f,Currency.USD,Currency.EUR);


 currencyConverter.convertCurrency(1f,Currency.EUR,Currency.USD);



 }

 */
/**

                         Inny sposób znaleziony w internecie czy warto nim kontynuować ?

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ExchangeRate {

    private double getRate(String from, String to) {
        try {
            URL url = new URL("http://quote.yahoo.com/d/quotes.csv?f=l1&s=" + from + to + "=X");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = reader.readLine();
            if (line.length() > 0) {
                return Double.parseDouble(line);
            }
            reader.close();
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        return 0;
    }

    public double getEuroUsdRate() {
        return getRate("EUR", "USD");
    }

    public double getGoldEuroRate() {
        return getRate("XAU", "EUR");
    }

    public double getSilverEuroRate() {
        return getRate("XAG", "EUR");
    }

    public static void main(String args[]) {
        ExchangeRate exchange = new ExchangeRate();

        double rateSilver = exchange.getSilverEuroRate();
        System.out.println("Silver/Euro: " + rateSilver);

        double rateGold = exchange.getGoldEuroRate();
        System.out.println("Gold/Euro: " + rateGold);

        double rateUsd = exchange.getEuroUsdRate();
        System.out.println("Euro/USD: " + rateUsd);
    }
}

 */

/**

           Test z Scanner i if/else ze stałymi losowymi wartościami

 import java.util.*;
 import java.text.DecimalFormat;

 public class CurrencyConverter {

 public static void main(String[] args) {

 double amount, dollar, pound, code, euro, yen, peso, rupee, marka;

 DecimalFormat f = new DecimalFormat("##.##");

 Scanner sc = new Scanner(System.in);

 System.out.println("Hello to the Currency Converter!");

 System.out.println("Which currency you want to choose ?");

 System.out.println("1:Ruppe \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Peso \t7;Marka ");
 code = sc.nextInt();

 System.out.println("How much do you want to convert ?");
 amount = sc.nextFloat();

 if (code == 1) {

 dollar = amount / 57;
 System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");

 pound = amount / 38;
 System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + " Pound");

 euro = amount / 119;
 System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro");

 yen = amount / 0.96;
 System.out.println("Your " + amount + " Rupee is : " + f.format(yen) + " Yen");

 peso = amount / 15;
 System.out.println("Your " + amount + " Rupee is : " + f.format(ringgit) + " Peso");

 marka = amount / 78;
 System.out.println("Your " + amount + " Rupee is : " + f.format(ringgit) + " Marka");

 } else if (code == 2) {

 rupee = amount * 89;
 System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Ruppes");

 pound = amount * 0.99;
 System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");

 euro = amount * 0.56;
 System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");

 yen = amount * 166.057;
 System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");

 peso = amount * 5.77;
 System.out.println("Your " + amount + " Dollar is : " + f.format(ringgit) + " Peso");

 marka = amount * 16.778;
 System.out.println("Your " + amount + " Dollar is : " + f.format(ringgit) + " Marka");

 } else if (code == 3) {

 rupee = amount * 114;
 System.out.println("Your " + amount + " Pound is : " + f.format(rupee) + " Ruppes");

 dollar = amount * 2.66;
 System.out.println("Your " + amount + " Pound is : " + f.format(dollar) + " Dollar");

 euro = amount * 2.17;
 System.out.println("Your " + amount + " Pound is : " + f.format(euro) + " Euro");

 yen = amount * 127.63;
 System.out.println("Your " + amount + " Pound is : " + f.format(yen) + " Yen");

 peso = amount * 3.299;
 System.out.println("Your " + amount + " Pound is : " + f.format(ringgit) + " Peso");

 marka = amount * 55.99;
 System.out.println("Your " + amount + " Pound is : " + f.format(ringgit) + " Marka");

 } else if (code == 4) {

 rupee = amount * 65;
 System.out.println("Your " + amount + " Euro is : " + f.format(rupee) + " Ruppes");

 dollar = amount * 2.64;
 System.out.println("Your " + amount + " Euro is : " + f.format(dollar) + " Dollar");

 pound = amount * 0.75;
 System.out.println("Your " + amount + " Euro is : " + f.format(pound) + " Pound");

 yen = amount * 145.32;
 System.out.println("Your " + amount + " Euro is : " + f.format(yen) + " Yen");

 peso = amount * 7.88;
 System.out.println("Your " + amount + " Euro is : " + f.format(ringgit) + " Peso");

 marka = amount * 156.17;
 System.out.println("Your " + amount + " Euro is : " + f.format(ringgit) + " Marka");

 } else if (code == 5) {

 rupee = amount * 0.89;
 System.out.println("Your " + amount + " Yen is : " + f.format(rupee) + " Ruppes");

 dollar = amount * 0.078;
 System.out.println("Your " + amount + " Yen is : " + f.format(dollar) + " Dollar");

 pound = amount * 0.15;
 System.out.println("Your " + amount + " Yen is : " + f.format(pound) + " Pound");

 euro = amount * 0.014;
 System.out.println("Your " + amount + " Yen is : " + f.format(euro) + " Euro");

 peso = amount * 0.3337;
 System.out.println("Your " + amount + " Yen is : " + f.format(ringgit) + " Peso");

 marka = amount * 5.77;
 System.out.println("Your " + amount + " Yen is : " + f.format(ringgit) + " Marka");

 } else if (code == 6) {

 rupee = amount * 19.8;
 System.out.println("Your " + amount + " Peso is : " + f.format(rupee) + " Ruppes");

 dollar = amount * 0.569;
 System.out.println("Your " + amount + " Peso is : " + f.format(dollar) + " Dollar");

 pound = amount * 0.458;
 System.out.println("Your " + amount + " Peso is : " + f.format(pound) + " Pound");

 euro = amount * 0.389;
 System.out.println("Your " + amount + " Peso is : " + f.format(euro) + " Euro");

 yen = amount * 29.73;
 System.out.println("Your " + amount + " Peso is : " + f.format(yen) + " Yen");

 marka = amount * 45,567;
 System.out.println("Your " + amount + " Peso is : " + f.format(yen) + " Marka");

 } else if (code == 7) {

 rupee = amount * 567.84;
 System.out.println("Your " + amount + " Marka is : " + f.format(rupee) + " Ruppes");

 dollar = amount * 352.569;
 System.out.println("Your " + amount + " Marka is : " + f.format(dollar) + " Dollar");

 pound = amount * 673.458;
 System.out.println("Your " + amount + " Marka is : " + f.format(pound) + " Pound");

 euro = amount * 786.389;
 System.out.println("Your " + amount + " Marka is : " + f.format(euro) + " Euro");

 yen = amount * 229.733;
 System.out.println("Your " + amount + " Marka is : " + f.format(yen) + " Yen");

 peso = amount * 1259,567;
 System.out.println("Your " + amount + " Marka is : " + f.format(yen) + " Peso");

 } else {
 System.out.println("Invalid input");
 }
 }
 }

 */