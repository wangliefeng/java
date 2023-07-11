package demo1;

public class TwoSum {
    public static void main(String[] args)
    {
        int array[]=new int[]{5,6,7,2,4,1};
        int target=8,sum=0;
        System.out.printf("从数组中获得两个和为8的数：");
        System.out.println();
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                sum=array[i]+array[j+1];
                if(sum==target) {
                    System.out.printf("索引值为：" + i+"另一个数的索引值为："+(j+1));
                    System.out.println();
                }
            }
        }
    }
}


