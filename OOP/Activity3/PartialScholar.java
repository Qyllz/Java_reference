package Activity3;

public class PartialScholar extends Student {
    public PartialScholar(String name, String course, float tuitionFee) {
		super(name, course, tuitionFee);
	}

	private float discountRate;
    private float payableAmount;

    public PartialScholar(String name, String course, float tuitionFee, float discountRate) {
        super(name, course, tuitionFee);
        this.discountRate = discountRate;
        this.payableAmount = tuitionFee - (tuitionFee * discountRate);
    }

    public float getPayableAmount() {
        return payableAmount;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDiscount Rate of: " + (discountRate *  100) + "%\nNet Payable Tuition Fee is: " + payableAmount;
    }
}