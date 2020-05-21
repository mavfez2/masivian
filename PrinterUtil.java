package com.masivian.test;

/**
 *
 * @author Mauricio David Viveros Fernandez
 */
public class PrinterUtil {

    int pageOffset;
    int pageNumber;
    
    final int cc = 4;
    final int rr = 50;
    int m;
    int p[];

    public void pageOffset() {
        while (pageOffset <= m) {
            System.out.print("The First ");
            System.out.print(Integer.toString(m));
            System.out.print(" prime Numbers === page ");
            System.out.print(Integer.toString(pageNumber));
            System.out.println("\n");
            this.cells();
            System.out.println("\f");
            pageNumber++;
            pageOffset += rr * cc;
        }
    }

    private void cells() {
        int c;
        int rowOffset;
        for (rowOffset = pageOffset; rowOffset <= pageOffset + rr - 1; rowOffset++) {
            for (c = 0; c <= cc - 1; c++) {
                if (rowOffset + c * rr <= m) {
                    System.out.printf("%10d", p[rowOffset + c * rr]);
                }
            }
            System.out.println();
        }
    }

    public int getPageOffset() {
        return pageOffset;
    }

    public void setPageOffset(int pageOffset) {
        this.pageOffset = pageOffset;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }   
   
    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int[] getP() {
        return p;
    }

    public void setP(int[] p) {
        this.p = p;
    }
    
    
    
}
