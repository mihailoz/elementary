package rs.manhut.elementary.student;

import rs.manhut.elementary.commons.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Student extends AbstractEntity {

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;
}
