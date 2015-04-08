package com.cadit.formazione.persistence.zeg;

import com.cadit.formazione.persistence.entities.ElementEntity;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author zeggiotti
 */

@Entity
@Table(name="ZEG_ENTITIES")
public class ZegEntity implements Serializable {
    
    private Integer _id;
    private double _re;
    private double _im;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DATA_ENTITIES_SEQ")
    @SequenceGenerator(name="DATA_ENTITIES_SEQ", sequenceName="DATA_ENTITIES_SEQ", allocationSize=100)
    public Integer getId() {
        return _id;
    }

    public void setId(Integer id) {
        this._id = id;
    }

    public double getRe() {
        return _re;
    }

    public void setRe(double _re) {
        this._re = _re;
    }

    public double getIm() {
        return _im;
    }

    public void setIm(double _im) {
        this._im = _im;
    }
}
