package module02_session16.ex11;

import java.util.List;

public class Sort {

    public static void bubbleSort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (teams.get(j).getScore() < teams.get(j + 1).getScore()) {
                    FootballTeam temp = teams.get(j);
                    teams.set(j, teams.get(j + 1));
                    teams.set(j + 1, temp);
                }
            }
        }
    }

    public static void selectionSort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (teams.get(j).getScore() > teams.get(maxIdx).getScore()) {
                    maxIdx = j;
                }
            }
            FootballTeam temp = teams.get(maxIdx);
            teams.set(maxIdx, teams.get(i));
            teams.set(i, temp);
        }
    }

    public static void insertionSort(List<FootballTeam> teams) {
        int n = teams.size();
        for (int i = 1; i < n; i++) {
            FootballTeam key = teams.get(i);
            int j = i - 1;
            while (j >= 0 && teams.get(j).getScore() < key.getScore()) {
                teams.set(j + 1, teams.get(j));
                j--;
            }
            teams.set(j + 1, key);
        }
    }
}
