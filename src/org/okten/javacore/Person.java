package org.okten.javacore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;

    private int age;

    private List<String> stuff;
}
