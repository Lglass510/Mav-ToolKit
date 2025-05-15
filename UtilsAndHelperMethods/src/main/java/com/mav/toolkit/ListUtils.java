package com.mav.toolkit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class ListUtils {

        // 🧹 Remove empty or null strings from a list
        public static List<String> cleanList(List<String> list) {
            List<String> cleaned = new ArrayList<>();
            for (String item : list) {
                if (item != null && !item.trim().isEmpty()) {
                    cleaned.add(item);
                }
            }
            return cleaned;
        }

        // 🧑‍🍳 Capitalize first letter of every item in the list
        public static List<String> titleCaseList(List<String> list) {
            List<String> result = new ArrayList<>();
            for (String s : list) {
                result.add(titleCase(s));
            }
            return result;
        }

        // 🧠 Generic: Get first item or null
        public static <T> T firstOrNull(List<T> list) {
            return (list != null && !list.isEmpty()) ? list.get(0) : null;
        }

        // 🧠 Generic: Get last item or null
        public static <T> T lastOrNull(List<T> list) {
            return (list != null && !list.isEmpty()) ? list.get(list.size() - 1) : null;
        }

        // 🔁 Reverse the list
        public static <T> List<T> reversed(List<T> list) {
            List<T> copy = new ArrayList<>(list);
            Collections.reverse(copy);
            return copy;
        }

        // 👑 Helper used above
        private static String titleCase(String text) {
            if (text == null || text.isEmpty()) return text;
            return Character.toUpperCase(text.charAt(0)) + text.substring(1).toLowerCase();
        }
    }




