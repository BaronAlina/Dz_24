package prog;

public class Prog {
    int c;
    int d;

    public String sum(char symbol1, char symbol2, int f0, int[] p, char[] b) {
        if (symbol1 == 42) {
            c = f0 * p[0];
            if (symbol2 == 42) {
                d = c * p[1];
                System.out.println(d);
            }
            if (symbol2 == 43) {
                d = c + p[1];
                System.out.println(d);
            }
            if (symbol2 == 45) {
                d = c - p[1];
                System.out.println(d);
            }
            if (symbol2 == 47) {
                d = c / p[1];
                System.out.println(d);
            }
        }
        if (symbol1 == 47) {
            c = f0 / p[0];
            //System.out.println(f0);
            //System.out.println(p[0]);
            //System.out.println(p[1]);
            //System.out.println(c);
            if (symbol2 == 42) {
                d = c * p[1];
                System.out.println(d);
            }
            if (symbol2 == 43) {
                d = c + p[1];
                System.out.println(d);
            }
            if (symbol2 == 45) {
                d = c - p[1];
                System.out.println(d);
            }
            if (symbol2 == 47) {
                d = c / p[1];
                System.out.println(d);
            }
        }
        if (symbol1 == 43) {
            if (symbol2 == 42) {
                c = p[0] * p[1];
                d = f0 + c;
                System.out.println(d);
            }
            if (symbol2 == 47) {
                c = p[0] / p[1];
                d = f0 + c;
                System.out.println(d);
            }
            if (symbol2 == 43) {
                c = f0 + p[0];
                d = c + p[1];
                System.out.println(d);
            }
            if (symbol2 == 45) {
                c = f0 + p[0];
                d = c - p[1];
                System.out.println(d);
            }
        }
        if (symbol1 == 45) {
            if (symbol2 == 42) {
                c = p[0] * p[1];
                d = f0 - c;
                System.out.println(d);
            }
            if (symbol2 == 47) {
                c = p[0] / p[1];
                d = f0 - c;
                System.out.println(d);
            }
            if (symbol2 == 43) {
                c = f0 - p[0];
                d = c + p[1];
                System.out.println(d);
            }
            if (symbol2 == 45) {
                c = f0 - p[0];
                d = c - p[1];
                System.out.println(d);
            }
        }
        return "";
    }
}