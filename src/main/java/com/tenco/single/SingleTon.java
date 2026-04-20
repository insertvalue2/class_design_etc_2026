package com.tenco.single;

// 클래스를 싱글톤 패턴으로 적용해서 설계해보자. (생성 패턴)
public class SingleTon {

    // 1. 유일한 인스턴스를 저장할 변수를 선언한다. (private, static)
    private static SingleTon instance;

    // 2. 외부에서 생성자를 직업 호출 못하게 막는다.
    private SingleTon() {}

    // 3. 외부에서 인스턴스 주소를 반환 받을 수 있는 메서드를 선언한다. (static)
    public static SingleTon getInstance() {
       if(instance == null) {
           // 즉 최초 호출시 객체 생성 됨.
           instance = new SingleTon();
       }
       // 내 멤버 변수를 반환해 준다.
       return instance;
    }
}
