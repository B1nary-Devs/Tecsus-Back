package com.tecsus.backendtecsus.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="contrato_agua")
public class ContratoAgua {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome_do_contrato")
    private String nomeContrato;

    @Column(name = "fornecedor")
    private String fornecedor;

    @Column(name = "forma_de_pagamento")
    private String formaPagamento;

    @Column(name = "tipo_de_acesso")
    private String tipoAcesso;

    @Column(name = "vigencia_inicial")
    private LocalDate vigenciaIncial;

    @Column(name = "vigencia_final")
    private LocalDate vigenciaFinal;

    @Column(name = "observacao")
    private String observacao;

    @Column(name = "numero_cliente")
    private String numeroCliente;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "tipo_de_consumidor")
    private String tipoConsumidor;

    @Column(name = "modelo_de_faturamento")
    private String modeloFaturamento;

    @Column(name = "codigo_de_ligacao_rgi")
    private String codigoLigacaoRgi;

    @Column(name = "endereco_de_instalacao")
    private String enderecoInstalacao;

    @Column(name = "numero_medidor")
    private String numeroMedidor;

    @Column(name = "hidrometro")
    private String hidrometro;

    @Column(name = "ativado")
    private String ativado;

    @Column(name = "nome")
    private String nome;

    public ContratoAgua() {
    }

    public ContratoAgua(Long id, String nomeContrato, String fornecedor, String formaPagamento, String tipoAcesso, LocalDate vigenciaIncial, LocalDate vigenciaFinal, String observacao, String numeroCliente, String cnpj, String tipoConsumidor, String modeloFaturamento, String codigoLigacaoRgi, String enderecoInstalacao, String numeroMedidor, String hidrometro, String ativado, String nome) {
        this.id = id;
        this.nomeContrato = nomeContrato;
        this.fornecedor = fornecedor;
        this.formaPagamento = formaPagamento;
        this.tipoAcesso = tipoAcesso;
        this.vigenciaIncial = vigenciaIncial;
        this.vigenciaFinal = vigenciaFinal;
        this.observacao = observacao;
        this.numeroCliente = numeroCliente;
        this.cnpj = cnpj;
        this.tipoConsumidor = tipoConsumidor;
        this.modeloFaturamento = modeloFaturamento;
        this.codigoLigacaoRgi = codigoLigacaoRgi;
        this.enderecoInstalacao = enderecoInstalacao;
        this.numeroMedidor = numeroMedidor;
        this.hidrometro = hidrometro;
        this.ativado = ativado;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeContrato() {
        return nomeContrato;
    }

    public void setNomeContrato(String nomeContrato) {
        this.nomeContrato = nomeContrato;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getTipoAcesso() {
        return tipoAcesso;
    }

    public void setTipoAcesso(String tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
    }

    public LocalDate getVigenciaIncial() {
        return vigenciaIncial;
    }

    public void setVigenciaIncial(LocalDate vigenciaIncial) {
        this.vigenciaIncial = vigenciaIncial;
    }

    public LocalDate getVigenciaFinal() {
        return vigenciaFinal;
    }

    public void setVigenciaFinal(LocalDate vigenciaFinal) {
        this.vigenciaFinal = vigenciaFinal;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTipoConsumidor() {
        return tipoConsumidor;
    }

    public void setTipoConsumidor(String tipoConsumidor) {
        this.tipoConsumidor = tipoConsumidor;
    }

    public String getModeloFaturamento() {
        return modeloFaturamento;
    }

    public void setModeloFaturamento(String modeloFaturamento) {
        this.modeloFaturamento = modeloFaturamento;
    }

    public String getCodigoLigacaoRgi() {
        return codigoLigacaoRgi;
    }

    public void setCodigoLigacaoRgi(String codigoLigacaoRgi) {
        this.codigoLigacaoRgi = codigoLigacaoRgi;
    }

    public String getEnderecoInstalacao() {
        return enderecoInstalacao;
    }

    public void setEnderecoInstalacao(String enderecoInstalacao) {
        this.enderecoInstalacao = enderecoInstalacao;
    }

    public String getNumeroMedidor() {
        return numeroMedidor;
    }

    public void setNumeroMedidor(String numeroMedidor) {
        this.numeroMedidor = numeroMedidor;
    }

    public String getHidrometro() {
        return hidrometro;
    }

    public void setHidrometro(String hidrometro) {
        this.hidrometro = hidrometro;
    }

    public String getAtivado() {
        return ativado;
    }

    public void setAtivado(String ativado) {
        this.ativado = ativado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

