public class Solution {
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        Integer[][] memo = new Integer[locations.length][202];
        return dfs(locations, start, finish, fuel, memo);
    }

    private int dfs(int[] locations, int start, int finish, int fuel, Integer[][] memo) {
        int modulo = 1_000_000_007;
        if (fuel < 0) return 0;
        if (memo[start][fuel] != null) {
            return memo[start][fuel];
        }
        if (start == finish) {
            if (fuel == 0) {
                return 1;
            } else {
                int subAnswer = 0;
                for (int i = 0; i < locations.length; i++) {
                    if (i != start) {
                        subAnswer = (subAnswer + dfs(locations, i, finish, fuel - Math.abs(locations[start] - locations[i]), memo)) % modulo;
                    }
                }
                return 1 + subAnswer;
            }
        }
        int answer = 0;

        for (int i = 0; i < locations.length; i++) {
            if (i != start) {
                answer = (answer + dfs(locations, i, finish, fuel - Math.abs(locations[start] - locations[i]), memo)) % modulo;
            }
        }
        memo[start][fuel] = answer % modulo;
        return answer % modulo;
    }
}
