package com.springrest.springrest.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "course",schema = "test")
public class Course {
    @Id
    private long id;
    private String title;
    private String description;

    public Course(long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

}
