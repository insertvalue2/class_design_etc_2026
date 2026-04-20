package com.tenco.single;

public class Main {

    public static void main(String[] args) {

        // 우리 프로젝트 내에서 SingleTon 객채를 Heap 메모리에 올려 보자.
        // 생성자 막아 놨음 - 호출 못함
        // SingleTon singleTon = new SingleTon();

        SingleTon singleTon1 = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();

        System.out.println("1. " + singleTon1);
        System.out.println("2. " + singleTon2);

        if(singleTon1 == singleTon2) {
            System.out.println("같은 객체가 맞아요");
        }
    }
}
