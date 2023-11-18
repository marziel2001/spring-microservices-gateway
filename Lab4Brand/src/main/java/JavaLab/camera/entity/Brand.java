package JavaLab.camera.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "brands")
public class Brand implements Comparable<Brand>, Serializable {

    @Id
    private UUID uuid;

    private String name;

    @Column(name = "year_of_est")
    private Integer yearOfEst;

    private String country;

    @Column(name = "brand_value_dollars")
    private Double brandValueDollars;

    @Override
    public int compareTo(Brand o) {
        if(this.equals(o) && (this.hashCode() == o.hashCode())) {
            return 0;
        }
        else {
            return this.name.toLowerCase().compareTo(o.name.toLowerCase());
        }
    }
}
