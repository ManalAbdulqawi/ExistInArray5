import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6,7,8,9,10};
        System.out.println("enter a number to see if it is exist");
        Scanner reader=new Scanner(System.in);
        int FindNum= reader.nextInt();
        boolean Isfound=false;
        for(int i=0;i<nums.length;i++)
        {if(nums[i]==FindNum)
        {System.out.println("we find the "+FindNum+"in our system");
            Isfound=true;
        break;}
            else
                continue;


        }
        if(Isfound==false)
            System.out.println("we could not find the "+FindNum+" in our system");
    }
}
