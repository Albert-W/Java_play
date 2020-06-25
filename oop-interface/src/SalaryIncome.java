
public class SalaryIncome implements Income {
	private double income;
	public SalaryIncome(double income) {
		// TODO Auto-generated constructor stub
		this.income = income;
	}

	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		if (income <= 5000) {
			return 0;
		}
		return (income - 5000) * 0.2;
	}

	// TODO

}
