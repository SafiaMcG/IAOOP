public class Q4 {

	public static int sum(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total +=  a[i];
		}
		return total;
	}

	public static int[] cumsum(int[] a) {
		int[] cumtotal = new int[a.length];
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total +=  a[i];
			cumtotal[i] = total;
		}
		return cumtotal;
	}

	public static int[] positives(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				count++;
			}
		}
		int[] pos = new int[count];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				pos[j++] = a[i];
			}
		}
		return pos;
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {1, -4, 6, 7, -10, 0};
		System.out.println(sum (a));
		System.out.println( (positives(b))[0] );
		System.out.println( (positives(b))[1] );
		System.out.println( (positives(b))[2] );
		System.out.println( (positives(b))[3] );
		System.out.println( (positives(b))[4] );
	}
}
