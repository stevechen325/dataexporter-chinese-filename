package pg.steve.dataexporter.chinese.filename;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Steve Chen
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car implements Serializable {

    private static final long serialVersionUID = -5802098731782051739L;
     
    public String id;
    public int price;
}
