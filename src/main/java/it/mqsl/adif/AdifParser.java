package it.mqsl.adif;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import static java.util.Collections.emptyList;

public class AdifParser {

    private static final Logger log = LoggerFactory.getLogger(AdifParser.class);

    public static List<Map<String, String>> parse(InputStream is) {
        int b;


        return emptyList();
    }

    private static String next(InputStream is) throws IOException {
        // let's read one byte at a time, like punch card savages
        int c = is.read();

        if (c == -1) {
            return null;
        }

        // discard everything until <
        while (c != '<') {
            c = is.read();

            if (c == -1) {
                return null;
            }
        }

        var buffer = new StringBuffer();
        buffer.append(c);

        do {
            c = is.read();
            buffer.append(c);
        } while (c != '>');

        return buffer.toString();
    }

}
