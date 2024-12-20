package fixacao;

public class CurrencyConverter {
	private Double dollar;
	private Double add;
	private Double tax;
	
	public CurrencyConverter() {
		
	}

	public CurrencyConverter(Double dollar, Double add) {
		this.dollar = dollar;
		this.add = add;
		tax = 0.06;
	}

	public Double getDollar() {
		return dollar;
	}

	public void setDollar(Double dollar) {
		this.dollar = dollar;
	}

	public Double getAdd() {
		return add;
	}

	public void setAdd(Double add) {
		this.add = add;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double calculationReal() {
		return dollar * add + dollar * add * tax;
	}
	
}
