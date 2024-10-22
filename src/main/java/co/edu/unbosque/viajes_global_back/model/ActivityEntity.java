package co.edu.unbosque.viajes_global_back.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "actividades")
@Getter
@Setter
public class ActivityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_activity;
    private String name;
    private String description;
    private int price;
    private String location;
    private String category;
    private String images;
    private int assessment;
    private int stock;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "package_id", referencedColumnName = "id_package", insertable = false, updatable = false)
    private PackageEntity packageEntity;


    public ActivityEntity() {
    }

    public ActivityEntity(int id_activity, String name, String description, int price, String location, String category, String images, int assessment, int stock, PackageEntity packageEntity) {
        this.id_activity = id_activity;
        this.name = name;
        this.description = description;
        this.price = price;
        this.location = location;
        this.category = category;
        this.images = images;
        this.assessment = assessment;
        this.stock = stock;
        this.packageEntity = packageEntity;
    }
}