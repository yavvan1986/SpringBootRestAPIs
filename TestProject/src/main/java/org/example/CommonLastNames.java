package org.example;

import java.util.*;

public class CommonLastNames {

    public static List<String> getCommonLastNames(List<Person> people) {
        if (people == null || people.isEmpty()) {
            return Collections.emptyList();
        }

        Map<String, Integer> lastNameCounts = new HashMap<>();

        // Count last names
        for (Person person : people) {
            lastNameCounts.put(
                    person.getLastName(),
                    lastNameCounts.getOrDefault(person.getLastName(), 0) + 1
            );
        }

        // Find the max count
        int maxCount = Collections.max(lastNameCounts.values());

        // Collect all last names with max frequency
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : lastNameCounts.entrySet()) {
            if (entry.getValue() == maxCount) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
}