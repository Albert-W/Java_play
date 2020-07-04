package com.itranswarp.learnjava;

import com.itranswarp.learnjava.organization.AdminOfIndustry;
import com.itranswarp.learnjava.organization.Bank;
import com.itranswarp.learnjava.organization.Company;
import com.itranswarp.learnjava.organization.Taxation;

public class Facade {

	private AdminOfIndustry admin = new AdminOfIndustry();
	private Bank bank = new Bank();
	private Taxation taxation = new Taxation();

	public Company openCompany(String name) {
		Company c = this.admin.register(name);
		String bankAccount = this.bank.openAccount(c.getId());
		c.setBankAccount(bankAccount);
		String taxCode = this.taxation.applyTaxCode(c.getId());
		c.setTaxCode(taxCode);
		return c;
	}
}
