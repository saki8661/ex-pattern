package ch03;

public class ElectronicAdapter implements IElectronic220v{
	
	// 1. 변환 하고자 하는 스펙을 포함관계로 만들어 준다.
	private IElectronic110v electronic110v;
	
	// 2. 생성자를 통해서 의존 주입 받을 수 있도록 설계 한다.
	public ElectronicAdapter(IElectronic110v electronic110v) {
		this.electronic110v = electronic110v;
	}
	
	@Override
	public void connect() {
		// 220v 녀석에 connect 메서드를 호출하는데
		// 실제 연결된 녀석은 11ov 
		electronic110v.connect();
	}

}
