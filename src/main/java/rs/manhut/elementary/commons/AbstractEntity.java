package rs.manhut.elementary.commons;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Objects;

@MappedSuperclass
public abstract class AbstractEntity extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass().equals(this.getClass())) {
            return ((AbstractEntity) obj).id.equals(this.id);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
