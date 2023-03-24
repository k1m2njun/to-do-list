package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) // title을 생략할 수 없습니다.
    private String title;
    @Column(name = "todoOrder", nullable = false)
    private Long order;
    @Column(nullable = false)
    private Boolean completed;
}
