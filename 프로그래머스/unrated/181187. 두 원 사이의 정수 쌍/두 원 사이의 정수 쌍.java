class Solution {
    public long solution(int r1, int r2) {
        long answer = pointCircle(r2) - minusCircle(r1);
        return answer;
    }

    public static long pointCircle(int r) {
        long sum = 0;
        for (int i = 1; i < r; i++) {
            long x = (long) Math.floor(Math.sqrt(((long) r * r) - ((long) i * i)));
            sum += (long) (x * 2 + 1);
        }
        sum *= 2;
        sum += r * 2 + 3;
        return sum;
    }

    public static long minusCircle(int r) {
        long sum = 0;
        for (int i = 1; i < r; i++) {
            double point = Math.sqrt((long) r * r - (long) i * i);
            int appro = (int) Math.floor(point);
            if (appro < point) {
                sum += (long) (appro * 2 + 1);
            } else {
                sum += (long) (appro * 2 - 1);
            }
        }
        sum *= 2;
        sum += r * 2 - 1;
        return sum;
    }
}