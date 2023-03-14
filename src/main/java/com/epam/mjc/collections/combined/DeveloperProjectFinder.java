package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectList = new ArrayList<>();
        projects.forEach((k, v) -> {
            if (v != null && v.contains(developer)) {
                projectList.add(k);
            }
        });

        Comparator<String> projectNameComparator = Comparator.comparingInt(String::length).reversed().
                thenComparing(Comparator.reverseOrder());
        projectList.sort(projectNameComparator);
        return projectList;
    }
}
