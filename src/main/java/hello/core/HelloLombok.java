package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.lang.annotation.Target;

@Getter
@Setter
@ToString
public class HelloLombok {
    
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("asdfas");

        System.out.println("helloLombok = " + helloLombok);
    }


}
