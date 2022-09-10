package net.blueensign.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class XMLTagMatcher {

    private static final Pattern OPENING_TAG = Pattern.compile("<[a-zA-Z0-9]+>");
    private final PatternMatcher patternMatcher = new PatternMatcher(OPENING_TAG);

    public XMLTagMatcher() {
    }

    public List<Tag> getOpeningTags(String textWithTags){
        List<Tag> tags = new ArrayList<>();
        for (MatchResult result:patternMatcher.allMatches(textWithTags)) {
            tags.add(new Tag(result.group(), result.start()));
        }
        return tags;
    }
}
