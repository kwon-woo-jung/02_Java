package edu.kh.collection.pack2.run;

import edu.kh.collection.pack2.model.service.SetService;

public class setRun {

	public static void main(String[] args) {
//		명령행을 인수받을 수 있는 매개변수가 포함된 메인 메서드에 해당되는 소스코드입니다.
		
		SetService service = new SetService();
//		setService를 실행하기 위한 객체를 생성합니다.
		
		//service.method4();
		service.lottoNumberGenerator();
//		이 부분은 setService 클래스에서 정의된 lottoNumberGenerator() 메서드를 호출하는 코드입니다.
//		이 메서드는 로또 번호를 생성하는 기능을 수행한다
//		setService 클래스에 정의된 메서드를 사용하여 로또 번호를 생성함
	}

}