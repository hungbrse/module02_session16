package module02_session16.ex11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FootballTeam> teams = new ArrayList<>();
        teams.add(new FootballTeam(1, "Team A", 11, 50));
        teams.add(new FootballTeam(2, "Team B", 12, 70));
        teams.add(new FootballTeam(3, "Team C", 11, 60));
        teams.add(new FootballTeam(4, "Team D", 14, 80));
        teams.add(new FootballTeam(5, "Team E", 10, 90));

        System.out.println("Danh sách đội bóng gốc:");
        printTeams(teams);

        List<FootballTeam> bubbleSortedTeams = new ArrayList<>(teams);
        Sort.bubbleSort(bubbleSortedTeams);
        System.out.println("\nDanh sách đội bóng sau khi sắp xếp bằng Bubble Sort:");
        printTeams(bubbleSortedTeams);

        List<FootballTeam> selectionSortedTeams = new ArrayList<>(teams);
        Sort.selectionSort(selectionSortedTeams);
        System.out.println("\nDanh sách đội bóng sau khi sắp xếp bằng Selection Sort:");
        printTeams(selectionSortedTeams);

        List<FootballTeam> insertionSortedTeams = new ArrayList<>(teams);
        Sort.insertionSort(insertionSortedTeams);
        System.out.println("\nDanh sách đội bóng sau khi sắp xếp bằng Insertion Sort:");
        printTeams(insertionSortedTeams);
    }

    private static void printTeams(List<FootballTeam> teams) {
        for (FootballTeam team : teams) {
            System.out.println(team);
        }
    }

}
