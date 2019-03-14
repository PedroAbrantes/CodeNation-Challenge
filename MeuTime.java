import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Set;

public class MeuTime implements MeuTimeInterface {
    private Long idCapitao;
    private HashMap<Long, Time> times;
    private HashMap<Long, Jogador> jogadores;

    //Quem terminar primeiro faz
    @Override
    public Long buscarCapitaoDoTime(Long idTime) {

        return null;
    }

    //Ewerton
    @Override
    public Long buscarJogadorMaiorSalario(Long idTime) {
        return null;
    }

    //Pedro
    @Override
    public Long buscarJogadorMaisVelho(Long idTime) {
        return null;
    }

    //Douglas
    @Override
    public List<Long> buscarJogadoresDoTime(Long idTime) {
        LinkedList<Long> IdsJogadores = new LinkedList<Long>();

        times.get(idTime).getJogadores().values().
        stream().sorted((i1, i2) -> i2.getId().compareTo(i1.getId())).
        forEach(jogador -> IdsJogadores.add(jogador.getId()));

        return IdsJogadores;
    }

    //Ewerton
    @Override
    public Long buscarMelhorJogadorDoTime(Long idTime) {
        return null;
    }
    
    //Pedro
    @Override
    public String buscarNomeJogador(Long idJogador) {
        return null;
    }

    //Douglas
    @Override
    public String buscarNomeTime(Long idTime) {
        return times.get(idTime).getNome();
    }

    //Ewerton
    @Override
    public BigDecimal buscarSalarioDoJogaodor(Long idJogador) {
        return null;
    }

    @Override
        public List<Long> buscarTimes() {
            List<Long> timesIds = new ArrayList<Long>();
            if (times.size() > 0){
            Set<Long> setIds = times.keySet();
            timesIds = new ArrayList<Long>(setIds);
            }
            return timesIds;
        }
    
    //Pedro
    @Override
    public List<Long> buscarTopJogadores(Integer top) {
        List<Long> topjogadores = new LinkedList<Long>();
        Stream<Jogador> iterador = jogadores.values().stream();
        iterador.sorted((i1, i2) -> i2.getNivelHabilidade().compareTo(i1.getNivelHabilidade()))
                .limit(top).forEach(elementos ->  topjogadores.add(Long.valueOf(elementos.getNivelHabilidade())));

        return topjogadores;
    }

    //Pedro
    @Override
    public void definirCapitao(Long idJogador) {
        times.get(jogadores.get(idJogador).getTime()).setCapitao(idJogador);
    }

    //Douglas
    @Override
    public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) {
        Jogador jogador = new Jogador(id, idTime, nome, dataNascimento, nivelHabilidade, salario);
        jogadores.put(id, jogador);
        times.get(idTime).AdicionaJogador(id, jogador);
    }

    //Douglas
    @Override
    public void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal,
            String corUniformeSecundario) {
        Time time = new Time(id, nome, dataCriacao, corUniformePrincipal, corUniformeSecundario);
        times.put(id, time);
    }

}