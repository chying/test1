package algorithm.chapter2.first;

/**
 * 【50.powerN】实现 pow(x, n) ，即计算 x 的 n 次幂函数。 示例 1: 输入: 2.00000, 10 输出: 1024.00000
 * https://leetcode-cn.com/problems/powx-n/
 * 
 * @author chying
 *
 */
public class PowxN {
	public double myPow(double x, int n) {
		if (n == 0)
			return 1;
		if (n < 0) {
			x = 1 / x;
			return (n % 2 == 0) ? myPow(x * x, -(n / 2)) : x * myPow(x * x, -(n / 2));
		}
		return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);

	}

	public static void main(String[] args) {
		PowxN a = new PowxN();
		System.out.println(a.myPow(2.00000, -2147483648));
	}
}
