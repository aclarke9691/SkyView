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
                b=0;
                while (b < numCols) {
                    view[a][b] = scanned[c];
                    b = b + 1;
                    c = c + 1;
                }
                a = a + 1;
                b=b-1;
                //if (b == numCols-1) {
                    while (b > -1) {
                        view[a][b] = scanned[c];
                        b = b - 1;
                        c = c + 1;
                    }
                    a = a + 1;
                //}
            }
        }

    }
    public double[][] getView()
    {
        return this.view;
    }

    public String toString()
    {
        int d=0;
        int e=0;
        String result="";
        while (d<view.length)
        {
            while (e<view[d].length)
            {
                result=result+ view[d][e] +" ";
                e=e+1;
            }
            if (e!=view[d].length-1)
            {
                result= result+ "\n";
            }
            d=d+1;
            e=0;
        }
        return result;
    }
}

