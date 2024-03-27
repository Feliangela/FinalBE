package com.example.catalogservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "movies")
public record Movie(Long id, String name, String genre, String urlStream) {
}
