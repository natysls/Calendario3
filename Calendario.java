public class Calendario {
    private Integer dia=0;
    private Integer mes=0;
    private Integer ano=0;

    public Integer getDia() {
        return dia;
    }
    public void setDia(Integer dia) {
        this.dia = dia;
    }
    public Integer getMes() {
        return mes;
    }
    public void setMes(Integer mes) {
        this.mes = mes;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Calendario(Integer dia, Integer mes, Integer ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    //toString: imprime a data no formato dd/mm/aaaa
    public String toString(){
        return getDia() + "/" + getMes() + "/" + getAno();
    }
    //avançar: avança em um dia a data.
    public void avançar(){
        if(dia < 30) {
            dia++;
        }
        else{
            dia = 1;
            mes++;
        }
        if(dia < 30 & mes < 12){
            dia++;
        }else{
            dia = 1;
            mes = 1;
            ano++;
        }
    }
    //é mais antiga: recebe uma outra data e retorna verdadeiro se a data é mais antiga que a
    //passada por parâmetro ou falso caso contrário.
    public boolean ehMaisAntiga(Integer d, Integer m, Integer a){
        if(a < ano){
            return true;
        } else if(a == ano){
            if (m < mes){
                return true;
            } else if(m == mes){
                if (d < dia){
                    return  true;
                }else if(d == dia) {
                    System.out.println("Dias iguais");
                }
            }
        }
        return false;
    }
}
