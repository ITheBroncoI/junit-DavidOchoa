public class Squats {

    public static String solve(int n, String input) {
        StringBuilder output = new StringBuilder();
        int countX = 0;
        for (char c : input.toCharArray()) {
            if (c == 'X') {
                countX++;
            }
        }

        int target = n / 2;
        int changes = Math.abs(target - countX);

        StringBuilder result = new StringBuilder(input);
        if (countX > target) {
            for (int i = 0; i < n && countX > target; i++) {
                if (result.charAt(i) == 'X') {
                    result.setCharAt(i, 'x');
                    countX--;
                }
            }
        } else {
            for (int i = 0; i < n && countX < target; i++) {
                if (result.charAt(i) == 'x') {
                    result.setCharAt(i, 'X');
                    countX++;
                }
            }
        }

        output.append(changes).append("\n").append(result.toString());
        return output.toString();
    }
}

