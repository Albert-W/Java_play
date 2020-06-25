
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		// TODO: 用抽象类给一个有工资收入和稿费收入的小伙伴算税:
		Income[] incomes = new Income[] {
			
		new Income(3000) {
			@Override
			public double getTax() {
				return income * 0.1;
			}
		}, new SalaryIncome(7500), new RoyaltyIncome(12000) };
		double total = 0;
		// TODO:
		for (Income i:incomes) {
			total += i.getTax();
		}
		
		System.out.println(total);
	}

}
