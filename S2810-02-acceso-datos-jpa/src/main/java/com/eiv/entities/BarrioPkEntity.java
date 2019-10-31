package com.eiv.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BarrioPkEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Column(name = "localidad_id") private long localidadId;
    @Column(name = "barrio_id") private long barrioId;
    
    public BarrioPkEntity() {
    }

    public BarrioPkEntity(long localidadId, long barrioId) {
        super();
        this.localidadId = localidadId;
        this.barrioId = barrioId;
    }

    public long getLocalidadId() {
        return localidadId;
    }

    public void setLocalidadId(long localidadId) {
        this.localidadId = localidadId;
    }

    public long getBarrioId() {
        return barrioId;
    }

    public void setBarrioId(long barrioId) {
        this.barrioId = barrioId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (barrioId ^ (barrioId >>> 32));
        result = prime * result + (int) (localidadId ^ (localidadId >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        BarrioPkEntity other = (BarrioPkEntity) obj;
        if (barrioId != other.barrioId) {
            return false;
        }
        if (localidadId != other.localidadId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BarrioPkEntity [localidadId=" + localidadId + ", barrioId=" + barrioId + "]";
    }
    
}
