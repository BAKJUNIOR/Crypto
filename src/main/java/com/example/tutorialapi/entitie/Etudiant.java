package com.example.tutorialapi.entitie;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Etudiant {


   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String prenom;
    private String nom;
    private String telephone;
    private String email;
    private String universite;
    private String societe;


   @OneToMany(mappedBy = "etudiant")
  private Set<Tutorial> tutorials;



}
