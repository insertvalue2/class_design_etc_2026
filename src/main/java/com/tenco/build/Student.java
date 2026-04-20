package com.tenco.build;

// 빌더 패턴
public class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // 외부에서 직접 생성자를 호출 못 하게 막아 준다.
    private Student (Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    // 내부 클래서로 Builder 클래스를 정의해 준다.
    public static class Builder {
        // 1. 아우터 클래스의 멤버 변수를 다시 한번 더 선언을 한다.
        private String name;
        private int age;

        // 필요하다면 내부 클래스의 생성자를 선언할 수 있다.
        // 단, 이녀석의 목적은 필수 값, 선택 값을 나눠야할 때 선택 할 수 있다.
        // 즉, Student 를 생성할 필수 값을 정의하고 싶다면 내부 클래스의 생성자를 만들어 준다.
        public Builder(String name) {
            this.name = name;
        }


        // 2. 각각의 멤버 변수를 설정할 수 있는 메서들 만들어 준다.
        // 단, 리턴타입은 자기 자신이다.
        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        // 핵심 - 빌터 패턴에서 반드시 정의 되어야 함.
        // 리턴 타입을 아우터 클래스를 정의를 내려 줘야 한다.
        public Student build() {
            return new Student(this);
        }
    }

}
