package com.H2O.backend.board;

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
@Table(name = "Board", uniqueConstraints = {@UniqueConstraint(columnNames = {"board_no"})})
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id") private Long id;
    @Column(name = "board_no", nullable = false) private String boardNo;
    @Column(name = "hospital_star", nullable = false) private String HospitalStar;
    @Column(name = "Title", nullable = false) private String Title;
    @Column(name = "Content", nullable = false) private String Content;
    @Column(name = "creation_date", nullable = false) private String CreationDate;
    @Column(name = "Category", nullable = false) private String Category;

}
