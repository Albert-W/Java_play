
public class SalaryIncome extends Income {

	// TODO
	public SalaryIncome(double income) {
		// TODO Auto-generated constructor stub
		super(income);
	}
	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		if (income <= 5000) {
			return 0;
		}
		return (income - 5000) * 0.2;
	}

}