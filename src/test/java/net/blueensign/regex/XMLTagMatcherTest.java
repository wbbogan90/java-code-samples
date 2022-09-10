package net.blueensign.regex;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XMLTagMatcherTest {
    
    private XMLTagMatcher xmlMatcher = new XMLTagMatcher();

    @Test
    void testTagExtraction() {
        List<Tag> tags = xmlMatcher.getOpeningTags("a<b>cd<i>e</i>f<tt>gh</tt>i</b>jk");
        Assertions.assertEquals(3, tags.size());
        Assertions.assertEquals(1, tags.get(0).getIndex());
    }
}
