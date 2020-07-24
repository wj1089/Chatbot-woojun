package com.H2O.backend.comments;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
@Entity @Getter @Setter @ToString @NoArgsConstructor
@Table(name = "Comments", uniqueConstraints = {@UniqueConstraint(columnNames = {"comments_no"})})
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comments_id") private Long id;
    @Column(name = "comments_no", nullable = false) private String commentsNo;
    @Column(name = "Content", nullable = false) private String AmbulanceName;
    @Column(name = "creation_date", nullable = false) private String Addr;
    @Column(name = "comments_reply", nullable = false) private String Tel;
    @Column(name = "sequence_no", nullable = false) private String HomePage;
}
