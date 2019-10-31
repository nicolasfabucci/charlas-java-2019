package com.eiv.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "barrios")
public class BarrioEntity {

    @EmbeddedId
    private BarrioPkEntity pk;
    
    @OneToOne
    @JoinColumn(name = "localidad_id", referencedColumnName = "localidad_id", 
            nullable = false, insertable = false, updatable = false)
    private LocalidadEntity localidad;
    
    @Column(name = "barrio_id", 
            nullable = false, insertable = false, updatable = false)
    private Long id;
    
    private String nombre;
    
    public BarrioEntity() {
        this.pk = new BarrioPkEntity();
    }

    public BarrioEntity(LocalidadEntity localidad, Long id) {
        super();
        this.localidad = localidad;
        this.id = id;
        this.pk = new BarrioPkEntity(localidad.getId(), id);
    }

    public LocalidadEntity getLocalidad() {
        return localidad;
    }

    public void setLocalidad(LocalidadEntity localidad) {
        this.localidad = localidad;
        this.pk.setLocalidadId(localidad.getId());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        this.pk.setBarrioId(id);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());
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
        BarrioEntity other = (BarrioEntity) obj;
        if (pk == null) {
            if (other.pk != null) {
                return false;
            }
        } else if (!pk.equals(other.pk)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BarrioEntity [pk=" + pk + ", localidad=" + localidad + "]";
    }

}
