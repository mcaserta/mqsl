package it.mqsl.adif;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class AdifParserTest {

    @Test
    void parse() {
        var s = getClass().getClassLoader().getResourceAsStream("20210713132100-ik0zsn-jtdx.adi");
        var records = AdifParser.parse(s);
        assertEquals(1101, records.size());
        assertEquals("DF2WF", records.get(0).get("call"));
        assertEquals("EA1BA", records.get(1100).get("call"));
    }

}
