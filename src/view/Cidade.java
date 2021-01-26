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
@Table(name = "cidade", catalog = "clinica_crc", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cidade.findAll", query = "SELECT c FROM Cidade c")
    , @NamedQuery(name = "Cidade.findByIdcidade", query = "SELECT c FROM Cidade c WHERE c.idcidade = :idcidade")
    , @NamedQuery(name = "Cidade.findByNome", query = "SELECT c FROM Cidade c WHERE c.nome = :nome")
    , @NamedQuery(name = "Cidade.findByEstadoIdestado", query = "SELECT c FROM Cidade c WHERE c.estadoIdestado = :estadoIdestado")})
public class Cidade implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcidade")
    private Integer idcidade;
    @Column(name = "nome")
    private String nome;
    @Column(name = "estado_idestado")
    private Integer estadoIdestado;

    public Cidade() {
    }

    public Cidade(Integer idcidade) {
        this.idcidade = idcidade;
    }

    public Integer getIdcidade() {
        return idcidade;
    }

    public void setIdcidade(Integer idcidade) {
        Integer oldIdcidade = this.idcidade;
        this.idcidade = idcidade;
        changeSupport.firePropertyChange("idcidade", oldIdcidade, idcidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public Integer getEstadoIdestado() {
        return estadoIdestado;
    }

    public void setEstadoIdestado(Integer estadoIdestado) {
        Integer oldEstadoIdestado = this.estadoIdestado;
        this.estadoIdestado = estadoIdestado;
        changeSupport.firePropertyChange("estadoIdestado", oldEstadoIdestado, estadoIdestado);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcidade != null ? idcidade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cidade)) {
            return false;
        }
        Cidade other = (Cidade) object;
        if ((this.idcidade == null && other.idcidade != null) || (this.idcidade != null && !this.idcidade.equals(other.idcidade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Cidade[ idcidade=" + idcidade + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
