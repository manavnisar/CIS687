package org.syr.cis687.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Table(name = "passenger")
public class Passenger {

    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    // Maintain the ID of the student.
    @OneToOne(mappedBy = "passengerRef", fetch = FetchType.LAZY)
    private Student student;
}
