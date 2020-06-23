package generators;

import api.Generator;

import java.util.Random;

public class EmailGenerator implements Generator {
    public String generate() {
        String[] firstNames = new String[]{"alex", "ben", "cindy", "daniel", "ellen", "frank", "ginny", "hugo", "iren", "jackob"};
        String[] lastNames = new String[]{"villenouve", "wolfe", "sinatra", "baylay", "smith", "doe", "romanoff"};
        String[] emailDomains = new String[]{"gmail.com", "mail.ru", "i.ua", "yahoo.com", "mail.ua", "list.ru", "mail.bk"};
        Random rng = new Random();
        int method = rng.nextInt(3);
        StringBuilder sb = new StringBuilder("");
        switch (method) {
            case 0:
                sb.append(firstNames[rng.nextInt(firstNames.length)]).append(".")
                        .append(lastNames[rng.nextInt(lastNames.length)]).append("@").append(emailDomains[rng.nextInt(emailDomains.length)]);
                break;
            case 1:
                sb.append(lastNames[rng.nextInt(lastNames.length)]).append(".")
                        .append(firstNames[rng.nextInt(firstNames.length)]).append("@").append(emailDomains[rng.nextInt(emailDomains.length)]);
                break;
            case 2:
                sb.append(firstNames[rng.nextInt(firstNames.length)])
                        .append(rng.nextInt(98) + 1).append("@").append(emailDomains[rng.nextInt(emailDomains.length)]);
                break;
            case 3:
                sb.append(lastNames[rng.nextInt(lastNames.length)]).append(rng.nextInt(120) + 1900).append("@").append(emailDomains[rng.nextInt(emailDomains.length)]);
                break;
        }
        return sb.toString();
    }
}
