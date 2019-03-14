import java.time.*;
import java.util.List;
import java.util.HashMap;

public class Time{
    private Long id;
    private Long idCapitao;
    private String nome;
    private LocalDate dataCriacao;
    private String corUniformePrincipal;
    private String corUniformeSecundario;
    private HashMap<Long, Jogador> jogadores;

    public Time(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario){
        this.id = id;
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.corUniformePrincipal = corUniformePrincipal;
        this.corUniformeSecundario = corUniformeSecundario;
        jogadores = new HashMap<Long, Jogador>();
    }

    public void AdicionaJogador(Long idJogador, Jogador jogador){
        jogadores.put(idJogador, jogador);
    }
    

    public HashMap<Long, Jogador> getJogadores(){
        return jogadores;
    }

    public String getNome(){
        return nome;
    }

    public void setCapitao(Long id){
        this.idCapitao = id;
    }

    public Long getCapitao(){
        return idCapitao;
    }

}