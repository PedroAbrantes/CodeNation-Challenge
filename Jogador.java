import java.math.BigDecimal;
import java.time.LocalDate;

public class Jogador {
    private Long id;
    private Long idTime;
    private String nome;
    private LocalDate dataNascimento;
    private Integer nivelHabilidade;
    private BigDecimal salario;

    public Jogador(Long id, Long ifTime, String nome, 
                    LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario){
        this.id = id;
        this.idTime = idTime;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nivelHabilidade = nivelHabilidade;
        this.salario = salario;               
    }
    public BigDecimal getSalario(){
        return this.salario;
    }
    
    public Long getTime(){
        return idTime;
    }

    public Integer getNivelHabilidade(){
        return nivelHabilidade;
    }

    public Long getId(){
        return id;
    }
}


