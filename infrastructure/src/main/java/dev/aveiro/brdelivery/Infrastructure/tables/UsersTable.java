package dev.aveiro.brdelivery.Infrastructure.tables;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_users")
public class UsersTable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid", length = 36, updatable = false, unique = true)
    private UUID uuid;

    @Column(name = "phone_number", nullable = false, unique = true)
    private String phoneNumber;
}
