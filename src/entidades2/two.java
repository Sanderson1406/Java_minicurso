package entidades2;

public class two {
	public int[] nums;
	int soma;
	
	public int soma() {
		for (int i = 0;  i < 10; i++) {
			soma += nums[i];
		}
		return soma;
	}
}
