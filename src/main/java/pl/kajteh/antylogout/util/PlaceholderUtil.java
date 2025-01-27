package pl.kajteh.antylogout.util;

import java.util.Map;

public class PlaceholderUtil {

    public static String replacePlaceholder(String content, Map<String, Object> replacements) {
        for (Map.Entry<String, Object> entry : replacements.entrySet()) {
            content = content.replace(String.format("{%s}", entry.getKey()), entry.getValue().toString());
        }
        return content;
    }
}
