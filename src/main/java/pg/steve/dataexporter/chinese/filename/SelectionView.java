package pg.steve.dataexporter.chinese.filename;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Steve Chen
 */
@ManagedBean(name = "dataExporterView")
@ViewScoped
public class SelectionView implements Serializable {

    private static final long serialVersionUID = -4461891287669660235L;

    @Getter
    private List<Car> cars;
    @Getter
    @Setter
    private List<Car> selectedCars;
    @Getter
    private String filename;

    @PostConstruct
    public void init() {
        cars = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            cars.add(new Car("id" + i, i));
        }
        try {
            filename = URLEncoder.encode("中文檔名", "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
