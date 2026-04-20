package com.tenco.adapter;

public class ElectronicAdapter implements IElectronic220v {
    // homeconnect(220v)

    IElectronic110v iElectronic110v;

    // 생성자에는 다른 스펙인 110v 전달 받을 수 있도록 설계
    public ElectronicAdapter(IElectronic110v iElectronic110v) {
        this.iElectronic110v = iElectronic110v;
    }

    @Override
    public void connect() {
        System.out.println("어댑터를 통해 110v 타입의 기기를 220v 연결합니다");
        iElectronic110v.connect();
    }
}
