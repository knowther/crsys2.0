/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author johnn
 */
@Entity
@Table(name = "paciente_sessao", catalog = "clinica_crc", schema = "")
@NamedQueries({
    @NamedQuery(name = "PacienteSessao.findAll", query = "SELECT p FROM PacienteSessao p")
    , @NamedQuery(name = "PacienteSessao.findByIdpacienteSessao", query = "SELECT p FROM PacienteSessao p WHERE p.idpacienteSessao = :idpacienteSessao")
    , @NamedQuery(name = "PacienteSessao.findByPacienteIdpaciente", query = "SELECT p FROM PacienteSessao p WHERE p.pacienteIdpaciente = :pacienteIdpaciente")
    , @NamedQuery(name = "PacienteSessao.findBySessaoIdsessao", query = "SELECT p FROM PacienteSessao p WHERE p.sessaoIdsessao = :sessaoIdsessao")})
public class PacienteSessao implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpaciente_sessao")
    private Integer idpacienteSessao;
    @Column(name = "paciente_idpaciente")
    private Integer pacienteIdpaciente;
    @Column(name = "sessao_idsessao")
    private Integer sessaoIdsessao;

    public PacienteSessao() {
    }

    public PacienteSessao(Integer idpacienteSessao) {
        this.idpacienteSessao = idpacienteSessao;
    }

    public Integer getIdpacienteSessao() {
        return idpacienteSessao;
    }

    public void setIdpacienteSessao(Integer idpacienteSessao) {
        Integer oldIdpacienteSessao = this.idpacienteSessao;
        this.idpacienteSessao = idpacienteSessao;
        changeSupport.firePropertyChange("idpacienteSessao", oldIdpacienteSessao, idpacienteSessao);
    }

    public Integer getPacienteIdpaciente() {
        return pacienteIdpaciente;
    }

    public void setPacienteIdpaciente(Integer pacienteIdpaciente) {
        Integer oldPacienteIdpaciente = this.pacienteIdpaciente;
        this.pacienteIdpaciente = pacienteIdpaciente;
        changeSupport.firePropertyChange("pacienteIdpaciente", oldPacienteIdpaciente, pacienteIdpaciente);
    }

    public Integer getSessaoIdsessao() {
        return sessaoIdsessao;
    }

    public void setSessaoIdsessao(Integer sessaoIdsessao) {
        Integer oldSessaoIdsessao = this.sessaoIdsessao;
        this.sessaoIdsessao = sessaoIdsessao;
        changeSupport.firePropertyChange("sessaoIdsessao", oldSessaoIdsessao, sessaoIdsessao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpacienteSessao != null ? idpacienteSessao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacienteSessao)) {
            return false;
        }
        PacienteSessao other = (PacienteSessao) object;
        if ((this.idpacienteSessao == null && other.idpacienteSessao != null) || (this.idpacienteSessao != null && !this.idpacienteSessao.equals(other.idpacienteSessao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.PacienteSessao[ idpacienteSessao=" + idpacienteSessao + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
