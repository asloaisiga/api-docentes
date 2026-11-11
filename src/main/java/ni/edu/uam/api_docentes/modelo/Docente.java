package ni.edu.uam.api_docentes.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="docentes")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Docente {
    @Id
    private Long id;
    private String nombres;
    private String apellidos;
    private String especialidad;
}
