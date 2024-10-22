package co.edu.unbosque.viajes_global_back.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.json.bind.Jsonb;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ActivityDTO {

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
    private PackageEntity packageEntity;

    public ActivityDTO() {
        // TODO Auto-generated constructor stub
    }

    public ActivityDTO(int id_activity, String name, String description, int price, String location, String category, String images, int assessment, int stock, PackageEntity packageEntity) {
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