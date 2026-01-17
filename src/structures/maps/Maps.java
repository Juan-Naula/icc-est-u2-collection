package structures.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import models.Person;

public class Maps {
    public Map<String, Integer> construirHashMap(){
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 2);
        hashMap.put("B", 3);
        hashMap.put("A", 5);
        hashMap.put("C", 5);
        hashMap.put("D", 50);
        hashMap.put("E", 5);
        hashMap.put("F", 3);
        hashMap.put("G", 5);
        hashMap.put("H", 85);
        hashMap.put("I", 5);

        for (int i = 0; i < hashMap.size(); i++) {
            System.out.println(hashMap.values().toArray()[i]);
        }
        for (String key : hashMap.keySet()) {
            System.out.println("Llave: " + key + " Valor: " + hashMap.get(key));
        }

        return hashMap;
    }
    public Map<String, Integer> construirLinkedHashMap(){
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 2);
        linkedHashMap.put("B", 3);
        linkedHashMap.put("C", 5);
        linkedHashMap.put("D", 50);
        linkedHashMap.put("E", 5);
        linkedHashMap.put("F", 3);
        linkedHashMap.put("G", 5);
        linkedHashMap.put("H", 85);
        linkedHashMap.put("I", 5);
        return linkedHashMap;
    }

    public Map<String, Integer> construirTreeMap(){
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("B", 3);
        treeMap.put("C", 50);
        treeMap.put("A", 2);
        treeMap.put("I", 5);
        treeMap.put("F", 3);
        treeMap.put("D", 5);
        treeMap.put("G", 8);
        treeMap.put("H", 85);
        treeMap.put("A", 5);
        return treeMap;
    }

    public Map<Person, Integer> construirTreePersonMap(){
        Map<Person, Integer> treePersons = new TreeMap<>();
        treePersons.put(new Person("Carlos", 23), 1000); 
        treePersons.put(new Person("Ana", 30), 2000);
        treePersons.put(new Person("Luis",18), 3000);
        treePersons.put(new Person("Ana", 20), 4000);
        treePersons.put(new Person("Andres", 23), 5000);
        treePersons.put(new Person("Luis", 18), 6000);
        return treePersons;
    }

    public void printFilter(Map<Person, Integer> treePersons){
        ///Imprimir todad las personas que el valor sea > 2000
        /// y la edad sea >= 20
        for (Person  key : treePersons.keySet()) {
            if (key.getAge()>= 20 && treePersons.get(key) > 2000) {
                System.out.println(key + " Valor: " + treePersons.get(key));
            }
        }
    }

    public Map<Integer, Person> construirTreePersonMapObj(){
        Map<Integer, Person> personas = new TreeMap<>();
        personas.put(11, new Person("Carlos", 23)); 
        personas.put(9, new Person("Ana", 30));
        personas.put(70, new Person("Luis",18));
        personas.put(8, new Person("Ana", 20));
        personas.put(7, new Person("Andres", 23));
        personas.put(10, new Person("Luis", 18));
        return personas;
    }

    public Map<Integer, Person> construirTreePersonMapAlrevez(){
        List<Person> list = new ArrayList<>();
        list.add(new Person("Carlos", 23, 123));
        list.add(new Person("Ana", 23, 124));
        list.add(new Person("Luis", 23, 125));
        list.add(new Person("Ana", 23, 123));
        list.add(new Person("Andres", 23, 129));
        list.add(new Person("Luis", 23, 124));

        Map<Integer, Person> persons = new TreeMap<>();
        for (Person p : list) {
            persons.put(p.getCedula(), p);
        }

        return persons;
    }
    
}
