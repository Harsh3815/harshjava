public class num
{
    enum Data { BCA, MCA, MSC }
    public static void main(String[] args) 
	{
        Data bca = Data.BCA;
        System.out.println(bca);
        getDepart(bca);
	}
    public static void getDepart(Data a) 
	{
        System.out.println(a);
    }
}