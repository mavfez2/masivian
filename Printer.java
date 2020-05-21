package com.masivian.test;

/**
 *
 * @Refactor by Mauricio David Viveros Fernandez
 */
public class Printer {

    static final int ORDMAX = 30;
    static final int M = 1000;
    static int J = 1;
    static boolean JPRIME;
    static int ORD = 2;
    static int SQUARE = 9;
    static int N = 0;
    static int MULT[] = new int[ORDMAX + 1];
    static int P[] = new int[M + 1];

    public static void main(String[] args) {
         
        P[1] = 2;
        int K = 1;
        while (K < M) {
            mult();
            K++;
            P[K] = J;
        }

        PrinterUtil printelUtil = new PrinterUtil();
        printelUtil.setPageNumber(1);
        printelUtil.setPageOffset(1);
        printelUtil.setM(M);
        printelUtil.setP(P);
        printelUtil.pageOffset();
    }

    private static void mult() {
        do {
            J += 2;
            if (J == SQUARE) {
                ORD++;
                SQUARE = P[ORD] * P[ORD];
                MULT[ORD - 1] = J;
            }
            N = 2;
            JPRIME = true;
            while (N < ORD && JPRIME) {
                while (MULT[N] < J) {
                    MULT[N] += P[N] + P[N];
                }
                if (MULT[N] == J) {
                    JPRIME = false;
                }
                N++;
            }
        } while (!JPRIME);
    }
}
