package ch03;

public class MyHouse {

	public static void homeConnect(IElectronic220v electronic220v) {
		electronic220v.connect();
	}
	
	public static void main(String[] args) {
		// 전압 220V
		// 집들이 일본 가전 제품 110V
		
		AirConditionner airConditionner = new AirConditionner();
		HairDryer dryer = new HairDryer();
		
		
		// 사용해 보기
		homeConnect(airConditionner); // 에어콘 바로 연결 가능
		// homeConnect(dryer); // 집에 바로 연결 불가능
		
		// 어댑터 가지고 오기
		ElectronicAdapter dryerAdapter = new ElectronicAdapter(dryer);
		
		homeConnect(dryerAdapter);
		
		
		Cleaner cleaner = new Cleaner();
		ElectronicAdapter cleanerAdapter = new ElectronicAdapter(cleaner);
		homeConnect(cleanerAdapter);
	}

}
