package com.cadit.formazione.persistence.tobini;

import javax.persistence.*;
import java.io.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "CLASSE")
public class ClasseEntity implements Serializable{
    
    private Integer _id;
    private String _sezione;
    private Set<StudenteEntity> _studenti;

    public ClasseEntity() {
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

    public String getSezione() {
        return _sezione;
    }

    public void setSezione(String nome) {
        this._sezione = nome;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="OWNER_ID", referencedColumnName="ID")
    public Set<StudenteEntity> getStudenti() {
        return _studenti;
    }
    
    public void add(StudenteEntity stud){
        _studenti.add(stud);
    }

    public void setStudenti(Set<StudenteEntity> _studenti) {
        this._studenti = _studenti;
    }
}
