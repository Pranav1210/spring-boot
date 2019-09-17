package org.springsource.restbucks.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
@Getter
@ToString
@EqualsAndHashCode
public class AbstractEntity {
    private final @Id @GeneratedValue(strategy = GenerationType.AUTO) @JsonIgnore Long id;
    private @Version Long version;

    protected AbstractEntity() {
        this.id = null;
    }
}
