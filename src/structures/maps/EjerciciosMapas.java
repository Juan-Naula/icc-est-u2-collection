package structures.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import models.Person;

public class EjerciciosMapas {
    public Map contarDuplicados(List<Integer> list){
        Map<Integer, Integer> conteo = new HashMap<>();
        for (Integer num : list) {
            conteo.put(num, conteo.getOrDefault(num, 0) + 1);
        }
        return conteo;
    }

    public int contarElPrimerNoDuplicados(List<Integer> list){
        Map<Integer, Integer> conteo = new HashMap<>();
        int noDupli = 0;
        for (Integer num : list) {
            conteo.put(num, conteo.getOrDefault(num, 0) + 1);
        }

        for (Integer num : list) {
            if (conteo.get(num) == 1) {
                return num;
            }
            
        }

        return -1;
    }

    public Map rankingPuntajes(List<String> list){
        Map<String, String> rankingPuntajes = new TreeMap<>();
        for (String str : list) {
            
        }
        return rankingPuntajes;
    }
}
