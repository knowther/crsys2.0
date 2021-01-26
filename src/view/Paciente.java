/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author johnn
 */
@Entity
@Table(name = "paciente", catalog = "clinica_crc", schema = "")
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p")
    , @NamedQuery(name = "Paciente.findByIdpaciente", query = "SELECT p FROM Paciente p WHERE p.idpaciente = :idpaciente")
    , @NamedQuery(name = "Paciente.findByNome", query = "SELECT p FROM Paciente p WHERE p.nome = :nome")
    , @NamedQuery(name = "Paciente.findByDataNascimento", query = "SELECT p FROM Paciente p WHERE p.dataNascimento = :dataNascimento")
    , @NamedQuery(name = "Paciente.findByCpf", query = "SELECT p FROM Paciente p WHERE p.cpf = :cpf")
    , @NamedQuery(name = "Paciente.findByRua", query = "SELECT p FROM Paciente p WHERE p.rua = :rua")
    , @NamedQuery(name = "Paciente.findByN\u00famero", query = "SELECT p FROM Paciente p WHERE p.n\u00famero = :n\u00famero")
    , @NamedQuery(name = "Paciente.findByBairro", query = "SELECT p FROM Paciente p WHERE p.bairro = :bairro")
    , @NamedQuery(name = "Paciente.findByCidadeIdcidade", query = "SELECT p FROM Paciente p WHERE p.cidadeIdcidade = :cidadeIdcidade")
    , @NamedQuery(name = "Paciente.findByEstadoIdestado", query = "SELECT p FROM Paciente p WHERE p.estadoIdestado = :estadoIdestado")
    , @NamedQuery(name = "Paciente.findByCep", query = "SELECT p FROM Paciente p WHERE p.cep = :cep")
    , @NamedQuery(name = "Paciente.findByProfissaoIdprofissao", query = "SELECT p FROM Paciente p WHERE p.profissaoIdprofissao = :profissaoIdprofissao")
    , @NamedQuery(name = "Paciente.findByFoto", query = "SELECT p FROM Paciente p WHERE p.foto = :foto")})
public class Paciente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpaciente")
    private Integer idpaciente;
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "dataNascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "rua")
    private String rua;
    @Column(name = "n\u00famero")
    private String número;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade_idcidade")
    private Integer cidadeIdcidade;
    @Column(name = "estado_idestado")
    private Integer estadoIdestado;
    @Column(name = "cep")
    private String cep;
    @Column(name = "profissao_idprofissao")
    private Integer profissaoIdprofissao;
    @Column(name = "foto")
    private String foto;

    public Paciente() {
    }

    public Paciente(Integer idpaciente) {
        this.idpaciente = idpaciente;
    }

    public Paciente(Integer idpaciente, Date dataNascimento) {
        this.idpaciente = idpaciente;
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Integer idpaciente) {
        Integer oldIdpaciente = this.idpaciente;
        this.idpaciente = idpaciente;
        changeSupport.firePropertyChange("idpaciente", oldIdpaciente, idpaciente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        Date oldDataNascimento = this.dataNascimento;
        this.dataNascimento = dataNascimento;
        changeSupport.firePropertyChange("dataNascimento", oldDataNascimento, dataNascimento);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        String oldRua = this.rua;
        this.rua = rua;
        changeSupport.firePropertyChange("rua", oldRua, rua);
    }

    public String getNúmero() {
        return número;
    }

    public void setNúmero(String número) {
        String oldNúmero = this.número;
        this.número = número;
        changeSupport.firePropertyChange("n\u00famero", oldNúmero, número);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        changeSupport.firePropertyChange("bairro", oldBairro, bairro);
    }

    public Integer getCidadeIdcidade() {
        return cidadeIdcidade;
    }

    public void setCidadeIdcidade(Integer cidadeIdcidade) {
        Integer oldCidadeIdcidade = this.cidadeIdcidade;
        this.cidadeIdcidade = cidadeIdcidade;
        changeSupport.firePropertyChange("cidadeIdcidade", oldCidadeIdcidade, cidadeIdcidade);
    }

    public Integer getEstadoIdestado() {
        return estadoIdestado;
    }

    public void setEstadoIdestado(Integer estadoIdestado) {
        Integer oldEstadoIdestado = this.estadoIdestado;
        this.estadoIdestado = estadoIdestado;
        changeSupport.firePropertyChange("estadoIdestado", oldEstadoIdestado, estadoIdestado);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        changeSupport.firePropertyChange("cep", oldCep, cep);
    }

    public Integer getProfissaoIdprofissao() {
        return profissaoIdprofissao;
    }

    public void setProfissaoIdprofissao(Integer profissaoIdprofissao) {
        Integer oldProfissaoIdprofissao = this.profissaoIdprofissao;
        this.profissaoIdprofissao = profissaoIdprofissao;
        changeSupport.firePropertyChange("profissaoIdprofissao", oldProfissaoIdprofissao, profissaoIdprofissao);
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        String oldFoto = this.foto;
        this.foto = foto;
        changeSupport.firePropertyChange("foto", oldFoto, foto);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpaciente != null ? idpaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.idpaciente == null && other.idpaciente != null) || (this.idpaciente != null && !this.idpaciente.equals(other.idpaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Paciente[ idpaciente=" + idpaciente + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
