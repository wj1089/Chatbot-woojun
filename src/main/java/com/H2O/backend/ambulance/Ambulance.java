package com.H2O.backend.ambulance;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "Ambulance", uniqueConstraints = {@UniqueConstraint(columnNames = {"ambulance_name"})})
public class Ambulance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ambulance_id") private Long id;
    @Column(name = "ambulance_name", nullable = false) private String AmbulanceName;
    @Column(name = "Addr", nullable = false) private String Addr;
    @Column(name = "Tel", nullable = false) private String Tel;
    @Column(name = "HomePage", nullable = false) private String HomePage;
    @Column(name = "Count", nullable = false) private int Count;


}
