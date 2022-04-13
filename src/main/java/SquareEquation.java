
public class SquareEquation {

    public Solution solve(int a, int b, int c) {
        int d = b*b - 4*a*a;
        if (d<0)
            return null;
        Solution r;
        r = new Solution();
        r.x1 = (-b + Math.sqrt(d)) / (2*a);
        r.x2 = (-b - Math.sqrt(d)) / (2*a);
        return r;
    }
}
