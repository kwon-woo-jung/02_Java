package com.kh.model.vo.Unit;

public class Order {

	private OrderState state;
	private shippingInfo shippingInfo;
	
	public void changeShippingInfo(shippingInfo new shippinginfo) {
		if (!state.isShippingChangeable()) {
			throw new IllegalsTateException("can't change shipping in " + state);
		}
		this.shippingInfo = newShippingInfo;
	}
	
	
	
}

public enum OrderState {
	PAYMENT_MAITING {
		public boolean isShippingChangeable() {
			return true;
				
		}
	}
	PREPARING {
		public boolean isShippingChangeble() {
			return true;
		}
	}
	SHIPPED, DELIVERING, DELIYERY_COMPLETED;
	
	public boolean isShippingChangeable() {
		return false;
	}
	
}