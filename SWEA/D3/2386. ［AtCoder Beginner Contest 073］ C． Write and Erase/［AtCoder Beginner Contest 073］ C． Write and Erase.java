import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Set;
import java.util.HashSet;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            Set<Integer> set = new HashSet<>();
            for(int i = 0; i < N; i++){
            	int num = sc.nextInt();
                if(set.contains(num)) set.remove(num);
                else set.add(num);
            }
            System.out.println("#" + test_case + " " + set.size());
		}
	}
}