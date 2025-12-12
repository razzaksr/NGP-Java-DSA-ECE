package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementation {
    public static void main(String[] args) {
        Set<String> setOne = new LinkedHashSet<>();
        Set<String> setTwo = new HashSet<>();
        Set<String> setThree = new TreeSet<>();
        setOne.add("Spring Boot");setOne.add("JDBC");
        setOne.add("Strut");setOne.add("Hibernate");
        setOne.add("JPA");setOne.add("JUnit");
        setOne.add("Mockito");setOne.add("TestNG");
        setTwo.addAll(setOne); setThree.addAll(setOne);
        setThree.add("Strut");
        System.out.println("Linked Hash "+setOne);
        System.out.println("Hash "+setTwo);
        System.out.println("Tree "+setThree);
        setThree.remove("Spring Boot");
        System.out.println(setOne.contains("Spring Boot"));
    }
}
