package generators;

import api.Generator;
import java.awt.*;
import java.util.Random;

public class ColorGenerator implements Generator {
    public Color generate() {
        Random rand = new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        return new Color(r, g, b);
    }
}
