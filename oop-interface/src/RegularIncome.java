
public class RegularIncome implements Income {
	private double income;
	public RegularIncome(double income) {
		// TODO Auto-generated constructor stub
		this.income = income;
	}

	// TODO
	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		return income * 0.1;
	}	

}
