package com.tecsus.backendtecsus.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="conta_agua")
public class ContaAgua {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "contadomes")
    private LocalDate contaMes;

    @Column(name = "vencimento")
    private LocalDate vencimento;

    @Column(name = "emissao")
    private LocalDate emissao;

    @Column(name = "leituraanterior")
    private LocalDate leituraAnterior;

    @Column(name = "leituraatual")
    private LocalDate leituraAtual;

    @Column(name = "consumodeaguam3")
    private BigDecimal consumoAgua;

    @Column(name = "consumodeesgotom3")
    private BigDecimal consumoEsgoto;

    @Column(name = "valoraguar$")
    private Double valorAgua;

    @Column(name = "valoresgotor$")
    private Double valorEsgoto;

    @Column(name = "totalr$")
    private Double total;

    @Column(name = "niveldeinformacoesdafatura")
        private String nivelInformacoesFatura;

    @Column(name = "codigodeligacaorgi")
    private String codigoDeLigacaoRGI;

    @Column(name = "hidrometro")
    private String hidrometro;


    public ContaAgua() {
    }

    public ContaAgua(Long id, LocalDate contaMes, LocalDate vencimento, LocalDate emissao, LocalDate leituraAnterior, LocalDate leituraAtual, BigDecimal consumoAgua, BigDecimal consumoEsgoto, Double valorAgua, Double valorEsgoto, Double total, String nivelInformacoesFatura, String codigoDeLigacaoRGI, String hidrometro) {
        this.id = id;
        this.contaMes = contaMes;
        this.vencimento = vencimento;
        this.emissao = emissao;
        this.leituraAnterior = leituraAnterior;
        this.leituraAtual = leituraAtual;
        this.consumoAgua = consumoAgua;
        this.consumoEsgoto = consumoEsgoto;
        this.valorAgua = valorAgua;
        this.valorEsgoto = valorEsgoto;
        this.total = total;
        this.nivelInformacoesFatura = nivelInformacoesFatura;
        this.codigoDeLigacaoRGI = codigoDeLigacaoRGI;
        this.hidrometro = hidrometro;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getContaMes() {
        return contaMes;
    }

    public void setContaMes(LocalDate contaMes) {
        this.contaMes = contaMes;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    public LocalDate getEmissao() {
        return emissao;
    }

    public void setEmissao(LocalDate emissao) {
        this.emissao = emissao;
    }

    public LocalDate getLeituraAnterior() {
        return leituraAnterior;
    }

    public void setLeituraAnterior(LocalDate leituraAnterior) {
        this.leituraAnterior = leituraAnterior;
    }

    public LocalDate getLeituraAtual() {
        return leituraAtual;
    }

    public void setLeituraAtual(LocalDate leituraAtual) {
        this.leituraAtual = leituraAtual;
    }

    public BigDecimal getConsumoAgua() {
        return consumoAgua;
    }

    public void setConsumoAgua(BigDecimal consumoAgua) {
        this.consumoAgua = consumoAgua;
    }

    public BigDecimal getConsumoEsgoto() {
        return consumoEsgoto;
    }

    public void setConsumoEsgoto(BigDecimal consumoEsgoto) {
        this.consumoEsgoto = consumoEsgoto;
    }

    public Double getValorAgua() {
        return valorAgua;
    }

    public void setValorAgua(Double valorAgua) {
        this.valorAgua = valorAgua;
    }

    public Double getValorEsgoto() {
        return valorEsgoto;
    }

    public void setValorEsgoto(Double valorEsgoto) {
        this.valorEsgoto = valorEsgoto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getNivelInformacoesFatura() {
        return nivelInformacoesFatura;
    }

    public void setNivelInformacoesFatura(String nivelInformacoesFatura) {
        this.nivelInformacoesFatura = nivelInformacoesFatura;
    }

    public String getCodigoDeLigacaoRGI() {
        return codigoDeLigacaoRGI;
    }

    public void setCodigoDeLigacaoRGI(String codigoDeLigacaoRGI) {
        this.codigoDeLigacaoRGI = codigoDeLigacaoRGI;
    }

    public String getHidrometro() {
        return hidrometro;
    }

    public void setHidrometro(String hidrometro) {
        this.hidrometro = hidrometro;
    }
}
