public class duplicateno {
    public static void main(String[] args)
    {
        int array[]={4,2,7,3,1,6,3,1,5};
        System.out.println("Duplicate Numbers are:-");

        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]==array[j])
                {
                    System.out.println(array[j]);
                }
            }
        }
    }
}


