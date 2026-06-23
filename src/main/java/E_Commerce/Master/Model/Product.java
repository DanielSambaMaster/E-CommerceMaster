package E_Commerce.Master.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product
{

    @Id
    private int id;
    private String nome;
    private String Description;
    private double price;
    private String imageUrl;


}
