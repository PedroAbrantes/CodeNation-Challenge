import java.math.BigDecimal;
import java.time.LocalDate;
import java.lang.instrument.*;
import java.util.*;

public interface MeuTimeInterface {

	public void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario);

	public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario);

	public void definirCapitao(Long idJogador);

	public Long buscarCapitaoDoTime(Long idTime);

	public String buscarNomeJogador(Long idJogador);

	public String buscarNomeTime(Long idTime);

	public Long buscarJogadorMaiorSalario(Long idTime);

	public BigDecimal buscarSalarioDoJogaodor(Long idJogador);

	public List<Long> buscarJogadoresDoTime(Long idTime);

	public Long buscarMelhorJogadorDoTime(Long idTime);

	public Long buscarJogadorMaisVelho(Long idTime);

	public List<Long> buscarTimes();

	public List<Long> buscarTopJogadores(Integer top);
}