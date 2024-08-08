package com.springboot.Entidad;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Usuario {

    @Size(min=3, max=20, message = "El nombre debe tener entre 3 y 20 caracteres")
    private String nombre;

    @NotBlank(message = "El correo no puede estar en blanco")
    @Email(message = "Ingrese un correo válido")
    private String email;

    @NotNull(message = "La contraseña no puede ser nula")
    @Size(min=8, max=20, message = "La contraseña debe tener entre 8 y 20 caracteres")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", message =
            "La contraseña debe tener al menos 8 caracteres, una mayúscula, una minúscula, " +
                    "un número y un carácter especial")
    private String password;

    @NotNull(message = "La fecha de nacimiento no puede ser nula")
    @Past(message = "La fecha de nacimiento debe ser en el pasado")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;
}
