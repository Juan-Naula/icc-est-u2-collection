package structures.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

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

    public Map rankingPuntajes(List<String[]> list){
        Map<String, Integer> maxPuntajes = new HashMap<>();
        for (String[] entrada : list) {
            String nombre = entrada[0];
            int puntaje = Integer.parseInt(entrada[1]);
            maxPuntajes.put(nombre, Math.max(maxPuntajes.getOrDefault(nombre, 0), puntaje));
        }
        
        Map<String, Integer> ranking = new TreeMap<>(
            Comparator.comparing((String nombre) -> maxPuntajes.get(nombre)).reversed()
        );
        ranking.putAll(maxPuntajes);
        
        return ranking;
    }

    public Map maxPorGrupo(Map<String, Integer> datos){
        Map<String, Integer> maxPorCarrera = new HashMap<>();
        for (String key : datos.keySet()) {
            String[] partes = key.split("-");
            String carrera = partes[0];
            int nota = datos.get(key);
            
            if (!maxPorCarrera.containsKey(carrera) || maxPorCarrera.get(carrera) < nota) {
                maxPorCarrera.put(carrera, nota);
            }
        }
        return maxPorCarrera;
    }
}
