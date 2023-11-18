package JavaLab.brand.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

public interface BrandController {

    @DeleteMapping("/api/brands/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteBrand(
        @PathVariable("id")
        UUID id
    );

}
