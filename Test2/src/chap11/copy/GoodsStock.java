package chap11.copy;

public class GoodsStock {
	String goodsCode;
	int stockNum;
	public GoodsStock(String goodsCode, int stockNum) {
		super();
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	@Override
	public String toString() {
		
		String str = "��ǰ�ڵ�:" + goodsCode +
					 "������:" + stockNum;
		return str;
	}

}
