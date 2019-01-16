public class Runner {
    public static void main(String[] args)
    {
        double[] scan={0.3,0.7,0.8,0.4,1.4,1.1,0.2,0.5,0.2,1.6,0.6,0.9};
        SkyView sv1=new SkyView(4,3,scan);
        System.out.println(sv1);
    }
}
