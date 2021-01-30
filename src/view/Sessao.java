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
@Table(name = "sessao", catalog = "clinica_crc", schema = "")
@NamedQueries({
    @NamedQuery(name = "Sessao.findAll", query = "SELECT s FROM Sessao s")
    , @NamedQuery(name = "Sessao.findByIdsessao", query = "SELECT s FROM Sessao s WHERE s.idsessao = :idsessao")})
public class Sessao implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idsessao")
    private Integer idsessao;

    public Sessao() {
    }

    public Sessao(Integer idsessao) {
        this.idsessao = idsessao;
    }

    public Integer getIdsessao() {
        return idsessao;
    }

    public void setIdsessao(Integer idsessao) {
        Integer oldIdsessao = this.idsessao;
        this.idsessao = idsessao;
        changeSupport.firePropertyChange("idsessao", oldIdsessao, idsessao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsessao != null ? idsessao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sessao)) {
            return false;
        }
        Sessao other = (Sessao) object;
        if ((this.idsessao == null && other.idsessao != null) || (this.idsessao != null && !this.idsessao.equals(other.idsessao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Sessao[ idsessao=" + idsessao + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
