public class SkyView {
    private double[][] view;

    public SkyView(int numRows, int numCols, double[] scanned)
    {
        this.view= new double[numRows][numCols];
        int a=0;
        int b=0;
        int c=0;
        while (c<scanned.length) {
            while (a < numRows) {
                while (b < numCols) {
                    view[a][b] = scanned[c];
                    b = b + 1;
                    c = c + 1;
                }
                a = a + 1;
                b=b-1;
                if (b == numCols-1) {
                    while (b > 0) {
                        view[a][b] = scanned[c];
                        b = b - 1;
                        c = c + 1;
                    }
                    a = a + 1;
                }
            }
        }

    }
}

