
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome implements Income {
	private double income;
	public RoyaltyIncome(double income) {
		// TODO Auto-generated constructor stub
		this.income = income;
	}

	// TODO
	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return this.income * 0.2;
	}

}
