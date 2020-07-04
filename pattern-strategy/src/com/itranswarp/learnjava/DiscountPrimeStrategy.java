package com.itranswarp.learnjava;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DiscountPrimeStrategy implements DiscountStrategy {

	@Override
	public BigDecimal getDiscount(BigDecimal total) {
		// 满100减20优惠 + 七折
		BigDecimal r = total.compareTo(BigDecimal.valueOf(100)) >= 0 ? BigDecimal.valueOf(20) : BigDecimal.ZERO;
		System.out.println(r);
		r = (total.subtract(r)).multiply(new BigDecimal("0.7")).setScale(2, RoundingMode.DOWN);
		return total.subtract(r);
	}
}
