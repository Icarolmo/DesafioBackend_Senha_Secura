package backend.brasil.desafios.securepassword.model;


import jakarta.validation.constraints.NotNull;

public record RequestSecure(@NotNull String password) {
}
