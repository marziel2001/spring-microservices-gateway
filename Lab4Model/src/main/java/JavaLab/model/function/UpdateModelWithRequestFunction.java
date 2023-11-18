package JavaLab.model.function;

import JavaLab.model.dto.PatchModelRequest;
import JavaLab.model.entity.Model;
import org.springframework.stereotype.Component;

import java.util.function.BiFunction;

@Component
public class UpdateModelWithRequestFunction implements BiFunction<Model, PatchModelRequest, Model> {

    public Model apply(Model entity, PatchModelRequest request) {
        return Model.builder()
            .uuid(entity.getUuid())
            .name(request.getName())
            .announceYear(request.getAnnounceYear())
            .price(request.getPrice())
            .build();
    }
}
