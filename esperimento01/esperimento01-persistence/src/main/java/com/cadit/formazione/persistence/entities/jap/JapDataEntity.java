package com.cadit.formazione.persistence.entities.jap;

import com.cadit.formazione.persistence.entities.ElementEntity;
import com.cadit.formazione.persistence.entities.jap.JapElementEntity;
import javax.persistence.*;
import java.io.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "JAP_DATA_ENTITIES")
public class JapDataEntity implements Serializable{
    
    private Integer _id;
    private String _paese;
    private String _nome;
    private Set<JapElementEntity> _elements;
    
    public JapDataEntity() {
        
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DATA_ENTITIES_SEQ")
    @SequenceGenerator(name="DATA_ENTITIES_SEQ", sequenceName="DATA_ENTITIES_SEQ", allocationSize=100)
    public Integer getId() {
        return _id;
    }

    public void setId(Integer id) {
        this._id = id;
    }

    public String getPaese() {
        return _paese;
    }

    public void setPaese(String _paese) {
        this._paese = _paese;
    }

    public String getNome() {
        return _nome;
    }

    public void setNome(String nome) {
        this._nome = nome;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="OWNER_ID", referencedColumnName="ID")
    public Set<JapElementEntity> getElements() {
        return _elements;
    }

    public void setElements(Set<JapElementEntity> _elements) {
        this._elements = _elements;
    }

    
}
