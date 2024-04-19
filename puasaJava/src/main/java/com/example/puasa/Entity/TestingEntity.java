package com.example.puasa.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Setter
@Getter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "testing_entity", schema = "sample")
public class TestingEntity implements Serializable {

    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
    @Column(name = "id_tabel", nullable = false)
    private UUID idTabel;

    @Column(name = "nama", length = 50)
    private String nama;

    @Column(name = "umur", length = 3)
    private Integer umur;
}
