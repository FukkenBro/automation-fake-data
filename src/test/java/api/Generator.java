package api;

import java.text.ParseException;

public interface Generator<T> {
    T generate() throws ParseException;
}
