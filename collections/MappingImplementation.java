package collections;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MappingImplementation {
    public static void main(String[] args) {
        Map<String, Long> contact = new Hashtable<>();
        contact.put("Razak", 567876567645L);
        contact.put("Mani", 567876567645L);
        contact.put("Vikas", 123456754356L);
        contact.put("Vikas", 1111111111111L);
        Map<String, Long> call = new TreeMap<>();
        call.putAll(contact);
        System.out.println("Contacts "+contact);
        System.out.println("call "+call);
        call.remove("Razak");
        System.out.println(call.containsValue(567876567645L));
        System.out.println(call.containsKey("Razak"));
        System.out.println(contact.get("Razak"));
        Set<String> names = call.keySet();
        Collection<Long> numbers = call.values();
        System.out.println("Contact's "+names);
        System.out.println("Mobile's "+numbers);
    }
}
