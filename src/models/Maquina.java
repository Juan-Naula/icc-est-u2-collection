package models;

import java.util.List;

public class Maquina  implements Comparable<Maquina>{
    private String name;
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int riesgo;

    public Maquina(String name, String ip, List<Integer> codigos) {
        this.name = name;
        this.ip = ip;
        this.codigos = codigos;
        this.subred = calcularSubred();
    }
    
    private int calcularSubred(){
        String[] octetos = ip.split("\\.");
        String subred = octetos[2];
        return Integer.parseInt(subred);
    }

    private int calcularRiesgo(){
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<Integer> getCodigos() {
        return codigos;
    }

    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }

    public int getSubred() {
        return subred;
    }

    public void setSubred(int subred) {
        this.subred = subred;
    }

    public int getRiesgo() {
        return riesgo;
    }

    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    @Override
    public int compareTo(Maquina o) {
        int comN = this.name.compareTo(o.getName());
        if (comN != 0) 
            return comN;
        int com = Integer.compare(this.subred, o.getSubred());
        return com;
        
        
    }

    
}
