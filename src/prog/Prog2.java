package prog;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] b = a.toCharArray();
        String[] f;
        for (int i = 0; i < b.length; i++) {
            //int[] p = new int[3];
            Prog pr = new Prog();
            if (b[i] == 42) {
                f = a.split("\\*");
                char symbol1 = '*';
                if (f.length == 2) {
                    int f0 = Integer.parseInt(f[0]);
                    char[] d = f[1].toCharArray();
                    for (int e = 0; e < d.length; e++) {
                        if (d[e] == 43) {
                            char symbol2 = '+';
                            String[] s = f[1].split("\\+");
                            int[] p = new int[2];
                            for (int g = 0; g < s.length; g++) {
                                p[g] = Integer.parseInt(s[g]);
                            }
                            System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                        }
                        if (d[e] == 45) {
                            char symbol2 = '-';
                            String[] s = f[1].split("-");
                            int[] p = new int[2];
                            for (int g = 0; g < s.length; g++) {
                                p[g] = Integer.parseInt(s[g]);
                            }
                            System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                        }
                        if (d[e] == 47) {
                            char symbol2 = '/';
                            String[] s = f[1].split("/");
                            int[] p = new int[2];
                            for (int g = 0; g < s.length; g++) {
                                p[g] = Integer.parseInt(s[g]);
                            }
                            System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                        }
                    }
                } else {
                    for (int i1 = 0; i1 < f.length; i1++) {
                        int[] p = new int[2];
                        char symbol2 = '*';
                        int f0 = Integer.parseInt(f[0]);
                        p[0] = Integer.parseInt(f[1]);
                        p[1] = Integer.parseInt(f[2]);
                        System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                        /*int[] p=new int[2];
                        char symbol2 = '*';
                        int f0 = Integer.parseInt(f[0]);
                        for (int g = 1; g < f.length; g++) {
                            p[i1] =Integer.parseInt(f[g]);
                        }
                        System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                    }*/
                    }
                    break;
                }
            }
            if (b[i] == 43) {
                f = a.split("\\+");
                char symbol1 = '+';
                if (f.length == 2) {
                    int f0 = Integer.parseInt(f[0]);
                    char[] d = f[1].toCharArray();
                    for (int e = 0; e < d.length; e++) {
                        if (d[e] == 42) {
                            char symbol2 = '*';
                            String[] s = f[1].split("\\*");
                            int[] p = new int[2];
                            for (int g = 0; g < s.length; g++) {
                                p[g] = Integer.parseInt(s[g]);
                            }
                            System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                        }
                        if (d[e] == 45) {
                            char symbol2 = '-';
                            String[] s = f[1].split("-");
                            int[] p = new int[2];
                            for (int g = 0; g < s.length; g++) {
                                p[g] = Integer.parseInt(s[g]);
                            }
                            System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                        }
                        if (d[e] == 47) {
                            char symbol2 = '/';
                            String[] s = f[1].split("/");
                            int[] p = new int[2];
                            for (int g = 0; g < s.length; g++) {
                                p[g] = Integer.parseInt(s[g]);
                            }
                            System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                        }
                    }
                } else {
                    for (int i1 = 0; i1 < f.length; i1++) {
                        int[] p = new int[2];
                        char symbol2 = '+';
                        int f0 = Integer.parseInt(f[0]);
                        p[0] = Integer.parseInt(f[1]);
                        p[1] = Integer.parseInt(f[2]);
                        System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                        /*int[] p=new int[2];
                        char symbol2 = '+';
                        int f0 = Integer.parseInt(f[0]);
                        for (int g = 1; g < f.length; g++) {
                            p[i1] =Integer.parseInt(f[g]);
                        }
                        System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                    }*/
                    }
                }
                break;
            }
                if (b[i] == 45) {
                    f = a.split("-");
                    char symbol1 = '-';
                    if (f.length == 2) {
                        int f0 = Integer.parseInt(f[0]);
                        char[] d = f[1].toCharArray();
                        for (int e = 0; e < d.length; e++) {
                            if (d[e] == 42) {
                                char symbol2 = '*';
                                String[] s = f[1].split("\\*");
                                int[] p = new int[2];
                                for (int g = 0; g < s.length; g++) {
                                    p[g] = Integer.parseInt(s[g]);
                                }
                                System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                            }
                            if (d[e] == 43) {
                                char symbol2 = '+';
                                String[] s = f[1].split("\\+");
                                int[] p = new int[2];
                                for (int g = 0; g < s.length; g++) {
                                    p[g] = Integer.parseInt(s[g]);
                                }
                                System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                            }
                            if (d[e] == 47) {
                                char symbol2 = '/';
                                String[] s = f[1].split("/");
                                int[] p = new int[2];
                                for (int g = 0; g < s.length; g++) {
                                    p[g] = Integer.parseInt(s[g]);
                                }
                                System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                            }
                        }
                    } else {
                        for (int i1 = 0; i1 < f.length; i1++) {
                            int[] p = new int[2];
                            char symbol2 = '-';
                            int f0 = Integer.parseInt(f[0]);
                            p[0] = Integer.parseInt(f[1]);
                            p[1] = Integer.parseInt(f[2]);
                            System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                        /*int[] p=new int[2];
                        char symbol2 = '-';
                        int f0 = Integer.parseInt(f[0]);
                        for (int g = 1; g < f.length; g++) {
                            p[i1] =Integer.parseInt(f[g]);
                        }
                        System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                    }*/
                        }
                        break;
                    }
                }
                    if (b[i] == 47) {
                        f = a.split("/");
                        char symbol1 = '/';
                        if (f.length == 2) {
                            int f0 = Integer.parseInt(f[0]);
                            char[] d = f[1].toCharArray();
                            for (int e = 0; e < d.length; e++) {
                                if (d[e] == 42) {
                                    char symbol2 = '*';
                                    String[] s = f[1].split("\\*");
                                    int[] p = new int[2];
                                    for (int g = 0; g < s.length; g++) {
                                        p[g] = Integer.parseInt(s[g]);
                                    }
                                    System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                                }
                                if (d[e] == 45) {
                                    char symbol2 = '-';
                                    String[] s = f[1].split("-");
                                    int[] p = new int[2];
                                    for (int g = 0; g < s.length; g++) {
                                        p[g] = Integer.parseInt(s[g]);
                                    }
                                    System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                                }
                                if (d[e] == 43) {
                                    char symbol2 = '+';
                                    String[] s = f[1].split("\\+");
                                    int[] p = new int[2];
                                    for (int g = 0; g < s.length; g++) {
                                        p[g] = Integer.parseInt(s[g]);
                                    }
                                    System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                                }
                            }
                        } else {
                            int[] p = new int[2];
                            char symbol2 = '/';
                            int f0 = Integer.parseInt(f[0]);
                            p[0] = Integer.parseInt(f[1]);
                            p[1] = Integer.parseInt(f[2]);
                            System.out.println(pr.sum(symbol1, symbol2, f0, p, b));
                        }
                        break;
                    }
                }
            }
        }

