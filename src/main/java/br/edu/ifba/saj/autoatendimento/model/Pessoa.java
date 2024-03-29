package br.edu.ifba.saj.autoatendimento.model;

import java.time.LocalDate;
import java.util.Set;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Pessoa extends AbstractEntity{
    @Nonnull
    private String firstName;
    
    private String lastName;

    @Email
    @Nonnull
    private String email;

    @Nonnull
    private String phone;
    
    private LocalDate dateOfBirth;

    
    private String occupation;   

     @OneToMany(fetch = FetchType.LAZY, mappedBy = "proprietario")
     private Set<Estabelecimento> estabelecimento;

    // @Enumerated(EnumType.STRING)
    // @ElementCollection(fetch = FetchType.EAGER)
    // @Nonnull
    // private Set<Role> roles;
    




}
